from csv import DictReader
from collections import defaultdict

def read_er_maps():
    inf = file('entity_rule_mapping.txt','r')
    rows = DictReader(inf,dialect='excel-tab')
    r2e = defaultdict(list)
    for row in rows:
        rule = row['ACMG rule']
        entity = row['Entity']
        r2e[rule].append(entity)
    inf.close()
    return r2e

def invert(d):
    di = defaultdict(list)
    for dk in d:
        dvs = d[dk]
        for dv in dvs:
            di[dv].append(dk)
    return di
        
    
def read_entities():
    entities = defaultdict(dict)
    inf = file('AssertionEAV.txt','r')
    rows = DictReader(inf,dialect='excel-tab')
    for row in rows:
        e = row['Entity']
        a = row['Attribute']
        r = row['Required/Optional']
        d = row['DataType']
        entities[e][a] = (r,d)
    inf.close()
    return entities

def compare(entities,r2e):
    eset = set(entities.keys())
    r2eset = set()
    for elist in r2e.values():
        r2eset.update( elist )
    diff = eset.difference(r2eset)
    if len(diff) > 0:
        print 'Here are entities that are not used in rules:'
        for d in diff:
            print '*%s*' % d
    diff = r2eset.difference(eset)
    if len(diff) > 0:
        print 'Here are entities that are in rules but undefined:'
        for d in diff:
            print '*%s*' % d

def go():
    entities = read_entities()
    rule2entity = read_er_maps()
    compare(entities,rule2entity)
    inf = file('acmg_statements.txt','r')
    for line in inf:
        x = line.index(' ')
        code = line[:x]
        statement = line[x+1:-1]
        write_rule_page(code,statement,rule2entity[code])
    entity2rule = invert(rule2entity)
    for entity in entities:
        write_entity_page(entity,entities[entity],entity2rule[entity])
        
def parse_code(code):
    if code.startswith('P'):
        i = 'Pathogenic'
    elif code.startswith('B'):
        i = 'Benign'
    else:
        print '?',code
        exit()
    if code[1] == 'S':
        s = 'Strong'
    elif code[1:3] == 'VS':
        s = 'Very Strong'
    elif code[1] == 'M':
        s = 'Moderate'
    elif code[1] == 'P':
        s = 'Supporting'
    elif code[1] == 'A':
        s = 'Stand-alone'
    else:
        print '?',code
        exit()
    return i,s

#change to a template?
def write_rule_page(code,statement,entities):
    indication, strength = parse_code(code)
    outf = file('acmg/%s.md' % code,'w')
    outf.write('---\n')
    outf.write('title: ACMG2015-%s\n' % code)
    outf.write('layout: conceptual\n')
    outf.write('model: assertion\n')
    outf.write('description: FILLIN\n')
    outf.write('criteria set: ACMG2015\n')
    outf.write('indication: %s\n' % indication)
    outf.write('strength: %s\n' % strength)
    outf.write('---\n\n')
    outf.write('Rule Statement\n--------------\n')
    outf.write('%s\n' % statement)
    outf.write('\nData Elements\n-------------\n')
    for ent in entities:
        outf.write('* [%s]\n' % ent)
    outf.write('\nScope and Usage\n---------------\n')
    outf.write('\nExamples\n--------\n')
    outf.close()

#change to a template?
def write_entity_page(entity,attributes,rules):
    ename = ''.join(entity.split())
    outf = file('entities/%s.md' % ename,'w')
    outf.write('---\n')
    outf.write('title: %s\n' % entity)
    outf.write('layout: conceptual\n')
    outf.write('model: assertion\n')
    outf.write('description: \n')
    outf.write('---\n\n')
    outf.write('\nACMG Variant Pathogenicity Guidelines\n-------------------------------------\n')
    for rul in rules:
        outf.write('* [%s]\n' % rul)
    outf.write('\nScope and Usage\n---------------\n')
    outf.write('\nAttributes\n----------\n')
    for att in attributes:
        req,dtype = attributes[att]
        outf.write('    %s: %s,%s\n' % (att,dtype,req))
    outf.write('\nExamples\n--------\n')
    outf.close()



if __name__ == '__main__':
    go()

from csv import DictReader
from collections import defaultdict

def read_er_maps():
    inf = file('entity_rule_mapping.txt','r')
    rows = DictReader(inf,dialect='excel-tab')
    r2e = defaultdict(list)
    notes = {}
    for row in rows:
        rule = row['ACMG rule'].strip()
        entity = row['Entity'].strip()
        note = row['Notes']
        #if entity == 'MolecularEffect':
        #    print '*%s*' % rule
        if note is None:
            note = ''
        r2e[rule].append(entity)
        notes[(entity,rule)] = note
    inf.close()
    print r2e['PM4']
    return r2e,notes

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
    rule2entity,notes = read_er_maps()
    compare(entities,rule2entity)
    outf = file('DMWG_ACMG_Criterion_Concordance.txt','w')
    outf.write('ACMG Code\tACMG Statement\tEvidence Type\tET attributes\tQuestions/Notes\n')
    inf = file('acmg_statements.txt','r')
    for line in inf:
        x = line.index(' ')
        code = line[:x]
        statement = line[x+1:-1]
        res = rule2entity[code]
        first = True
        for e in res:
            if first:
                outf.write('%s\t%s\t' % (code,statement))
                first = False
            else:
                outf.write('\t\t')
            outf.write('%s\t' % e)
            anames = entities[e].keys()
            #print e
            #print anames
            if len(anames) == 0:
                outf.write('\t')
            else:
                outf.write('%s\t' % ','.join(anames))
            note = notes[(e,code)]
            outf.write('%s\n' % note)
    outf.close()
    #    write_rule_page(code,statement,rule2entity[code])
    #entity2rule = invert(rule2entity)
    #for entity in entities:
    #    write_entity_page(entity,entities[entity],entity2rule[entity])
        

if __name__ == '__main__':
    go()

def go():
    inf = file('acmg_statements.txt','r')
    for line in inf:
        x = line.index(' ')
        code = line[:x]
        statement = line[x+1:-1]
        write_page(code,statement)
        
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
def write_page(code,statement):
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
    outf.write('\nScope and Usage\n---------------\n')
    outf.write('\nExamples\n--------\n')

if __name__ == '__main__':
    go()

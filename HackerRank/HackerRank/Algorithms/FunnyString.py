# Enter your code here. Read input from STDIN. Print output to STDOUT
"""
acxz
zxca
ac zx
cx xc
xz ca
"""
count = input()
while count:
    count -= 1
    str = raw_input()
    rev = str[::-1]
    values = []
    for i in range(len(str) - 1):
        str_diff = abs(ord(str[i]) - ord(str[i+1]))
        rev_diff = abs(ord(rev[i]) - ord(rev[i+1]))
        # print  str_diff, rev_diff
        values.append(str_diff is rev_diff)
    # print values
    result = reduce(lambda x,y: x and y, values)
    # print result
    if result:
        print "Funny"
    else:
        print "Not Funny"

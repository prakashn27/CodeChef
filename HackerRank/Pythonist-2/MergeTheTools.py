# Enter your code here. Read input from STDIN. Print output to STDOUT
from sets import Set
s = raw_input()
k = input()
if k == 1: # cornor case for k = 1
    # print all the elements
    for i in s:
        print i
else:
    l = len(s)
    count = l/3
    j = 0
    arr = []
    for i in range(count):
        arr.append(s[j:j+k])
        j += k

    for ele in arr:
        s = Set();
        res = ""
        #    print ele
        for i in range(k):
            if ele[i] in s:
                continue;
                #res = ele[:i] + ele[i + 1:] # remove that element
            else:
                s.add(ele[i])
                res += ele[i]
        s.clear()
        print res

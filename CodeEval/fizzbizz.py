"""Sample code to read in test cases:
"""
import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    # ignore test if it is an empty line
    # 'test' represents the test case, do something with it
    # ...
    # ...
    [x, y, num] = map(int, test.split())
    res = ""
    for i in range(1, num + 1):
        if i % x == 0:
            if i % y == 0:
                res += "FB "
            else:
                # only div by x
                res += "F "
        elif i % y == 0:
            res += "B "
        else:
            res += str(i) + " "
    print res

test_cases.close()
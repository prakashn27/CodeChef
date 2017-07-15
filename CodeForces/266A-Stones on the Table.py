'''input
4
BRBG
'''
# from operator import itemgetter, attrgetter
# from functools import partial # create closures
# import bisect as bi # binary search algorith
# import itertools as it
# from collections import 

# Author: prakashn
# Link: 

def run():
    input()
    c = raw_input()
    result = 0
    for i in range(len(c)-1):
        if c[i] == c[i+1]:
            result += 1
        # print i, c[i], c[i+1]
    print(result)

if __name__ == "__main__":
    run()
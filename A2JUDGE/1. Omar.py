'''input
5
22 12
23 12
1 1
2 3
100 100
'''
from operator import itemgetter, attrgetter
from functools import partial # create closures
import bisect as bi # binary search algorith
import itertools as it
# from collections import 

# Author: prakashn
# Link: https://a2oj.com/p?ID=1

def run():
    t = int(input())
    for i in range(t):
    	lst = map(int, raw_input().split())
    	print lst[0]+lst[1]
    

if __name__ == "__main__":
    run()
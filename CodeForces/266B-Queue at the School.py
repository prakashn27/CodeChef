'''input
5 1
BGGBG
'''
from operator import itemgetter, attrgetter
from functools import partial # create closures
import bisect as bi # binary search algorith
import itertools as it
# from collections import 

# Author: prakashn
# Link: 

def run():
    m, n = tuple(map(int, raw_input().split()))
    lst = list(raw_input())
    print(m, n)
    for x in range(n-1,m-1):
    	if lst[x] == 'G':
    		t = lst[x]
    		lst[x] = lst[x+1]
    		lst[x] = t
    print("".join(lst))

if __name__ == "__main__":
    run()
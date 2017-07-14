'''input
PLACE THE INPUT
'''
from operator import itemgetter, attrgetter
from functools import partial # create closures
import bisect as bi # binary search algorith
import itertools as it
# from collections import 

# Author: prakashn
# Link: 

def run():
    m = [1, 2, 3, 4, 4, 3, 1]
    _max = max(m)
    for val in it.takewhile(lambda x: x < _max, m):
        print val
    for val in it.takewhile(lambda x: x < _max, m[::-1]):
        print val        
    

if __name__ == "__main__":
    run()
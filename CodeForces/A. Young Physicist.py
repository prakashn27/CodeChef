'''input
3
4 1 7
-2 4 -1
1 -5 -3
'''
#### LIBRARIES
# from operator import itemgetter, attrgetter
# from functools import partial # create closures
# import bisect as bi # binary search algorith
# import itertools as it
# from collections import 

# Author: prakashn
# Link: http://codeforces.com/problemset/problem/69/A

def run():
    t = int(input())
    x = 0
    y = 0
    z = 0
    for i in range(t):
    	lst = map(int, raw_input().split())
    	# print lst
    	x += lst[0]
    	y += lst[1]
    	z += lst[2]
    if x == 0 and y == 0 and z == 0:
    	print("YES")
    else:
    	print("NO")
    

if __name__ == "__main__":
    run()
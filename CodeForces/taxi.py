__author__ = 'prakashn'
"""
http://codeforces.com/problemset/problem/158/B
"""

count = input()

groups = map(int, raw_input().split(' '))

total = reduce(lambda x, y: x + y, groups)

result = total / 4
if total % 4 != 0:
    result += 1

print result

# Enter your code here. Read input from STDIN. Print output to STDOUT
"""
You are given a string S. 
The string consists of lowercase alphabets.

Your task is to find top three most common characters in the string S.

Input Format

Single line containing string S.

Constraints

3<len(S)<104
Output Format

Print the most common characters along with their count of occurences in three lines.
Output must sorted in descending order of count of occurences.
If count of occurences is same then sort in ascending order of characters.

"""


import operator

s = raw_input()
hm = {}
for i in range(len(s)):
    # print s[i]
    if s[i] in hm:
        hm[s[i]] += 1
    else:
        # add a new entry into hm
        hm[s[i]] = 1

# sorted_hm = sorted(hm.items(), key = operator.itemgetter(1), reverse=True)
hm_items = hm.items()
hm_items.sort(key = lambda x: [-x[1], x[0]])
for i in range(3):
    if i < len(hm_items):
        print "{0} {1}".format(hm_items[i][0], hm_items[i][1])


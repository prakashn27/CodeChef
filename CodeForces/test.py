# your code goes here
from collections import defaultdict

wq = ["abat","baba","atan","atal"]

a = []
for row in wq:
	b = []
	for x in row:
		b.append(x)
	a.append(b)

class TrieNode(object):
    def __init__(self):
        self.words = []
        self.children = [None]*26 # list of trie node

class Trie(object):
    def __init__(self, words):
        self.root = TrieNode()
        ALPHABETS = "abcdefghijklmnopqrstuvwxyz"
        for word in words:
            cur = self.root
            for w in word:
                cur.words.append(word)
                ind = ALPHABETS.index(w)
                if cur.children[ind] is None:
                    cur.children[ind] = TrieNode()
                cur = cur.children[ind]

t = Trie(wq) # put in trie


#
# def is_word_square(a):
# 	for i in range(len(a)):
# 		for j in range(i, len(a)):
# 			if a[i][j] != a[j][i]:
# 			    return False
# 	return True
#
# print(is_word_square(a))


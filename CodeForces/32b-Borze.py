'''input
--.
'''
inp = raw_input()
a = {}
a['.'] = '0'
a['-.'] = '1'
a['--'] = '2'
res = ""
i = 0
while i < len(inp):
	if inp[i] == '.':
		res += '0'
	elif inp[i] == '-':
		if inp[i+1] == '.':
			res += '1'
		else:
			res += '2'
		i += 1
	i += 1
print(res)
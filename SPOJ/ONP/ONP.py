t = int(input())

while t:
	t -= 1
	exp = []
	s = input()
	res = ""
	for ch in s:
		if ch == "(": continue
		elif ch in ["+", "-", "*", "/", "^"]:
			exp.append(ch)
		elif ch == ")":
			res += exp.pop()
		else:
			res += ch
	print(res)

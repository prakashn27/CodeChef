a = []
for i in range(5):
    b = input().split()
    a.append(b)
# print(a)
x = 0
y = 0
for i,row in enumerate(a):
    if '1' in row:
    	# print (i, row.index('1'))
    	x = i
    	y = row.index('1')
    	break;
print(abs(x-2) + abs(y-2))

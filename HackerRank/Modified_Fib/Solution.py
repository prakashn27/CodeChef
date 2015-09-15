# Enter your code here. Read input from STDIN. Print output to STDOUT
a, b, n = map(int, raw_input().split())
c = 0
for i in range(2, n):
    c = b * b + a
    a = b
    b = c
print c

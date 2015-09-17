# Enter your code here. Read input from STDIN. Print output to STDOUT

s = raw_input()
res = ""
for i in range(len(s)):
    ch = s[i]
    if ch.islower():
        res += ch.upper()
    else:
        res += ch.lower()

print res
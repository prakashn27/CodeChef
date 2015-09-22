# Enter your code here. Read input from STDIN. Print output to STDOUT
str = raw_input()
#remove the spaces
str = str.replace(' ', '')
str = str.lower()
char_arr = [0] * 26

for i in range(len(str)):
    char_arr[ord(str[i]) - 97] += 1
# print char_arr
isPangram = True
for i in range(26):
    if char_arr[i] == 0:
        isPangram = False
        break
if isPangram:
    print "pangram"
else:
    print "not pangram"
    



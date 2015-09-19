# Enter your code here. Read input from STDIN. Print output to STDOUT
"""
Problem Statement

Given a word w, rearrange the letters of w to construct another word s in such a way that s is lexicographically greater than w. In case of multiple possible answers, find the lexicographically smallest one.

Input Format

The first line of input contains t, the number of test cases. Each of the next t lines contains w.

Constraints 
1≤t≤105 
1≤|w|≤100 
w will contain only lower-case English letters and its length will not exceed 100.

Output Format

For each testcase, output a string lexicographically bigger than w in a separate line. In case of multiple possible answers, print the lexicographically smallest one, and if no answer exists, print no answer.
"""
count = input()

while count:
    count -= 1
    str = raw_input()
    values = []
    for i in range(len(str)):
        values.append(ord(str[i]) - 97)
    last_val = values[len(values) - 1]
    print values
    # print last_val
    # compare the last index with the rest to find the next greatest value 
    # swap the index of next greatest value with last element
    res_val = last_val
    biggerFound = False
    for i in range(len(str) - 2, -1, -1): # start from last beforeth Element
        if values[i] < last_val:
            res_val = values[i]
            biggerFound = True
            break;
    if biggerFound:
        first_index = len(str) - 1
        second_index = values.index(res_val)
        # swap two indexes in string to get the result
        arr = list(str)
        temp = arr[first_index]
        arr[first_index] = arr[second_index]
        arr[second_index] = temp
        print "".join(arr)
    else:
        print "no answer"
    
        
    
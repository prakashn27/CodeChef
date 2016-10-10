####SPOJ Problem Set (classical)####

####5. The Next Palindrome#####

Problem code: [PALIN](http://www.spoj.com/problems/PALIN/)



 
A positive integer is called a palindrome if its representation in the decimal system is the same when read from left to right and from right to left. For a given positive integer K of not more than 1000000 digits, write the value of the smallest palindrome larger than K to output. Numbers are always displayed without leading zeros.

_Input_

The first line contains integer t, the number of test cases. Integers K are given in the next t lines.

_Output_

For each K, output the smallest palindrome larger than K.

_Example_
```
Input:
2
808
2133

Output:
818
2222
```
_ALGORITHM USED:_
let i and j be the indices pointing to the center element(in case of odd) or elements(in case of even)
1. Ignore the part where elements in the indices are equal.
 1. if input is palindrome then add plus 1 to the middle element to get the next palindrome and exit. 
 2. if input is not a palindrome then left side is not equal to the right side. copy left side to right side to make it a paindrome.
  1. if the new element formed is greater than the original element then the new element is the answer
  2. if the new element formed is greater than the original element then add 1 to make it a greater palindrome.

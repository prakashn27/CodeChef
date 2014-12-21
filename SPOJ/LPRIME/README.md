####SPOJ Problem Set (classical)

####5703. Primes of Lambda

Problem code: [LPRIME](http://www.spoj.com/problems/LPRIME/)



 
Lambda checks primality in a weird way. He checks the following two conditions.

All the digits of the number in the decimal system are primes or one, namely 1, 2, 3, 5 or 7.
It isn't a multiple of 2, 3, 5, 7, 11 or 47 (Why 47? I don't know).
In order to estimate the accuracy of his approach, he asks you to calculate the number of decimal integers of a specific length that satisfy the conditions.

Input

The first and only line contains an integer n, denoting the length of integers.

Output

The only line contains the answer modulo 9973.

Example
```
Input:
1

Output:
1

Input:
2

Output:
8

Input:
4

Output:
182

Input:
1000000000

Output:
4589
```
_Constraints_

1 <= n <= 109
In 50% of testcases, n <= 100

_Challenges:_
* Permutation class is implemented with char array and it does not seem to hold good for large values if n.
  getting java.lang.OutOfMemoryError. 

_Ref_:

[Permutations_with_repetition(Java)](http://en.literateprograms.org/Permutations_with_repetition_(Java)#chunk def:fill)

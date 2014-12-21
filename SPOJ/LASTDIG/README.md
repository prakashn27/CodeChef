####SPOJ Problem Set (classical)####

####3442. The last digit#####

Problem code: [LASTDIG](http://www.spoj.com/problems/LASTDIG/)



 
Nestor was doing the work of his math class about three days but he is tired of make operations a lot and he should deliver his task tomorrow. His math’s teacher gives two numbers a and b. The problem consist in find the last digit of the potency of base a and index b. Help Nestor with his problem. You are given two integer numbers: the base a (0 <= a <= 20) and the index b (0 <= b <= 2,147,483,000), a and b both are not 0. You have to find the last digit of a^b.

_Input_

The first line of input contains an integer t, the number of test cases (t <= 30). t test cases follow. For each test case will appear a and b separated by space.

_Output_

For each test case output an integer per line representing the result.

_Example_
```
Input:
2
3 10
6 2

Output:
9
6
```

Chalenges:
> 1. Implemented using [Modular Exponentiation](http://en.wikipedia.org/wiki/Modular_exponentiation)
> 2. Contains 4 implementation of different methods. 

>> Implementaion
>> * Naive Implementation
>> * Memory-efficient method
>> * Right-to-left binary method
>> * Right-to-left binary method with reduced running time

Reference:
> [Java implemtation of MOD POWER](http://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#modPow(java.math.BigInteger,%20java.math.BigInteger))

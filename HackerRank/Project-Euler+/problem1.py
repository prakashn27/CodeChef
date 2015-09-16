"""
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.
"""
# Enter your code here. Read input from STDIN. Print output to STDOUT
count = input()
for i in range(count):
    num = input()
    """
    sum = 0
    for j in range(1, num):
        if j % 5 == 0 or j % 3 == 0:
            sum += j
    print sum
    """
    print sum(list(filter(lambda a : a % 3 == 0 or a % 5 == 0, range(1, num))))

"""
Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.
"""
class Solution:
    # @param A : list of integers
    # @return a list of integers
    def plusOne(self, A):
        
        zeroList = map(lambda x: x == 0, A)
        for i in range(len(zeroList)):
        	if not zeroList[i]:
        		break
        	A.remove(0)
        if len(A) == 0:
            # all the elements are 0
            return [1]
        value = int("".join(map(str, A)))
        result = value + 1
        return list(str(result))

A = [1, 2, 3, 3, 5]
class Solution:
    # @param A : tuple of integers
    # @return a list of integers
    def repeatedNumber(self, A):
        sumOfA = 0
        sumOfA2 = 0
        n = 0
        for a in A:
            sumOfA2 += a*a
            sumOfA += a
            n += 1
        sumOfN = n*(n+1)/2
        retA = sumOfN - sumOfA
        
        retB = (sumOfN*(2*n+1)/3 - sumOfA2)/retA
        x = (retB-retA)/2
        return [x,x + retA]
    def repeatedNumber_using_xor(self, A):
			xor = reduce(lambda x, y: x ^ y, A)
			# prod = reduce(lambda x, y: x * y, A)

			# actual produce
			n = len(A)
			arr = range(1, n+1)
			for i in arr:
			    xor ^= i
			print xor
			set_bit_no = xor & -(xor - 1)
			x, y = 0, 0
			for i in A:
				if set_bit_no & i:
					x ^= i
				else:
					y ^= i

			for i in arr:
				if set_bit_no & i:
					x ^= i
				else:
					y ^= i
			return x, y

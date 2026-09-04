class Solution(object):
    def alternateDigitSum(self, n):
        sum = 0
        sign = 1
        rev = 0
        while n:
            ld = n % 10
            rev = rev *10 + ld 
            n = n // 10
        while rev > 0 :
            ld = rev % 10
            sum = sum + ld *sign
            sign = -sign
            rev = rev // 10
        return sum

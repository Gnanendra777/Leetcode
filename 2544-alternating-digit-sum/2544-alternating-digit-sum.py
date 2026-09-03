class Solution(object):
    def alternateDigitSum(self, n):
      
        sum = 0
        sign = 1
        while n > 0 :
            ld = n % 10
            sum = sum + ld * sign
            sign = -sign
            n = n // 10
        return sum * (-sign)

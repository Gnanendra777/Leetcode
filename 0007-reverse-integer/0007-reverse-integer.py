class Solution(object):
    def reverse(self, x):
        negative = 0
        if x < 0:
            x = -x
            negative = x
        res = 0
        while x > 0:
             last_digit = x % 10
             res = res * 10 + last_digit
             x = x // 10
        if res > 2**31 -1:
            return 0
        if negative > 0:
            return  -(res)
        return res
class Solution:
    def lastInteger(self, n: int) -> int:
        start = 1
        dif = 1
        is_left =  True
        
        while n > 1:
            if n % 2 == 0 and is_left == False:
               start = start +dif
            dif = dif * 2
            n = (n+1) // 2
            is_left = not is_left
        return start






















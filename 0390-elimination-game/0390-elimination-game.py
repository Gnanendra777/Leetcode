class Solution:
    def lastRemaining(self, n: int) -> int:
        start = 1
        dif = 1
        is_left =  True
        # number of digits decreasing
        while n > 1:
            if not(n % 2 == 0 and is_left == False):
               start = start +dif
            dif = dif * 2
            n = n // 2
            is_left = not is_left
        return start

            
            
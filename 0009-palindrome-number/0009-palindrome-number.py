class Solution(object):
    def isPalindrome(self, x):
        if x <0:
            return False
        original = x
        result =0

        while(x >0):
            id = x %10
            result = (result *10)+id
            x = x//10
        return original == result
        
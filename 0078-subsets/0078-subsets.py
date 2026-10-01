class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        res =[]
        soln =[]
        def solve(start):
            # base case
            if start == len(nums):
                res.append(soln[:])
                return
        # not take
            solve(start +1)

            # take
            soln.append(nums[start])
            solve (start + 1)
            soln.pop()

        solve(0)
        return res



class Solution:
    def subsetsWithDup(self, nums: list[int]) -> list[list[int]]:
        res = []
        soln = []
        nums.sort()
        def solve(start):
            res.append(soln[:])
            for i in range(start, len(nums)):
                if i > start and nums[i] == nums[i - 1]:
                    continue

                soln.append(nums[i])
                solve(i + 1)
                soln.pop()

        solve(0)
        return res
        
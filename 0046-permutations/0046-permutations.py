class Solution:
    def permute(self, nums: list[int]) -> list[list[int]]:
        res =[]
        # helper function
        def solve(start):
            # basecase
            if len(nums) == start:
                res.append(nums[:])
                return

            for i in range(start,len(nums)):
                nums[i],nums[start] =nums[start],nums[i]
                solve(start +1)
                nums[i],nums[start] =nums[start],nums[i]

        solve(0)
        return res
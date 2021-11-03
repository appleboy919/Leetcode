class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        l, r = 0, len(nums)-1
        n = len(nums)
        ans = [None] * n
        idx = n-1
        while l <= r:
            if l == r:
                ans[idx] = nums[l] * nums[l]
                break
            if abs(nums[l]) > abs(nums[r]):
                ans[idx] = nums[l] * nums[l]
                l += 1
            else:
                ans[idx] = nums[r] * nums[r]
                r -= 1
            idx -= 1
        return ans

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        t = -101
        n = len(nums)
        while i < n:
            if t == nums[i]:
                nums.remove(t)
                n -= 1
            else:
                t = nums[i]
                i += 1
        return n

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        retIdx = 0
        for i in range(1, n):
            if nums[retIdx] < nums[i]:
                retIdx += 1
                nums[retIdx] = nums[i]
        return retIdx + 1

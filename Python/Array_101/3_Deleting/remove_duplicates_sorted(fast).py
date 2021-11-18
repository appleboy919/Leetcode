class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0 or n == 1:
            return n
        maxV = nums[n-1]
        i = 0
        tIdx = i
        while i < n:
            t = nums[i]
            for j in range(tIdx+1, n):
                if t < nums[j]:
                    i += 1
                    nums[i] = nums[j]
                    tIdx = j
                    break
            if nums[i] == maxV:
                break
        return i + 1

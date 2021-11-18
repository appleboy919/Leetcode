class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        n = len(nums)
        ret = n
        firstIdx = -1
        for i in range(n):
            if nums[i] == val:
                ret -= 1
                if firstIdx == -1:
                    firstIdx = i
        if firstIdx != -1:
            movIdx = firstIdx
            for i in range(firstIdx, ret):
                for j in range(movIdx+1, n):
                    if nums[j] != val:
                        nums[i] = nums[j]
                        movIdx = j
                        break
            
        return ret
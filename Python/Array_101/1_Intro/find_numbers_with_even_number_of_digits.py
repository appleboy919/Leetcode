class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        ans = 0
        for i in nums:
            x = str(i)
            if len(x) % 2 == 0:
                ans += 1
        return ans

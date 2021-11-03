class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ans = 0
        temp = 0
        con_flag = False
        for i in nums:
            if i == 0:
                if ans < temp:
                    ans = temp
                temp = 0
            else:
                temp += 1
        if ans < temp:
            ans = temp
        return ans

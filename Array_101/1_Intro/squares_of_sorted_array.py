class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        pos = []
        neg = []
        for i in nums:
            if i>=0:
                pos.append(i**2)
            else:
                neg.append(i**2)
        if len(pos) == len(nums):
            return pos
        if len(neg) == len(nums):
            return neg[::-1]
        pos_idx = 0
        neg_idx = len(neg) - 1
        ans = [None]*len(nums)
        for i in range(len(nums)):
            if pos[pos_idx] < neg[neg_idx]:
                ans[i] = pos[pos_idx]
                pos_idx += 1
                if pos_idx == len(pos):
                    for j in range(i+1, len(nums)):
                        ans[j] = neg[neg_idx]
                        neg_idx -= 1
                    break
            else:
                ans[i] = neg[neg_idx]
                neg_idx -= 1
                if neg_idx == -1:
                    for j in range(i+1, len(nums)):
                        ans[j] = pos[pos_idx]
                        pos_idx += 1
                    break
        return ans
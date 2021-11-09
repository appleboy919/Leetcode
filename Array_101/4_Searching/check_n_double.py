class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        n = len(arr)
        for i, v in enumerate(arr):
            if v*2 in arr[i+1:] or v/2 in arr[i+1:]:
                return True
        return False

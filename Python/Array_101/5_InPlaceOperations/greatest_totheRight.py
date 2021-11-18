class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        tMax = -1
        t = -1
        for i in range(len(arr)-1, -1, -1):
            t = arr[i]
            arr[i] = tMax
            if tMax < t:
                tMax = t
        return arr

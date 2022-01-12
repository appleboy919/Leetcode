class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        n = len(arr)
        if n < 3:
            return False
        up = False
        down = False
        for i in range(1, n):
            if arr[i-1] == arr[i]:
                return False
            if up == 0:
                if arr[i-1] < arr[i]:
                    up += 1
                else:
                    return False
            elif down == 0:
                if arr[i-1] > arr[i]:
                    down += 1
            else:
                if arr[i-1] < arr[i]:
                    return False
        if down != 1:
            return False
        return True

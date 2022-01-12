class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        n = len(arr)
        t = []
        t_len = 0
        for i in range(n):
            if t_len == n:
                break
            t.append(arr[i])
            t_len += 1
            if arr[i] == 0:
                t.append(arr[i])
                t_len += 1
        for i in range(n):
            arr[i] = t[i]

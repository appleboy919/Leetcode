class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        merged = [0] * (m+n)
        i1, i2 = 0, 0
        for i in range(m+n):
            if i1 == m:
                for j in range(i, m+n):
                    merged[j] = nums2[i2]
                    i2 += 1
                break
            if i2 == n:
                for j in range(i, m+n):
                    merged[j] = nums1[i1]
                    i1 += 1
                break
            if nums1[i1] < nums2[i2]:
                merged[i] = nums1[i1]
                i1 += 1
            elif nums1[i1] >= nums2[i2]:
                merged[i] = nums2[i2]
                i2 += 1
        for i in range(m+n):
            nums1[i] = merged[i]

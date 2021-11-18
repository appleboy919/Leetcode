class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n == 0:
            return
        if m == 0:
            nums1[:] = nums2
            return
        i1 = m-1
        i2 = n-1
        for i in range(m+n-1, -1, -1):
            if i1 < 0:
                for j in range(i, -1, -1):
                    nums1[j] = nums2[i2]
                    i2 -= 1
                break
            if i2 < 0:
                for j in range(i, -1, -1):
                    nums1[j] = nums1[i1]
                    i1 -= 1
                break
            if nums1[i1] > nums2[i2]:
                nums1[i] = nums1[i1]
                i1 -= 1
            else:
                nums1[i] = nums2[i2]
                i2 -= 1

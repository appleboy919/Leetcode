class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx, i, j;
        idx = m+n-1;
        i = m-1;
        j = n-1;
        while(idx>=0 && i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i];
                i --;
            }
            else {
                nums1[idx] = nums2[j];
                j --;
            }
            idx --;
        }
        if(j>=0)
            for(int k=idx;k>=0;k--) {
                nums1[k] = nums2[j];
                j --;
            }
    }
}

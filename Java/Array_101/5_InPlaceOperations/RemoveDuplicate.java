public class RemoveDuplicate {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int t, k, n;
            n = nums.length;
            k = 0;
            t = -101;
            for(int i=0;i<n;i++) {
                if(t<nums[i]) {
                    t = nums[i];
                    nums[k] = nums[i];
                    k ++;
                }
            }
            return k;
        }
    }
}

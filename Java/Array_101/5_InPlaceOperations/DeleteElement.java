public class DeleteElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int k = n;
            int r = n - 1;
            for (int i = 0; i < n; i++) {
                if (nums[i] == val) {
                    while (r > i) {
                        if (nums[r] != val) {
                            nums[i] = nums[r];
                            r--;
                            break;
                        }
                        r--;
                    }
                    k--;
                }
            }
            return k;
        }
    }
}

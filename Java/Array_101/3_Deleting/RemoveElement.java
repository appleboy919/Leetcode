public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int ret = n;
            int t;
            for (int i = 0; i < n; i++) {
                if (nums[i] == val) {
                    for (int j = n - 1; j > i; j--) {
                        nums[j - 1] = nums[j];
                    }
                    i++;
                    ret--;
                }
            }
            return ret;
        }
    }
}

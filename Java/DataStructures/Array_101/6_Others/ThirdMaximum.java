import java.util.Arrays;

public class ThirdMaximum {
    class Solution {
        public int thirdMax(int[] nums) {
            Arrays.sort(nums);
            int t = nums[nums.length - 1];
            int idx = 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] != t) {
                    t = nums[i];
                    idx++;
                    if (idx == 3)
                        break;
                }
            }
            if (idx < 3)
                return nums[nums.length - 1];
            return t;
        }
    }
}
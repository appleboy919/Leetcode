public class MaxConsecutives {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int z = 0;
            int ones[] = { 0, 0 };
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    ones[z]++;
                    if (ones[(z + 1) % 2] > ans)
                        ans = ones[(z + 1) % 2];
                    z = (z + 1) % 2;
                    ones[z] = 0;
                } else {
                    ones[0]++;
                    ones[1]++;
                }
            }
            int t = ones[z] > ones[(z + 1) % 2] ? ones[z] : ones[(z + 1) % 2];
            return ans > t ? ans : t;
        }
    }

}

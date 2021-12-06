public class SortedSquaredNumber {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int l, r, n;
            n = nums.length;
            int squares[] = new int[n];
            l = 0;
            r = n - 1;
            for (int i = r; i >= 0; i--) {
                if (nums[l] * nums[l] > nums[r] * nums[r]) {
                    squares[i] = nums[l] * nums[l];
                    l++;
                } else {
                    squares[i] = nums[r] * nums[r];
                    r--;
                }
            }
            return squares;
        }
    }
}

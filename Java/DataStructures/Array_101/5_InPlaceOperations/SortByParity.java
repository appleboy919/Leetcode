public class SortByParity {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int n, l, r, t;
            n = nums.length;
            if (n == 1)
                return nums;
            l = 0;
            r = n - 1;
            while (l < n && l < r) {
                if (nums[l] % 2 != 0) {
                    while (r > l) {
                        if (nums[r] % 2 == 0)
                            break;
                        r--;
                    }
                    if (r == l)
                        break;
                    t = nums[l];
                    nums[l] = nums[r];
                    nums[r] = t;
                    r--;
                }
                l++;
            }
            return nums;
        }
    }
}

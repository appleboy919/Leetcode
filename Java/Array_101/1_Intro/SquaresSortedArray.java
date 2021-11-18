public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ret[] = new int[n];
        int i, l, r;
        l = 0;
        i = r = n - 1;
        while (l <= r && i >= 0) {
            if (nums[l] * nums[l] < nums[r] * nums[r]) {
                ret[i] = nums[r] * nums[r];
                r--;
            } else {
                ret[i] = nums[l] * nums[l];
                l++;
            }
            i--;
        }
        return ret;
    }
}

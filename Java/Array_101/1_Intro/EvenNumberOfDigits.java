public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        String t;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            t = Integer.toString(nums[i]);
            if (t.length() % 2 == 0)
                ret++;
        }
        return ret;
    }
}

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int t = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == 0) {
                max = max < t ? t : max;
                t = 0;
            } else
                t += 1;
        }
        return max < t ? t : max;
    }
}
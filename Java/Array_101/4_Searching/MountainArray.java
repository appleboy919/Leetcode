public class MountainArray {
    class Solution {
        public boolean validMountainArray(int[] arr) {
            int n, l, r;
            n = arr.length;
            l = 0;
            r = n - 1;
            while (l < n - 1) {
                if (arr[l] >= arr[l + 1])
                    break;
                l++;
            }
            if (l == 0 || l == n - 1)
                return false;
            while (r > 0) {
                if (arr[r] >= arr[r - 1])
                    break;
                r--;
            }
            return l == r;
        }
    }
}

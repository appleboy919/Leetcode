public class NAndDouble {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            int n = arr.length;
            int t[] = new int[2 * 10 * 10 * 10 + 1];
            for (int i = 0; i < n; i++) {
                if (t[arr[i] * 2 + 10 * 10 * 10] != 0 || (arr[i] % 2 == 0 && t[arr[i] / 2 + 10 * 10 * 10] != 0)) {
                    return true;
                }
                t[arr[i] + 10 * 10 * 10]++;
            }
            return false;
        }
    }
}

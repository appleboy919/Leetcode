public class NAndDouble {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            int n = arr.length;
            int t[] = new int[2 * 1000 + 1];
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0)
                    if (t[arr[i] / 2 + 1000] > 0)
                        return true;
                if (arr[i] * 2 >= -1000 && arr[i] * 2 <= 1000)
                    if (t[arr[i] * 2 + 1000] > 0)
                        return true;
                t[arr[i] + 1000]++;
            }
            return false;
        }
    }
}

public class ReplaceRightGreatest {
    class Solution {
        public int[] replaceElements(int[] arr) {
            // Input: arr = [17,18,5,4,6,1]
            // Output: [18,6,6,6,1,-1]
            int n, t, temp;
            n = arr.length;
            t = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > t) {
                    temp = t;
                    t = arr[i];
                    arr[i] = temp;
                } else
                    arr[i] = t;
            }
            return arr;
        }
    }
}

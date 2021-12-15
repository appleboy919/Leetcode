public class DuplicateZeors {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int t[] = new int[2 * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (idx >= n)
                break;
            t[idx] = arr[i];
            if (arr[i] == 0) {
                t[idx + 1] = 0;
                idx++;
            }
            idx++;
        }
        System.arraycopy(t, 0, arr, 0, n);
    }
}

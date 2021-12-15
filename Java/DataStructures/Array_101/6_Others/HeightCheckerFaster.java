public class HeightCheckerFaster {
    // use counting sort
    class Solution {
        public int heightChecker(int[] heights) {
            int ans = 0;
            int counts[] = new int[101];
            int expected[] = new int[heights.length];

            for (int i = 0; i < heights.length; i++)
                counts[heights[i]]++;

            for (int i = 1; i < 100; i++)
                counts[i + 1] += counts[i];

            for (int i = heights.length - 1; i >= 0; i--) {
                counts[heights[i]]--;
                expected[counts[heights[i]]] = heights[i];
            }
            for (int i = 0; i < heights.length; i++)
                if (heights[i] != expected[i])
                    ans++;

            return ans;
        }
    }
}

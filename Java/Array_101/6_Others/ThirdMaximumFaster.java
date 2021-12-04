public class ThirdMaximumFaster {
    class Solution {
        public int thirdMax(int[] nums) {
            long m1, m2, m3;
            m1 = m2 = m3 = Long.MIN_VALUE;
            for (int n : nums) {
                if (n > m1) {
                    m3 = m2;
                    m2 = m1;
                    m1 = n;
                } else if (n < m1 && n > m2) {
                    m3 = m2;
                    m2 = n;
                } else if (n < m2 && n > m3) {
                    m3 = n;
                }
            }
            if (m3 == Long.MIN_VALUE)
                return (int) m1;
            return (int) m3;
        }
    }
}

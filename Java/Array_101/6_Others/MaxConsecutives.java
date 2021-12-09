public class MaxConsecutives {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int idx1, idx2
            ans = -1;
            a = b = 0;
            x = y = 1;
            for (int i=0;i<nums.length;i++) {
               if(nums[i]==1) {
                   a ++;
                   b ++;
               }
                else {
                    if(x==1) {
                        if(y==0) {
                            if(ans < b)
                                ans = b;
                            b = 0;
                            y = 1;
                        }
                        a ++;
                        x --;
                    }
                    else if(y==1) {
                        if(ans < a)
                            ans = a;
                        a = 0;
                        x = 1;
                        b ++;
                        y --;
                    }
                }
            }
            ans = a>ans?a:ans;
            ans = b>ans?b:ans;
            return ans;
        }
    }

}

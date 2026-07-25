class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int n = nums.length;
        int sum = nums[0];
        int minLen = Integer.MAX_VALUE;
        while(high<n){
            if(sum >= target){
                int len = (high - low + 1);
                if(len < minLen){
                    minLen = len;
                }
                low++;
                sum = sum - nums[low-1];
            }
            else{
                high++;
                if(high == n){
                    break;
                }
                sum = sum + nums[high];
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}
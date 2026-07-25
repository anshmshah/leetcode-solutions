class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0, high=0, sum=0;
        int n=nums.length;
        int min_len=Integer.MAX_VALUE;

        while(high<n){
            sum=sum+nums[high];
            while(sum>=target){
                int len=high-low+1;
                if(len<min_len){
                    min_len=len;
                }
                sum=sum-nums[low];
                low++;

            }
            high++;
        } 
        if(min_len==Integer.MAX_VALUE){
            return 0;
        }
        return min_len;  
    }
}
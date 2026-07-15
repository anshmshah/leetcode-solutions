class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length==0)
            return 0;

        int unique=1;

        for(int i=0,j=1;j<nums.length;){
            if (nums[j]==nums[i]){
                j++;
                continue;
            }
            nums[i+1]=nums[j];
            unique++;
            i++;
            j++;
        }
        return unique;
    }
}
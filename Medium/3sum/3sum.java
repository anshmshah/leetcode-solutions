class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int sum=(-1)*nums[i];
            int left=i+1;
            int right=n-1;

            while(left<right){

                int s=nums[left]+nums[right];

                if(s==sum){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);

                    res.add(triplet);
                    left++;
                    right--;

                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }

                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                
                else if(s<sum){
                    left++;
                }
                else
                    right--;
            }
        }

        return res;
    }
}
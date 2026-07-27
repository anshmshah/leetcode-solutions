class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int n = fruits.length;
        int res = Integer.MIN_VALUE;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int right =0; right<n; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0) +1);
        
        while(map.size()>2){
            int leftFruits = fruits[left];
            map.put(leftFruits, map.get(leftFruits) -1);

            if(map.get(leftFruits) == 0){
                map.remove(leftFruits);
            }
            left++;
            } 
            if(map.size() == 2 || map.size()<2) {
                int length = right -left +1;
                res = Math.max(res,length);
            }
        } 
      return res;
    }
}
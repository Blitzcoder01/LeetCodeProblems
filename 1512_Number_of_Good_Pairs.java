class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
                
            }
            else{
                map.put(nums[i],1);
            }
        }
        for( int i: map.values()){
            int s= i* (i-1)/2;
            c=c+s;
        }
        return c;
    }
}

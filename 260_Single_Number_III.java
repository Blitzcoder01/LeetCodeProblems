class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-2;
        int c=0;
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                
                int value = e.getValue();
                if(value==1){
                    ans[c]= e.getKey();
                    c++;
                }
            }
        return ans;
    }
}

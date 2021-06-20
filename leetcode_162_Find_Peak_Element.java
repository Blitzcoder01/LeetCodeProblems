class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int ans=0;
        int h= nums.length-1;
        if(nums.length== 1){
            return 0;
        }
        while(l<=h){
            int mid= l+((h-l)/2);
            if(mid!=0 && mid!=(nums.length-1)){
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    ans= mid;
                    
                }
             if(nums[mid]<nums[mid-1]){
                    h= mid-1;
                }
                else{
                    l= mid+1;
                }
            }
             if (mid==0){
                if(nums[mid]>nums[mid+1]){
                    return 0;
                    
                }
                else{
                    return 1;
                }
            }
            else if (mid==(nums.length-1) ){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                    
                }
                else{
                    return (mid-1);
                }
            }
        }
        return ans;
    }
}

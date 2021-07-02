class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int ans=0;
        int h= nums.length-1;
        
        
        while(l<=h){
            int mid= (l+(h-l)/2);
            if(target>nums[0] && target<nums[nums.length-1]){
                if(nums[mid]== target){
                ans=mid;
                    break;
                }
                
                if(target<nums[mid]){
                     if(target>nums[mid-1]){
                        ans= mid;
                         break;
                    }
                    h= mid-1;
                  
                }
                else{
                    if(target<nums[mid+1]){
                       ans= mid+1; 
                        break;
                    }
                        
                    l= mid+1;
                    
                }
                
            
      }
    else if(target<=nums[0]){
            return 0;
        }
      else if(target==nums[nums.length-1]) {
         return nums.length-1;
         }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        
        }
        
        return ans;
    }
}

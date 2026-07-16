class Solution {
    public int findKRotation(int nums[]) {
        // Code here
         int n=nums.length;
        int low=0,high=n-1;
        int ans = Integer.MAX_VALUE;
        int index=-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(nums[low]<=nums[high]){
                if(nums[low]<ans){
                    index=low;
                    ans=nums[low];
                }
                break;
                
            }
            
            if(nums[low]<=nums[mid]){
                if(nums[low]<ans){
                    index=low;
                    ans=nums[low];
                }
                low=mid+1;
            }
            else{
                high=mid-1;
               if(nums[mid]<ans){
                    index=mid;
                    ans=nums[mid];
                }
            }
        }
        return index;
    }
}
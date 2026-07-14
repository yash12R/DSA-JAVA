class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
            int  mid=0;
            int fst=0;
            int lst=n-1;
            
            while(fst<=lst){
                mid=(fst+lst)/2;
                if(target==nums[mid]){
                    return mid;
                }
                else if(target>nums[mid]){
                    fst=mid+1;

                }
                else{
                    lst=mid-1;
                }
            }
            return fst;


    }
}
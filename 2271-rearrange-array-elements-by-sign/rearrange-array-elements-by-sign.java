class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        
        int posindx=0;
        int negindx=1;

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[negindx]=nums[i];
                negindx+=2;
            }
            else{
                ans[posindx]=nums[i];
                posindx +=2;
            }
        }
        return ans;
    }
}
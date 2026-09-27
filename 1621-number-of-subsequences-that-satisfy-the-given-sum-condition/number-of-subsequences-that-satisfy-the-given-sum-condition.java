class Solution {
    public int numSubseq(int[] nums, int target) {
        
        int mod=1000000007;

        Arrays.sort(nums);

        int n=nums.length;
        long[] power=new long[n];

        power[0]=1;

        for(int i=1;i<n;i++){
            power[i]=(power[i-1]*2)%mod;

        }
        int left=0;
        int right=n-1;
        long ans=0;
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                 // All elements between left and right are optional
                 ans=(ans+power[right-left])%mod;
                 left++;
            }else{
                right--;
            }
        }
        return(int)ans;
    }
}
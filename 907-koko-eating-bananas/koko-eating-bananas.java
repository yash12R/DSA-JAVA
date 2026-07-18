class Solution {
    int findMax(int[] arr){
    int maxi=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        maxi=Math.max(maxi,arr[i]);
    }
    return maxi;
    }

    int calculatehours(int[] arr,int hour){
        int totalhr=0;
        for(int i=0;i<arr.length;i++){
            totalhr+=Math.ceil((double)arr[i] / (double)hour);
        }
        return totalhr;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int low=0,high=findMax(piles);
       while(low<=high){
       int mid=(low+high)/2;
       int totalhr=  calculatehours(piles,mid);
       if(totalhr<=h){
        high=mid-1;
       }
       else{
        low=mid+1;
       }
    }
      return low;
    }
   
}
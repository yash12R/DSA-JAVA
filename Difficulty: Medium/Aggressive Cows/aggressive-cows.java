class Solution {
    
    boolean canweplace(int[] stalls,int cows,int dist){
        int cntcows=1,last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                cntcows++;
                last=stalls[i];
            }
            if(cntcows>=cows)
            return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int low=1,high=arr[n-1]-arr[0];        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canweplace(arr,k,mid)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
        
        
    }
    
}
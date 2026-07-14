class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int ans=-1;
        int n=arr.length;
        int low=0,high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]<=x){
            ans=mid;
            low=mid+1;
            }
            else{
            
            high=mid-1;
            }
            
            
        }
        return ans;
        
        
    } 
}

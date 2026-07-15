class Solution {
     int  firstoccur(int [] arr,int n,int k){
        int low=0,high=n-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    int lastoccur(int[]arr,int n,int k){
        int low=0,high=n-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                last=mid;
                low=mid+1;

            }
            else if(arr[mid]<k) 
            low=mid+1;
            else 
            high=mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] arr, int k) {
        int n=arr.length;
        int first=firstoccur( arr, n, k);
        if(first== -1)
        return new int[]{-1,-1};

        int last= lastoccur(arr,n,k);
        return new int[]{first,last};
    }

    
    int countFreq(int[] arr, int target) {
        int[] ans = searchRange(arr, target);

    if (ans[0] == -1)
        return 0;

    return ans[1] - ans[0] + 1;
        
    }

}
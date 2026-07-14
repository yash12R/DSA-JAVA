class Solution {
    int upperBound(int[] arr, int target) {
        // code here
          int n=arr.length;
        int ind=0;
        for(int i=0;i<n;i++){
            
            if(arr[ind]>target)
            return ind;
            ind ++;   
          
           
        }
        return n;
    }
}

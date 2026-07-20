class Solution {
      int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int ind=0;
        for(int i=0;i<n;i++){
            
            if(arr[ind]>=target)
            return ind;
            ind++;   
          
           
        }
        return n;
    }
    public int rowWithMax1s(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int cnt_max=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int cnt_ones=m-lowerBound(arr[i],1);
            if(cnt_ones>cnt_max){
                cnt_max=cnt_ones;
                index=i;
            }
        }
        return index;
        
    }
}
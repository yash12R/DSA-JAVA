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
    
    int countsmallequal(int [][] mat,int n,int m,int x){
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=upperBound(mat[i],x);
        }
        return cnt;
    }
    
    public int median(int[][] mat) {
        // code here
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][m-1]);
            
        }
        int req=(n*m)/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            int smallequal=countsmallequal(mat,n,m,mid);
            if(smallequal<=req)
            low=mid+1;
            else
            high=mid-1;
        }
        return low;
        
    }
}
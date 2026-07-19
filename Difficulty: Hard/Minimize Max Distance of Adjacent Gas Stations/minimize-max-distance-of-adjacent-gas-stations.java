class Solution {
    int numberofgasstationreq( double dist,int[] arr){
        int cnt=0;
        for(int i=1;i<arr.length;i++){
            int numberinbetween=(int)((arr[i]-arr[i-1])/dist);
            
            if((arr[i]-arr[i-1])/dist==numberinbetween*dist){
                numberinbetween--;
            }
            cnt+=numberinbetween;
            
            
        }
        return cnt;
    }
    public  double minMaxDist(int[] stations, int k) {
        // code here
        int n=stations.length;
        double low=0;
         double high=0;
        for(int i=0;i<n-1;i++){
            high=Math.max(high,(double) (stations[i+1]-stations[i]));
            
        }
        
        double diff=1e-6;
        while(high-low > diff){
             double mid=(low+high)/2.0;
            int cnt= numberofgasstationreq(mid,stations);
            if(cnt>k){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;
        
    }
}

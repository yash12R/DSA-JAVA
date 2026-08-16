class Solution {

    int[] findNSE(int [] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer>st=new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!st.empty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.empty() ? n :st.peek();
            st.push(i);
        }
        return nse;
    }

     int[] findPSE(int [] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<n;i++){

            while(!st.empty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=st.empty() ? -1 :st.peek();
            st.push(i);
        }
        return pse;
    }
    public int sumSubarrayMins(int[] arr) {


        int n=arr.length;

        int[] nse=findNSE(arr);
        int[] pse=findPSE(arr);

        long total=0;
        long mod=(long) 1e9 + 7;

        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;

            total=(total+left*right*arr[i])%mod;
        }
        
            return (int)total;
    }

}
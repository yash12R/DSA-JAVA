class Solution {

    int sumbydiv(int[] arr,int div){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+(int)Math.ceil((double)(arr[i])/(double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low=1,high= Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumbydiv(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
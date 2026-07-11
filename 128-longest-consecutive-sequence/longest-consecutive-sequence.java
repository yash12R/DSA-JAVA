class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;

        HashSet<Integer> set = new HashSet<>();
         //inter elements into hashset

         for(int num:nums){
            set.add(num);
         }
         for(int num:set){

            //if previous elements doesnt exist
            if(!set.contains(num-1)){
                int currnum=num;
                int cnt=1;
                
                //to count consecutive no.
                while(set.contains(currnum+1)){
                    currnum++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
         }
         return longest;
    }
}
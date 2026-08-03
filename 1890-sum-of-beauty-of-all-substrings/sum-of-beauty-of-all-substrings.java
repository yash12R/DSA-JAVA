class Solution {
    public int getmincount(int [] freq){
        int mincount=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                mincount=Math.min(mincount,freq[i]);
            }
        }
        return mincount;

    }

    public int getmaxcount(int [] freq){
        int maxcount=0;
        for(int i=0;i<26;i++){
            maxcount=Math.max(maxcount,freq[i]);
        }
        return maxcount;
    }
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int beauty=getmaxcount(freq)-getmincount(freq);
                sum+=beauty;
            }
        }
        return sum;
        
    }
}
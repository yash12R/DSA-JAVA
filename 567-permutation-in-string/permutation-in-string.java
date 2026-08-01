class Solution {

    boolean check(int []freq, int []windfreq){
        for(int i=0;i<26;i++){
            if(freq[i]!=windfreq[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int [] freq=new int[26];

        for(int i=0;i<s1.length();i++){
            int idx=s1.charAt(i)-'a';
            freq[idx]++;
        }
        int windsize=s1.length();

        for(int i=0;i<=s2.length()-windsize;i++){
            int [] windowfreq=new int[26];

            int windidx=0;
            int idx=i;

            while(windidx < windsize && idx<s2.length()){
                windowfreq[s2.charAt(idx)-'a']++;
                windidx++;
                idx++;
            }
            if(check(freq,windowfreq)){
                return true;
            }
        }
        return false;
    }
}
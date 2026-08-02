class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        ArrayList<Character> List=new ArrayList<>();

        for(char ch:map.keySet()){
            List.add(ch);
        }
        Collections.sort(List,(a,b)->map.get(b)-map.get(a));

        StringBuilder ans=new StringBuilder();

        for(char ch:List){
            int freq=map.get(ch);
            
            for(int i=0;i<freq;i++){
                ans.append(ch);
            }

        }
        return ans.toString();
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        solve(0,0,n, "",ans);
        return ans;
    }

        void solve(int open,int close,int n,String s,List<String>ans){
            if(open==n && close==n){
                ans.add(s);
                return;
            }

            if(open<n)
            solve(open + 1,close,n,s + "(",ans);

            if(close<open)
            solve(open,close + 1,n,s +")",ans );
        }
    }


class Solution {
    static String preToPost(String s) {
        // code here
         Stack<String> st = new Stack<>();
        
         int n = s.length();
        int i = n-1;
       

        while (i>=0) {

            char ch = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }

            // Operator
            else {
                String t1 = st.peek();
                st.pop();

                String t2 = st.peek();
                st.pop();

                 String con = t1+t2+ch+"";
                
                st.push(con);
            }

            i--;
        }

        return st.peek();
    }
}
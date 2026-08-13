class Solution {
    static String postToPre(String s) {
        // code here
          Stack<String> st = new Stack<>();

        int i = 0;
        int n = s.length();

        while (i < n) {

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

                 String con = "" + ch + t2 + t1;
                
                st.push(con);
            }

            i++;
        }

        return st.peek();
    }
}

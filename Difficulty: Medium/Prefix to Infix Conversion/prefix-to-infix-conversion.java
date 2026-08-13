class Solution {
    
    
    static String preToInfix(String s) {
        // code here
        
         Stack<String> st = new Stack<>();

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }

            // Operator
            else {
                String t1 = st.pop();
                String t2 = st.pop();

                String con = "(" + t1 + ch + t2 + ")";

                st.push(con);
            }
        }

        return st.peek();
        
    }
}

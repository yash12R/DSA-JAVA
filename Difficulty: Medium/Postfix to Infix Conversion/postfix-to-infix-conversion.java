class Solution {
    static String postToInfix(String exp) {
        // code here
         Stack<String> st = new Stack<>();

        int i = 0;
        int n = exp.length();

        while (i < n) {

            // Operand
             char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(exp.charAt(i))) {
                st.push(String.valueOf(exp.charAt(i)));
            }

            // Operator
            else {
                String t1 = st.peek();
                st.pop();

                String t2 = st.peek();
                st.pop();

                String com = "(" + t2 + ch + t1 + ")";

                st.push(com);
            }

            i++;
        }

        return st.peek();
        
    }
}

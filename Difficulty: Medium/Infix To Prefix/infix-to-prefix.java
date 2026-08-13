class Solution {
    
     static int priority(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/' || ch == '%')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return 0;
    }

    static String infixToPrefix(String s) {
        // code here
        
         // Step 1: Reverse the string
        s = new StringBuilder(s).reverse().toString();

        // Step 2: Swap brackets
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(')
                temp.append(')');

            else if (s.charAt(i) == ')')
                temp.append('(');

            else
                temp.append(s.charAt(i));
        }

        s = temp.toString();

        // Step 3: Infix to Postfix
        Stack<Character> st = new Stack<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            }

            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!st.empty() && st.peek() != '(') {
                    ans += st.peek();
                    st.pop();
                }

                if (!st.empty()) {
                    st.pop();
                }
            }

            // Operator
            else {

                while (!st.empty() &&
                       st.peek() != '(' &&
                       (priority(ch) < priority(st.peek()) ||
                       (priority(ch) == priority(st.peek()) &&
                        ch == '^'))) {

                    ans += st.peek();
                    st.pop();
                }

                st.push(ch);
            }
        }

        // Pop remaining operators
        while (!st.empty()) {
            ans += st.peek();
            st.pop();
        }

        // Step 4: Reverse postfix to get prefix
        ans = new StringBuilder(ans).reverse().toString();

        return ans;
        
    }
}
class Solution {
    
     static int priority(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return 0;
     }
    
    public static String infixToPostfix(String s) {
        
        // code here
        
         String ans = "";

        Stack<Character> st = new Stack<>();

        int i = 0;
        int n = s.length();

        while (i < n) {

            
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

                ans += s.charAt(i);
            }

        
            else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }

            
            else if (s.charAt(i) == ')') {

                while (!st.empty() && st.peek() != '(') {
                    ans += st.peek();
                    st.pop();
                }

                if (!st.empty()) {
                    st.pop(); 
                }
            }

            
            else {
                while (!st.empty() &&
       st.peek() != '(' &&
       (priority(s.charAt(i)) < priority(st.peek()) ||
       (priority(s.charAt(i)) == priority(st.peek()) &&
        s.charAt(i) != '^'))) {

                    ans += st.peek();
                    st.pop();
                }

                st.push(s.charAt(i));
            }

            i++;
        }

        
        while (!st.empty()) {
            ans += st.peek();
            st.pop();
        }
        return ans;

        
    }
}
class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove elements smaller than or equal to arr[i]
            while (!st.empty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element exists
            if (st.empty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : nge) {
            ans.add(x);
        }

        return ans;
    }
}
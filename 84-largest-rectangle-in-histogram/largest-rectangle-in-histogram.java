class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int maxarea=0;

        for(int i=0;i<n;i++){

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int element=st.pop();

                int nse=i;
                int pse=st.isEmpty() ? -1 : st.peek();

                    int area=heights[element]*(nse-pse-1);

                    maxarea=Math.max(maxarea,area);
            }
            st.push(i);

        }
        // If there are elements leftover

        while(!st.isEmpty()){
            int nse=n;
            int element=st.pop();

            int pse=st.isEmpty() ? -1: st.peek();

            maxarea=Math.max(maxarea,(nse-pse-1)*heights[element]);
        }

        return maxarea;
        
    }
}
class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        
        int top=0;
        int down=n-1;
        
        while(top<down){
            if(mat[top][down]==1){
                top++;
            }
            else{
                down--;
            }
        }
        
        if(top>down){
            return -1;
        }
        
        for(int i=0;i<n;i++){
            
            if(i==top){
                continue;
            }
            if(mat[top][i]==0 && mat[i][top]==1){
        }
        else{
            return -1;
        }
        }
        return top;
    }
}
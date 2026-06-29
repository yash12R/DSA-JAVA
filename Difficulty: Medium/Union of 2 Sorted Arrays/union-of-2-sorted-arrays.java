import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1=a.length;
        int n2=b.length;
        
        ArrayList<Integer> unionarr=new ArrayList<>();
         int i=0;
         int j=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=a[i]){
                    unionarr.add(a[i]);
                }
                i++;
            }else{
                if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=b[j]){
                    unionarr.add(b[j]);
                }
                j++;
            }
            
           
        }
        
        while(i<n1){
          
                if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=a[i]){
                    unionarr.add(a[i]);
                }
                i++;
        }
        
        while(j<n2){
            if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=b[j]){
                    unionarr.add(b[j]);
                }
                j++; 
        }
     
       return unionarr;   
    }
  
}

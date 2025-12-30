//<----------------------Count Indices to Balance Even and Odd Sums-------------------->
class Solution {
    public int cntWays(int[] arr) {
        // code here
        // ArrayList<Integer> indi = new ArrayList<Integer>();
        int count=0;
        int pos=0;
         int n=arr.length;
        for(int i=0;i<n;i++){
            int sume=0;
            int sumo=0;
           
        for(int j=0;j<n;j++){
            
            if(i==j){
                continue;
            }
            if(pos%2==0){
                sume=sume+arr[j];
            }
            else{
                sumo=sumo+arr[j];
            }
            pos++;
        }
        
            if(sume==sumo){
                count++;
            }
        
    }
        return count;
    }
}



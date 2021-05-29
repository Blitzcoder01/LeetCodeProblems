class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList l= new ArrayList<Integer>();
        if(n==1 && arr.length==1){
            l.add(1);
        }
        else{
            for(int i=0; i<arr.length; i++){
                if(arr[i]==(i+1)){
                    l.add(arr[i]);
                    
                }
                else{
                    
                }
            }
        }
        return l;
    }
}

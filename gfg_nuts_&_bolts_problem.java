class Solution {
    
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        char[] arr={'!', '#', '$','%', '&', '*', '@', '^', '~'};
        char[] arr2= new char[nuts.length];
         int p=0;
        for(int i=0; i<9; i++){
        
        for(int j=0; j<nuts.length; j++){
            
                if(nuts[j] == arr[i]){
                   char temp = nuts[j];
                   nuts[j]= nuts[p];
                   nuts[p] = temp;
                   
                    bolts[p]= nuts[p];
                    
                     p++;
                if(p> n-1){
                    break;
                }
                }
               
            }
        }
    }
}

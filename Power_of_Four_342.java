class Solution {
    public boolean isPowerOfFour(int n) {
         long l=1;
        while(l<n){
            l*=4;
        }
        if(l==n){
            return true;
        }
        return false;
    }
}

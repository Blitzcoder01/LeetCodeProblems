class Solution {
    static String armstrongNumber(int n){
        // code here
        int temp= n;
        int c=0;
        while(temp>0){
            int r= temp%10;
            c= c+r*r*r;
            temp= temp/10;
        }
        // System.out.print(c);
        if(c==n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}

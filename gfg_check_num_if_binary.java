//User function Template for Java
class Solution{
    static String checkFibonacci(int N){
        // code here
        int t1= 5*N*N+4;
        int t2= 5*N*N-4;
        float f1= (float)Math.sqrt(t1);
        float f2=(float) Math.sqrt(t2);
        int f1a= (int)Math.sqrt(t1);
        int f2b= (int)Math.sqrt(t2);
        String s= "";
        if(f1/f1a==1.000000 ||f2/f2b==1.000000){
            s= "Yes";
            return s;
        }
        else{
            s= "No";
            return s;
        }
        
    }
}

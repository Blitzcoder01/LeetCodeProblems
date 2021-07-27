import java.util.*;
public class Main {
	public static int KnapSack(int[] w, int[] v, int cap, int len){
		int[][] dp =new int[cap+1][len+1];
		for(int i=0; i<cap+1; i++) {
			for(int j=0; j<len+1; j++){
				if( i==0 || j==0){
					dp[i][j]=0;
				}
			}
		}
		for(int i=1; i< cap+1; i++) {
			for(int j=1; j< len+1; j++){
				if(w[j-1]<=i){
					dp[i][j]= Math.max(v[j-1]+dp[i-w[j-1]][j],dp[i][j-1]);
				}
				else if(w[j-1]>i){
					dp[i][j]= dp[i][j-1];
				}
			}
			
		}
		return dp[cap][len];
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int cap= sc.nextInt();
		int[] weight= new int[n];
		int[] val= new int[n];
		for(int i=0; i< n; i++){
			weight[i]= sc.nextInt();
		}
		for(int i=0; i< n; i++){
			val[i]= sc.nextInt();
		}
		int max=0;
		max= KnapSack(weight, val, cap, n);
		System.out.print(max);
    }
}

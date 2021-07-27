class Solution {
    public int CoinChange(int[] arr,int n,int curr,int len){
		int[][] dp= new int[n+1][len+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<len+1; j++){
                if(j==0){
                    dp[i][j]=0;
                }
                else if(i==0){
                    dp[i][j]=1;
                }
            }
            
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<len+1; j++ ){
                if(arr[j-1]<=i){
                    dp[i][j]=dp[i-arr[j-1]][j] + dp[i][j-1];
                }
                if(arr[j-1]>i){
                    dp[i][j]= dp[i][j-1];
                }
            }
        }
		return dp[n][len];
	}
    public int change(int amount, int[] coins) {
        int ans=0;
        ans= CoinChange(coins, amount, 0, coins.length);
        return ans;
    }
}

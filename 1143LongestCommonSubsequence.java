class Solution {
    public int longestCommonSubsequence(String s, String ss) {
        int[][] dp =new int[ss.length()+1][s.length()+1];
		for(int i=0; i<ss.length()+1;i++){
			for(int j=0; j<s.length()+1; j++){
				if(i==0|| j==0){
					dp[i][j]=0;
				}
			}
		}
		for(int i=1; i<ss.length()+1;i++){
			for(int j=1; j<s.length()+1; j++){
				if(s.charAt(j-1)==ss.charAt(i-1)){
					dp[i][j]=1+dp[i-1][j-1];
				}
				else{
					dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
				}
			}
		}
		return dp[ss.length()][s.length()];
    }
}

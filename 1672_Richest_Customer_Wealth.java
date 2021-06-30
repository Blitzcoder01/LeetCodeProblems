class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr= new int[accounts.length];
        int r=0;
        int sum=0;
        for(int i=0;i<accounts.length; i++){
            for(int j=0;j<accounts[0].length; j++){
            sum= sum+ accounts[i][j];
         }
            arr[i]= sum;
            sum=0;
            
        }
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
}

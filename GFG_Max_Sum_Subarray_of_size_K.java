//User function Template for Java
class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i=0;
        int j=0;
        int sum=0;
        int max=0;
        while(j<N){
            sum= sum+ Arr.get(j);
            if(j-i+1<K){
                j++;
            }
            else{
                max= Math.max(max, sum);
                sum= sum- Arr.get(i);
                j++;
                i++;
            }
        }
        return max;
    }
}

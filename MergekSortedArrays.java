class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                a.add(arr[i][j]);
            }
        }
        Collections.sort(a);
        return a;
        
    }
}

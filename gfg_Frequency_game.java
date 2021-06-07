class Geeks
{
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n)
    {
        int maxkey=0;
        
        // Your code here
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        
        {
            if(entry.getKey()> maxkey){
                maxkey=entry.getKey();
            }
            
        }
        
    
    return maxkey;
    }
}

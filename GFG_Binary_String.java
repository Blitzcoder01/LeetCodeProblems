class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int c=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                c++;
            }
            
                 
        }
        return c*(c-1)/2;
    }
}

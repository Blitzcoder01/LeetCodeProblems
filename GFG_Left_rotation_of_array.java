
class Solution
{
   static void leftRotate(long arr[], int k,int n)
{
        long[] ar2 = new long[arr.length];
         for(int i=0; i<k; i++){
             long t= arr[0];
             for(int j=0; j<arr.length-1;j++){
            arr[j]= arr[j+1];
         
        }
       
         arr[arr.length-1]=t;
         }
         
    }
}

// time complexity: O(n^2)

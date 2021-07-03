// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void swap(int[] arr, int min, int ele){
        int temp= arr[min];
        arr[min]= arr[ele];
        arr[ele]= temp;
    }
    public static int[] selectionSort(int[] arr){
        int N= arr.length;
       
        for(int i=0; i<N-1; i++){
            int min= i;
            for(int j=i+1; j<N; j++){
                if(arr[j]<arr[min]){
                   min= j;
                    
                }
            }
                
                swap(arr,min,i);
            
           
        }
        
         return arr;
    }
    public static void main(String[] args) {
        
        int[] arr= {2,1,4,3,97,23,5,7,16,12};
        
       selectionSort(arr);
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }
}

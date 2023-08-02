 public class SelectionSort {  
 static void selectSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < 4; i++){  
                 for(int j=i+1; j < 5; j++){  
                          if(arr[i] > arr[j]){  
                                 //swap elements  
                                 temp = arr[i];  
                                 arr[i] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
 
 public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,};  
                 
                selectSort(arr);
                System.out.println("Array After Selection Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
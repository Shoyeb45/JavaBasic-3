//3.Insertion Sort

import java.util.*;

public class Sortings3 {
    public static void PrintArray(int arr[]){
        for (int i = 0 ; i<5 ; i++){
            System.out.print(arr[i] + " ");
        }
    } 
        public class Main{
            public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                   int[] arr = new int[5];

                   for (int i=0 ; i<arr.length ; i++){ 
                    arr[i] = sc.nextInt();
                   }
                     
      
/*for unsorted part :*/    for(int i =1 ; i<arr.length ; i++){   //we've assumed that i=0 is sorted part
                int current = arr[i];
                int j = i-1;
                while(j>=0 && current < arr[j]){ //This loop for sorted part
                    arr[j+1] = arr[j] ;
                    j--;
                }
                //replace
                  arr[j+1] = current;

                   }
                 PrintArray(arr);
                 sc.close();
            }
        }
}

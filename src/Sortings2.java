//2.Selection sort 

import java.util.*;

public class Sortings2 {
    public static void PrintArray(int arr[]){
        for (int k=0 ; k<5 ;k++ ){
            System.out.print(arr[k]+" ");
        }
    }
    public class Main{
        public static void main(String[] args){
            try (Scanner sc = new Scanner(System.in)) {
                int[] arr = new int[5];
int i,j;
                  //For input of array
                 

                    for (i=0 ; i<arr.length ; i++){
                        arr[i]=sc.nextInt();
                    }
                     
                   
                    
                for(i=0 ; i<arr.length-1 ; i++){
                      int smallest = i;
                    for( j=i+1 ; j<arr.length ; j++) {
                        if (arr[j]<arr[i]){
                            //swapping position
                            smallest = j;
                        }
                        int temp = arr[smallest];
                        arr[smallest] = arr[i];
                        arr[i] =temp;
                    }
                }
                PrintArray(arr);
            }
            

             //Time complexity : O(n^2)
        } 
    }
}

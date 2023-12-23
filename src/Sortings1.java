//Sorting

import java.util.*;

public class Sortings1{
    public static void PrintArray(int Number[]){
        //Making Function for printing array
        for (int i =0; i<5 ; i++){
            System.out.print(Number[i] +" ");
        }
    }
        public class Main{
            public static void main(String[] args){
Scanner sc= new Scanner(System.in);

//First we'll take array input from user

int[] Number = new int[5];

for (int i=0 ; i<5 ; i++){
    Number[i] = sc.nextInt();
}

//1.Bubble Sort: we'll make comparison to each adjacent element ,we'll run loop till n-1 times.(Sorting in ascending order)

for (int i= 0 ;i< Number.length-1 ; i++){   //Outer loop for counter
    for (int j=0 ;j<Number.length -i-1 ; j++){  //-i-1 is for stopping,as after first loop one element will be get sorted
        if(Number[j] > Number[j+1]){
            //Swap
             int temp = Number[j];
               Number[j] = Number[j+1];
               Number[j+1] = temp;  //Changing position
        }
    }        
}
//printing after changing position
PrintArray(Number);
   sc.close();

   //Here the time complexity of code is O(n^2).

}    
    }
}
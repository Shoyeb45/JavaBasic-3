//checking array is strictly increasing or not

import java.util.*;

public class Recursion11 {
    public static boolean IsAscen (int Numbers[] ,int ind){
//Base case

if (ind == Numbers.length-1){
   return true;
}
 if ( Numbers[ind] < Numbers[ind+1]){
   return IsAscen (Numbers, ind+1) ;  //Return for coming calls
   //Array is sorted
}else{
   return false;
 }
 
    }
       public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
            
       int[] Numbers = new int[5];
        
         for (int i=0 ; i<Numbers.length ;i++){
                 System.out.print("Enter number in " +(i+1) + " entry:");
                   Numbers[i] =  sc.nextInt();
         }

         System.out.println(IsAscen(Numbers, 0));
            sc.close();
        
       }
}

//Finding first and last occurence of an element in given string

import java.util.*;

public class Recursion10 {
    //We need two values to initialize , and to store the indices value at first and last occurence.
    //So we'll assign two static integers(invalid index)
       public static int first = -1 ;
       public static int last = -1 ;
    public static void FindOccurence(String Word , int ind , char element){
        //Base condition
           if( ind == Word.length()){
            System.out.println( "Index of first occurrence of "+ element + " is " +first);
            System.out.print(last);
              return;
           }
          
         if( Word.charAt(ind) == element){
            if (first == -1){
                first = ind;
            }else{
                last = ind;
            }
         }

         FindOccurence(Word, ind+1, element);
    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            String Word = sc.nextLine();
      FindOccurence(Word, 0, 'a');            
sc.close();
          
     }
}


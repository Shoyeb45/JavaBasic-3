//Using recursion printing number from n to 1 

import java.util.*;

public class Recursion1 {
    public static void PrintNum(int n){
        //Base case
if (n == 0){
    return;
    }
    //Printing(work)
        System.out.println(n);
        PrintNum(n-1);  //To decrease number by 1,calling same function for recursion
    }          

    public class Main{
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println();
             sc.close();
            PrintNum(n);  //Calling function

            //We can easily do this by using loops conceept
                
        }
    }
}

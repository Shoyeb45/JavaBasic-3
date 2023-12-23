//Printing from 1 to 5

import java.util.*;

public class Recursion2 {
    public static void PrintNum(int m , int n){
           //Base case
        if(m == n){
            System.out.println(m);
            return;
        }
        System.out.println(m);
            PrintNum(m+1,n);  //Recursive statement
    }
        public class Main{
            public static void main(String [] args){
           Scanner sc = new Scanner(System.in);
           int n= sc.nextInt();
                int m=1;
                PrintNum(m , n);

                sc.close();
       }
    }
}

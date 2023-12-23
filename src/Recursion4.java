//Finding factorial(!) of number

import java.util.*;

public class Recursion4 {

//First way

    public static void Facto(int n ,int i , int mult){
        //Base case
        if(i == n){
            mult = mult*n;
            System.out.println(mult);
            return;
        }
        if(n == 0){
            System.out.println(1);
            return ;
        }
        mult *= i ;  //Work
        Facto(n , i+1 , mult);
    }

//second way

    public static int calcFacto(int n){
        //Base case
     if (n ==1 || n ==0){
        return 1;
     }
        int facto =calcFacto(n-1);  //Recursive statement
        int fact_n = n * facto ;
        return fact_n;  
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        Facto(n ,1 ,1);
      System.out.println( calcFacto(n)); 
    }
}

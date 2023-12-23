//printing x^n (stack height = n)

import java.util.*;

public class Recursion6 {
    public static int Expo( int x , int n){
if( n == 0){
    return 1;
}
if( x==0 ){
    return 0;
}
        int Expo1 = Expo(x, n-1);
        int expo = x * Expo1 ;
        return expo;
    }
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter x:");
           int x = sc.nextInt(); 
           System.out.print("Enter n:");
           int n = sc.nextInt();
         int ans =  Expo(x, n);
           System.out.println(ans);
           sc.close();
       }
}

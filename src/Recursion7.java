//Printing x^n (Stack height=log(n))

import java.util.*;

public class Recursion7 {
    public static int Expo(int x, int n ){
if(x == 0){
    return 0;
}
if( n==0){
    return 1;
}
//For logn to be stack height ,we must divide the stacks 
//How stack height is log n please refer to calculation:
if( n % 2 ==0){
    return Expo(x, n/2) *Expo(x, n/2);  //As n is even
}
else{
    return Expo(x, n/2)*Expo(x, n/2) * x ;  //As n is odd 
}

    }
    public static void main(String[] args){
Scanner sc =new Scanner (System.in);
    System.out.print("Enter x:");
int x = sc.nextInt();
    System.out.print("Enter n:");
int n = sc.nextInt();
         int ans = Expo(x, n);
         System.out.println(ans);
         sc.close();
    }
}

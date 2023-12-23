//Printing sum of first natural number by the help of recursion

import java.util.*;

public class Recursion3 {
    //As we have to calculate sum, so we are defining three parameters to calculate sum
    public static void SumOfNatural(int n , int i , int sum){
             //Base case
                 if( i == n){
                    sum += i ; //As it will add last n or otherwise it will be excluded
                    System.out.println(sum);
                    return; 
                 }
    //Work:to find sum
        sum = sum+i;
    SumOfNatural(n, i+1, sum);        //Recursive statement       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfNatural(n, 1, 0);
    sc.close();
    }
}

//Tower of Hanoi

import java.util.*;

public class Recursion8 {
    public static void TowerofHanoi(int n, String source , String Helper , String Desti ){
      
        //Base case:
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + Desti);
            return;
        }
        TowerofHanoi(n-1, source, Desti, Helper);
        System.out.println("Transfer disk " + n +" from " + source + " to " + Desti);
     
        TowerofHanoi(n-1, Helper, source, Desti );
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         TowerofHanoi(n, "Source", "Helper", "Destination");

         sc.close();
    }
}

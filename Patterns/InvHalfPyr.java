//code to form an inverted half pyramid

import java.util.*;

public class InvHalfPyr {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows...");
       int n = sc.nextInt();

       //row no. = total columns
      
       //outer loop
       for(int i = n ; i>=1; i--){
           //inner loop
           for(int j = 1; j<=i; j++){
              System.out.print("*");
           }
           System.out.println();
       }
   }
}



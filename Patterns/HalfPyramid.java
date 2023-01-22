//code to form a half pyramid

import java.util.*;

public class HalfPyramid {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows...");
       int n = sc.nextInt();

       //row no. = total columns
      
       //outer loop
       for(int i = 1 ; i<=n;i++){
           //inner loop
           for(int j=1;j<=i;j++){
              System.out.print("*");
           }
           System.out.println();
       }
   }
}

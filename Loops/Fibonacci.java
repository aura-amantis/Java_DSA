//Code to print the Fibonacci series   (0 1 1 2 3 5 8 13 21 ..... )
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.*;

public class Fibonacci {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");

               int temp = b;   //swapping
               b = a + b;
               a = temp;
           }
           System.out.println();
       }
   }   
}

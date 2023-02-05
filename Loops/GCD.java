//Code to calculate the Greatest Common Divisor of 2 numbers.

import java.util.*;

public class GCD {
    
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number: ");
       int n1 = sc.nextInt();
       System.out.print("Enter the second number: ");
       int n2 = sc.nextInt();

       while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       System.out.println("GCD of two numbers is : "+ n2);
   }   
}

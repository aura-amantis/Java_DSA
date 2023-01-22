//Print if a number is prime or not (Input n from the user).

import java.util.*;

public class PrimeNo {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number...");
       int n = sc.nextInt();


       boolean isPrime = true;
       for(int i = 2; i<=n/2; i++){
           if (n%i==0){
               isPrime = false;
               break;
           }
       }


       if(isPrime){
           if(n==1){
               System.out.println("This is neither a prime number nor composite.");
           }else{
               System.out.println("This is a prime number.");
           }
       }else{
           System.out.println("This is not a prime number.");
       }
   }
}

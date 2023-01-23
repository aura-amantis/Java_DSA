//code to form an inverted half pyramid (rotated by 180deg)

import java.util.*;

public class IHPRotated {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      
       for(int i=n; i>=1; i--) {
           for(int j=1; j<i; j++) {
               System.out.print(" ");
           }

           for(int j=0; j<=n-i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

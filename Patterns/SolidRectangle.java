//code to form a solid rectangle

import java.util.*;

public class SolidRectangle {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows...");
       int n = sc.nextInt();
       System.out.println("Enter number of columns...");
       int m = sc.nextInt();
       //outer loop
       for(int i = 1 ; i<=n;i++){
           //inner loop
           for(int j=1;j<=m;j++){
           System.out.print("* ");
           }
           System.out.println();
       }
   }
}

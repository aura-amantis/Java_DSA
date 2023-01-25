//code to form a solid rhombus

import java.util.*;

public class SolidRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();
    
        //outer loop for number of rows
        for(int i=1; i<=n; i++) {

            //inner loop --> space print
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner loop --> star print
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

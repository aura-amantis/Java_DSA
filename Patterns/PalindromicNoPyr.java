// Code to print a Palindromic Number Pyramid (which looks same from forward and backward)

import java.util.*;

public class PalindromicNoPyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //first half numbers
            for(int j=i; j>=1; j--) {
            System.out.print(j);
            }

            //second half numbers
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

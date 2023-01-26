// Code to print a number pyramid.

import java.util.*;

public class NoPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

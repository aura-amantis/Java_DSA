// code to print a Hollow Butterfly pattern 

import java.util.*;

public class HollowBtrfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();

        //upper half
        for(int i = 1; i<=n; i++){
            System.out.print("*");
            
            for(int j=1; j<=i-2; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int j=1; j<=i-2; j++){
                System.out.print(" ");
            }

            if(i>1){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //lower half
        for(int i = n; i>=1; i--){
            System.out.print("*");
            
            for(int j=1; j<=i-2; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int j=1; j<=i-2; j++){
                System.out.print(" ");
            }

            if(i>1){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

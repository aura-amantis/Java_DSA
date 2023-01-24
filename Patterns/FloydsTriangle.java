/*
Code to print Floyd's Triangle (It is a right-angled triangle that contains consecutive natural numbers. 
In Floyd's triangle, the number starts with 1 in the top left corner, and then it consecutive 
filling the defined rows through the numbers.)
*/

import java.util.*;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();
        int number = 1;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}


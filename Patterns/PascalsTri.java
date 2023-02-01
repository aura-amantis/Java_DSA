// code to create a Pascal's Triangle

import java.util.*;

public class PascalsTri {
    public int fact(int i){        //fact ---> factorial
        if(i==0){
            return 1;
        }else{
            return i*fact(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();
        PascalsTri p = new PascalsTri();

        for(int i = 0; i<=n; i++){
            
            //for spacing
            for(int j=0; j<=n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j<= i; j++) {
 
                // nCr formula  (Combination)
                System.out.print(" " + p.fact(i)/(p.fact(i-j)*p.fact(j)));
            }
            System.out.println();
        }
    }
}

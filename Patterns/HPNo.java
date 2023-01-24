//code to form a half pyramid with numbers

import java.util.*;

public class HPNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows...");
        int n = sc.nextInt();

        //row no. = numbers from 1 to n
      
        //outer loop
        for(int i=1 ; i<=n;i++){
           //inner loop
           for(int j=1;j<=i;j++){ 
              System.out.print(j+" ");
           }
           System.out.println();
        }
    }
}

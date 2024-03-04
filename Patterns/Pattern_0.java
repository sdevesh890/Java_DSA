package Patterns;

import java.util.Scanner;

public class Pattern_0 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Pattern- 0
        // int i = 1;
        // while(i<=n)
        // {
        //     System.out.print("* ");
        //     i++;
        // }

        // Pattern - 1
        
        int row = 1;
        while(row<=n)
        {
            int col=1;
            while(col<=n)
            {
                System.out.print("* ");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}

package Patterns;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Pattern - 1.0
        // int row = 1;

        // while(row<=n)
        // {
        //     int i = 1;
        //     while(i<=row)
        //     {
        //         System.out.print("* ");
        //         i++;
        //     }
        //     row++;
        //     System.out.println();
        // }

        // Pattern 1.1

        // int row = 1;
        // while(row<=n)
        // { 
        //     int star = n;
        //     while(star>=row)
        //     {
        //         System.out.print("* ");
        //         star --;
        //     }
        //     row++;
        //     System.out.println();
        // }

        //Pattern - 1.2

        int row = 1;

        while(row<=n)
        {
            int space = n-row;
            while(space>0)
            {
                System.out.print(" ");
                System.out.print(" ");
                space--;
            }
            int star = 1;

            while(star<=row)
            {
                System.out.print("* ");
                star++;
            }
            row++;
            System.out.println();
        }

    }
}

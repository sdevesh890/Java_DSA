package Patterns;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int row = 1;
        // int space = n-1;
        // int star = 1;

        // while(row<=n)
        // {
        //     int i = 1;
        //     while(i<=space)
        //     {
        //         System.out.print("  ");
        //         i++;
        //     }
        //     int j = 1;
        //     while(j<=star)
        //     {
        //         System.out.print("* ");
        //         j++;
        //     }

        //     row++;
        //     space--;
        //     star+=2;
        //     System.out.println();
        // }
        //Pattern - reverse

        int row = 1;
        int space = 0;
        int star = (2*n)-1;

        while(row<=n)
        {
            int i = 0;
            while(i<space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            row++;
            space++;
            star-=2;
            System.out.println();
        }
        sc.close();
    }
}

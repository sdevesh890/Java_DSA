package Patterns;

import java.util.Scanner;

public class Pattern_4 {
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
        //     int j=1;
        //     while(j<=star)
        //     {
        //         if(j%2==0)
        //         {
        //             System.out.print("! ");
        //         }else{
        //             System.out.print("* ");
        //         }
        //         j++;
        //     }
        //     row++;
        //     space--;
        //     star+=2;
        //     System.out.println();
        // }

        //Pattern - 4.2

        int row = 1;
        int space = (2*n)-2;
        int star = 1;

        while(row<=n)
        {
            int i = 1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }
            row++;
            space-=2;
            star++;
            System.out.println();
        }
    }
}

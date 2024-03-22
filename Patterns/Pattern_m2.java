package Patterns;

import java.util.Scanner;

public class Pattern_m2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int row = 1;
        // int star = n;
        // int space = n-1;

        // while(row<=(2*n)-1)
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
        //     if(row<n)
        //     {
        //         star--;
        //         space--;
        //     }else 
        //     {
        //         star++;
        //         space++;
        //     }
        //     row++;
        //     System.out.println();
        // }

        int row = 1;
        int space = n-1;
        int count = 1;
        int star = 1;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while(j<=star)
            {
                System.out.print(count+"\t");
                count++;
                j++;
            }

            row++;
            space--;
            star+=2;
            System.out.println();
            sc.close();
        }
    }
}

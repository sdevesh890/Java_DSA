package Patterns;

import java.util.Scanner;

public class Pattern_2 {
    
   public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int row = 0;
    while(row<n)
    {
        int space = 2*row;
        while(space>0)
        {
            System.out.print(" ");
            System.out.print(" ");
            space--;
        }
        int star = n-row;

        while(star>0)
        {
            System.out.print("* ");
            star--;
        }
        row++;
        System.out.println();
    }
    sc.close();
   }
}

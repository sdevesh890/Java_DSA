package Patterns;

import java.util.Scanner;

public class Pattern_mirror1 {
   public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

    //   int row = 1;
    //   int star = 1;

    //   while(row<=(2*n-1))
    //   {
    //      int i=1;
    //      while(i<=star)
    //      {
    //         System.out.print("* ");
    //         i++;
    //      }
    //      if(row<n)
    //      {
    //         star++;
    //      }else
    //      {
    //         star--;
    //      }
    //      row++;
    //      System.out.println();
    //   }

    //PatterMirror_1.1

    int row = 1;
    int space = n-1;
    int star = 1;

    while(row<=(2*n)-1)
    {
        int i=1;
        while(i<=space)
        {
            System.out.print("  ");
            i++;
        }
        int j=1;
        while (j<=star) {
            System.out.print("* ");
            j++;
        }
        if(row<n)
        {
            star++;
            space--;
        }else 
        {
            space++;
            star--;
        }
        row++;
        System.out.println();
    }
    sc.close();
   } 
}

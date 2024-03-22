package Java;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //While Loop
        // int i = 0;
        // while(i<n)
        // {
        //     System.out.println("Devesh Sharma");
        //     i++;
        // }

        //FOR LOOP

        for(int i=1; i<=n; i++)
        {
            System.out.println("This is a for loop guys");
        }
        sc.close();
    }
}

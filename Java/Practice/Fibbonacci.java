package Java.Practice;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int n1 = 0;
        // int n2 = 1;
        // int n3 = 0;

        // for(int i=1; i<=n; i++)
        // {
        //     n3 = n1+n2;
        //     n1 = n2;
        //     n2 = n3;
        // }
        // System.out.println("Final nth Fibbonacci number is "+ n1);

        // GCD - HCF

        int divisor = sc.nextInt();
        int dividend = sc.nextInt();

        int rem = dividend%divisor;

        while(rem!=0)
        {
            dividend = divisor;
            divisor = rem;
            rem = dividend%divisor;
        }
        System.out.println(divisor);
    }
}

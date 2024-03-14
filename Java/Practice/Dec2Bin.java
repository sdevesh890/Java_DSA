package Java.Practice;

import java.util.Scanner;

public class Dec2Bin {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

    //    int sum = 0;
    //    int mul = 1;

    //    while(n>0)
    //    {
    //       int rem = n%2;
    //       sum = sum + rem * mul;
    //       mul = mul*10;          
    //       n = n/2;
    //    }

    //    System.out.println(sum);

        // Bin2Dec
        // general formula -> src -> mul(only dec) , des->division
        int sum = 0;
        int mul = 1;

        while(n>0)
        {
            int rem = n%10;
            sum = sum + rem*mul;
            mul = mul*2;
            n = n/10;
        }
        System.out.println(sum);
    }
}

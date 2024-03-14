package Java.Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                flag = true;
                break;
            }
        }

        if(flag || n==1)
        System.out.println(n+ " is not a Prime Number");
        else 
        System.out.println(n+ " is a Prime Number");

    }
}

package Java.Practice;

import java.util.Scanner;

public class Armstrong {

    public int length(int n)
    {
        int temp = n;
        int c=0;
        while(temp>0)
        {
            c++;
            temp = temp/10;
        }
        return c;
    }
    public int Armcal(int n, int len)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum = sum + (int)(Math.pow(rem, len));
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
          Armstrong obj = new Armstrong();
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

          int l = obj.length(n);

          int arm = obj.Armcal(n, l);

          if(arm==n)
           System.err.println("YES IT IS AN ARMSTRONG NUMBER");
           else
           System.err.println("NO");
           sc.close();
    }
}

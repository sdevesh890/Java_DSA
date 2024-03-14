package Java.Practice;
import java.util.Scanner;
public class SI {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int p = sc.nextInt();
        // int r = sc.nextInt();
        // int t = sc.nextInt();

        // int si = (p*r*t)/100;
        // System.out.println(si);

        //Odd Even

        // int n = sc.nextInt();

        // if(n%2==0)
        // System.out.println("EVEN");
        // else 
        // System.out.println("ODD");

        // Voting Age eligibilty Program

        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Congratulation!!! You can Vote");
        }else 
        {
            System.out.println("Sorry , You can't Vote :)");
        }
    }
}

package Java;
public class Intro {
    public static void main(String args[]) {
        // Used to print any statement
        System.out.println("WELCOME TO THE CODING WORLD");

        // Variable --> Work as a container , used to store value
        int x = 12;
        System.out.println(x);

        // Operator
        // Artihmetic Operator

        // Addition
        int a = 10;
        int b = 20;

        int add = a + b;
        System.out.println("addition of A and B is " + add);

        // Subtraction
        int sub = a - b;
        System.out.println(sub);

        // Mulitplication
        int mul = a * b;
        System.out.println(mul);

        // Division
        int div = a / b;
        System.out.println(div);

        // Modules
        int rem = a % b;
        System.out.println(rem);

        //Assignment Operator
        a+=5; //a=a+5;
        a-=5; //a=a-5;
        a*=5; //a=a*5;
        a%=5; //a=a%5; 
        a++; //first assign then update;
        ++a; //first update then assign 
        a--; //same
        --a; //same
        System.out.println(a);

        //Comparison Operator 
        a = 10;
        b = 10;
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a>b);
        System.out.println(a!=b);

        // Logical Operator
        // System.out.println((10==10) && (10>5));
        System.out.println((10==15) || (10>5));
        System.out.println(!(10==100));
        
        // How to get input from USER;
        // Scanner sc = new Scanner(System.in);


    }
}
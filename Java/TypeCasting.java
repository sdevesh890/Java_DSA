package Java;
public class TypeCasting {
    public static void main(String[] args) {
        
        //There are two types of type casting
        // Implicit --> lower size to higher size automatically

        byte b = 10;
        int i = 220;

        // i = b;

        System.out.println(i);

        //Explicit --> when you try to store higher bits size to lower one 

        b = (byte)i;

        System.out.println(b);

        char a = 'a';
        char s = 'b';

        System.out.println(a+s);


    }
}

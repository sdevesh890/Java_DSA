package Arrays;

import java.util.Scanner;

public class Intro {

    public static void Display(int arr[])
    {
         for(int i=0; i<arr.length; i++)
         {
            System.out.println(arr[i]);
         }
    }
    public static void swapping(int arr[] , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
         
        // Method 1
        // int arr[];
        // arr = new int[5];

        //method - 2
        // int arr[] = new int[5];

        // //Update
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // //How to access 
        // System.err.println(arr[0]);
        // System.err.println(arr[2]);

        // //Copy array
        // // other array reference to arr
        // int other[] = arr;
        // arr[1] = 56;
        // System.err.println(other[1]);
        // System.err.println(arr[1]);

        // input array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
         arr[i] = sc.nextInt();

        //  swapping(arr, 0, 1);
        //  Display(arr);

        //Reference swapping
        // int arr[] = {10,20,30,40,50};
        // int brr[] = {100,200,300,400,500};

        // System.out.println(arr[0] + " " + brr[0]);
        // int other[] = arr;
        // arr = brr;
        // brr = other;

        // System.out.println(arr[0] + " " + brr[0]);
    }
}

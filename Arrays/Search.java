package Arrays;

import java.util.Scanner;

public class Search {

    public static int search(int arr[],int item)
    {
         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]==item)
            return i;
         }
         return -1;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<n; i++)
            {
                System.out.print("Please enter the elements");
                arr[i] = sc.nextInt();
            }

            System.out.println("Please enter the item you wants to find it!!");
            int item = sc.nextInt();

            int res = search(arr,item);

            System.out.println(res);
    }
}

import java.util.*;
import java.io.*;
import java.lang.*;
public class assign10 {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digit or count");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values");
        for( i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        if(sum>15) {
            System.out.println( " Sum of even numbers is:" + sum);
            System.out.println("True");
        }
        else{
            System.out.println("Sum of even numbers is: " + sum);
            System.out.println("False");

        }
}}

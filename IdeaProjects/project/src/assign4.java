import java.io.*;
import java.util.Scanner;
public class assign4 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        int i,n=1;
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        while(n<=i)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(n);
            }
            n=n+1;
        }
    }
}

import java.io.*;
import java.util.*;

import static java.util.Collections.reverseOrder;

public class assign7 {
    public static void main(String[] args) {
        System.out.println("Enter a  number between 1 to 50");
        Scanner sc = new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        do{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number:");
            i= s.nextInt();
        if (i > n)
                System.out.println("Number greater then original number");
            else if (i < n)
                System.out.println("Number less than original number");
            else
                System.out.println("Number is original number");
        } while (i != n);


    }
}


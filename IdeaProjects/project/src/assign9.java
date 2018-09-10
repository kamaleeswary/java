
import java.io.*;
import java.util.*;
import java.lang.*;
public class assign9 {
    public static void main(String[] args) {
     try {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number and then string");
         int n = sc.nextInt();
         String str = sc.nextLine();
         String s = "";
         String reverse = str;
         for (int i = str.length() - n; i < str.length(); i++) {
             s = s + str.charAt(i);
         }
         while (n > 0) {
             reverse = reverse + s;
             n--;
         }
         System.out.println("Reversed string is:");
         System.out.println(reverse);
     }
     catch(InputMismatchException e)
     {
         System.out.println("Input mismatch please enter integer first then string");
     }
    }
}

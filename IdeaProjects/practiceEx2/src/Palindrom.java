import java.util.*;
import java.lang.*;
public class Palindrom {
    public boolean reversestring(String a)
    {
        String  b = "";
        boolean flag=false;
        //Scanner s = new Scanner(System.in);
       // System.out.print("Enter the string you want to check:");
       // a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        System.out.println("Reverse String is "+b);
        if(a.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }

        //  public static void main(String[] args) {
    }
      /*     String a, b = "";
           Scanner s = new Scanner(System.in);
           System.out.print("Enter the string you want to check:");
           a = s.nextLine();
           int n = a.length();
           for (int i = n - 1; i >= 0; i--) {
               b = b + a.charAt(i);
           }
           if (a.equalsIgnoreCase(b)) {
               System.out.println("The string is palindrome.");
           } else {
               System.out.println("The string is not palindrome.");
           }
      // }*/
}

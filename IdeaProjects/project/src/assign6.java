import java.io.*;
import java.lang.*;
import java.util.*;
public class assign6 {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    String s = sc.nextLine();
    char  ch = s.charAt(0);
   /* switch(ch)
    {
        case Character.isUpperCase(ch):
            System.out.println("A uppercase latter");
            break;
        case s>=97 && s<=123:
            System.out.println("A lowercase latter");
            break;
        default:
            System.out.println("Special symbol");

    }  */
   if(Character.isUpperCase(ch))
        System.out.println("Capital latter");
    else if (Character.isLowerCase(ch))
        System.out.println("Smaller latter");
    else if(Character.isDigit(ch))
        System.out.println("Its a Digit");
    else
       System.out.println("Special symbol");
}}

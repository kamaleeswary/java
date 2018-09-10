import java.io.*;
import java.util.*;
public class assign8 {
        public static void main(String[] args)
        {
            int n;
            System.out.println("Enter string to reverse:");
            Scanner read = new Scanner(System.in);
            String str = read.nextLine();
            String reverse = "";
            if(str == null || str.isEmpty()){
                System.out.println("String empty");
            }
            for(int i = str.length() -1; i>=0; i--){
                reverse = reverse + str.charAt(i);
            }

            System.out.println(reverse);
        }
           /* if((str.length()%2)==0)
            {
                for(int i = str.length()-1 ; i >= str.length()/2; i--)
                {
                    reverse = reverse + str.charAt(i);
                }
                int sr=reverse.length();
                for(int i=sr-1;i>=0;i--)
                {
                    reverse = reverse+str.charAt(i);
                }
                System.out.println("Reversed string is:");
                System.out.println(reverse);
            }
        else{
                for(int i = str.length()-1 ; i >= str.length()/2; i--)
                {
                    reverse = reverse + str.charAt(i);
                }
                int sr=reverse.length();
                for(int i=sr-2;i>=0;i--)
                {
                    reverse = reverse+str.charAt(i);
                }
                System.out.println("Reversed string is:");
                System.out.println(reverse);
            }*/
    }


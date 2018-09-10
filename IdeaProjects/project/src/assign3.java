import java.io.*;
import java.util.*;
import java.lang.*;
public class assign3 {
    public static void main(String[] args) {
        String st;
        boolean isVowel=false;
        Scanner s = new Scanner(System.in);
          st=s.nextLine();
          try{
          for(int i=0;i<st.length();i++) {
              char ch = st.charAt(i);
              if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 91)) {
                  if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' | ch == 'A' | ch == 'E' | ch == 'I' | ch == 'O' | ch == 'U')
                      System.out.print("Vowel ");
                  else
                      System.out.print("Consonant ");
              } else
                  System.out.print("Input is not a latter");
          }}
          catch(InputMismatchException e)
          {
              System.out.print("Not a latter");
          }
          }
          }

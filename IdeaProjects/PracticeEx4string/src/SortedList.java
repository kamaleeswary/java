import java.util.*;

public class SortedList {
    public String sort(String str){
       // Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
        String str2="";
        String[] str1=str.split(" ");
        Arrays.sort(str1);
        for(String s:str1){
              str2=str2+s+" ";
              str2.trim();
        }
         return str2;
    }
}

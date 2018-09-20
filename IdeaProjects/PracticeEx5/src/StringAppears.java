import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAppears {
    //public static void main(String[] args) {
    public HashMap<String,Boolean> stringappears(String str){
        HashMap<String,Integer> mp=new HashMap<>();
        HashMap<String,Boolean> mp1=new HashMap<>();
        //Scanner sc=new Scanner(System.in);
        String [] keys = new String[mp.size()];
        System.out.println("Enter String with ,");
        //String str= sc.nextLine();
        //String key="";
       // String str1="[@-_\\*\\?]";
        String[] words = str.split(",");
        for (String word : words) {
            if (mp.get(word)==null) {
                mp.put(word, 1);
            } else {
                mp.put(word, mp.get(word) + 1);
            }
        }
        for (String key: mp.keySet()) {
            System.out.println("key : " + key);
            System.out.println("value : " + mp.get(key));
           if (mp.get(key)>=2)
           {
               mp1.put(key,true);
           }
           else
               mp1.put(key,false);
        }
        System.out.println(mp);
        System.out.println(mp1);
        return mp1;
    }
}

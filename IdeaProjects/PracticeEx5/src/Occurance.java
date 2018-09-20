import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {
    //public static void main(String[] args) {
    public HashMap<String,Integer> occurance(String str){
        HashMap<String,Integer> mp=new HashMap<>();
//        Scanner sc=new Scanner(System.in);
//        String str= sc.nextLine();
//        String str1="[@-_\\*\\?]";
      //String[] words = str.split(",|@|\\*|\\?|-|_| ");
       // String[] words = str.split("@| ");
      // String[] words = str.split("^(?<!one).+|^(two)|^(three)");
        String[] words = str.split("[^a-zA-Z]");
        for (String word : words) {
            if(word.length()>=1) {
                //if (mp.get(word)==null) {
                if (mp.containsKey(word)) {
                    mp.put(word, mp.get(word) + 1);
                } else {

                    mp.put(word, 1);
                }
            }
        }
        System.out.println(mp);
        return mp;
    }
    }


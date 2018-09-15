import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccurance {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("/home/niit/Desktop/playground/practiceEx2/src/one.txt");
            Map<String, Integer> wordsWithCount = new HashMap<String, Integer>();
            if (file.exists()) {
                BufferedReader sc=new BufferedReader(new FileReader(file));
               // Scanner sc = new Scanner(file);
                String str;
                while ((str=sc.readLine())!=null) {
                    //  if (sc.hasNext()){
                    String[] words = str.split(" ");
                    for (String word : words) {
                        if (wordsWithCount.containsKey(word)) {
                            wordsWithCount.put(word, wordsWithCount.get(word) + 1);
                        } else {
                            wordsWithCount.put(word, 1);
                        }
                    }
                }
                System.out.println(wordsWithCount);
            }
        } catch (FileNotFoundException e){
        System.out.println("File Does't Exist");}
    }
}

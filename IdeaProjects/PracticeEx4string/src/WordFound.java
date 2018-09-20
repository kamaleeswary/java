import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFound {
    public String found(String str){
    //public static void main(String[] args) {
       // String str="This is Harry";
        boolean flag=false;
        String result="";
        Pattern pattern=Pattern.compile("Harry");
        Matcher matcher= pattern.matcher(str);
        while(matcher.find())
        {
            flag=true;
        }
        if(flag)
        {
            System.out.println("Harry is present");
            result="Harry is present";
            return result;
        }
        else
        {
            System.out.println("Harry is not present");
            result="Harry is not present";
            return result;
        }

    }
}

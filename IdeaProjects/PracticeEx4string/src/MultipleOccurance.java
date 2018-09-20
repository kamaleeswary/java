import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {
    public String patternMatcher(String sentence,String patternstyle) {

        StringJoiner st=new StringJoiner("\n");
        //String str = "She sells seashells by the seashore";
        Pattern pattern = Pattern.compile(patternstyle);
        Matcher matcher = pattern.matcher(sentence);
        while(matcher.find())
        {
            st.add("Found at:"+matcher.start()+" - "+matcher.end());
        }
        System.out.println(st.toString());
        return st.toString();
    }
}

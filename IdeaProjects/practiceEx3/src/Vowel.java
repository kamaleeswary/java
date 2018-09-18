import java.sql.SQLOutput;

public class Vowel {
    public String[] vowel()
    {
        String[] str={"India",  "United States","Germany","Egypt","czechoslovakia"};
        //System.out.println( str[0].replace("[aeiouAEIOU]",""));
        for(int i=0;i<str.length;i++)
        {
            str[i] = str[i].replaceAll("[aeiou]","");
            System.out.println("  Place Name without Vowels: "+i +" "+str[i]);
        }
        return str;
    }
    public static void main(String[] args) {
        Vowel vw=new Vowel();
        vw.vowel();

    }
}

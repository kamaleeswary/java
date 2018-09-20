
public class characterReplace {
    public String replace(String str)
    {
        String str1=str.replace("d","f");
        str1=str1.replace("l","t");
        System.out.println(str1);
        return str1;
    }

    public static void main(String[] args) {
        characterReplace ch=new characterReplace();
        ch.replace("daily dry");
    }
}

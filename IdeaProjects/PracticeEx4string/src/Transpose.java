public class Transpose {

    public String transpose(String str2){
   // public static void main(String[] args) {
     //   String s = "a quick brown fox jumps over the lazy dog";
      //  int end = s.length()-1;
        String[] str1 = str2.split(" ");
        String t = "";
        for (String str : str1) {
            for(int i = str.length() - 1; i >= 0; i--) {
                t = t + str.charAt(i);
            }
            t=t+" ";
        }
        System.out.println(t);
        return t;
    }
}

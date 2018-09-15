import java.io.*;

public class Filereader {
    public static void main(String[] args) {
        try {
            BufferedReader br = null;
            String strLine = "";
            long length;
            File file = new File("/home/niit/Desktop/playground/practiceEx2/src/one.txt");
            length = file.length();
            FileReader filereader = new FileReader(file);
            br = new BufferedReader(filereader);
            while( (strLine = br.readLine()) != null){
                if(strLine==null)
                    break;
                System.out.println(strLine.toUpperCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input Output exception");
        }
    }
}
  /*  public String[] filereader() {
        try {
            BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("/home/niit/text/one.text"), "ASCII"));
            while(true)
            {
                String line = fr.readLine();
                if(line==null)
                    break;
                String[] words = line.split(" ");//those are your words
                System.out.println(words);
                return words;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
        }*/


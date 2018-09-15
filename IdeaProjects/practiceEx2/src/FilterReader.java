import java.io.*;

public class FilterReader {
    public void readfile(String str, String ext) {
        File[] faFiles = new File(str).listFiles();
        System.out.println(faFiles.length);
        for (File file : faFiles) {
            if (file.getName().contains(".txt")) {
                System.out.println(file.getName());
                try {
                    BufferedReader br = null;
                    String strLine = "";
                    long length;
                    File fileinner = new File("/home/niit/Desktop/playground/practiceEx2/src/" +file.getName());
                    FileReader filereader = new FileReader(file);
                    br = new BufferedReader(filereader);
                    while ((strLine = br.readLine()) != null) {
                        System.out.println(strLine);
                    }
                }
                catch(FileNotFoundException e)
                {
                    System.out.println("file not found");
                }
                catch(IOException e)
                {
                    System.out.println("Input output exception");
                }
            }
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }}
        public static void main(String[] args)throws IOException {
            String folder = "/home/niit/Desktop/playground/practiceEx2/src/";
            String extention = ".txt";
            FilterReader filterfile = new FilterReader();
            filterfile.readfile(folder, extention);
        }
    }

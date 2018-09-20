import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Characteroccurance {
    public int charoccurance(String str)
    {
        int count=str.length()-str.replace("a","").length();
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        Characteroccurance co=new Characteroccurance();
        co.charoccurance("Java is java again java again ");
    }
}

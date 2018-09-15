import java.util.Scanner;

public class Powerof4 {

    public boolean power(long number) {
        //Scanner s=new Scanner(System.in);
        boolean flag=false;
       // System.out.println("Enter a number to check power of 4");
       // long n=s.nextLong();
        if(number==0)
        {
            return false;
        }
        else{
            while(number!=1){
                if(number%4==0){
                    flag=true;
                    number=number/4;
                }
                else
                {
                    flag=false;
                    number=number/4;
                }
            }
        }
        if(flag==true){
            System.out.println("number is power of 4");
        return true;}
        else{
            System.out.println("number is not power of 4");return false;}

    }
}
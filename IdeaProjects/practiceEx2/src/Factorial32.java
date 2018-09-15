import java.util.Scanner;

public class Factorial32 {
    public static String fact(int num){
        int fact = 1;
        var factorial="";
        int[] a=new int[10];
        for (int i = 1; i < num+1; i++) {
                fact = fact * i;
                factorial=""+fact;
            }

            if(factorial.length()<10){
                System.out.println("Factorial of "+num+" is :"+factorial);
                return factorial;}
            else{
                System.out.println("Number " +num + " is out of range");
            return null;}
        }
    /*public static void factlong(long num){
        long fact = 1;
        for (int i = 1; i < num+1; i++) {
            if(i<=20){
                fact = fact * i;
                System.out.println("Factorial of number " + i + " is " + fact);
            }
            else
                System.out.println("Number " +i+ " is out of range");
        }

    }*/
  /*  public static void main(String[] args) {
        System.out.println("Choices: 1 or 2");
        System.out.println("Select 1 for less then 12 else 2 for gretare then 12 and less then 21");
        Scanner sc = new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter number");
                int number = sc.nextInt();
                fact(number);
                break;
            case 2:
                System.out.println("Enter number");
                int numberlong = sc.nextInt();
               // factlong(numberlong);
                break;
            default:
                System.out.println("Enter valid choice either 1 or 2");
        }
    }*/
}

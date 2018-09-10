import java.io.*;
import java.util.*;
public class project {
    public static void main(String[] args) {
        System.out.print("Hello world");
        long i;
        Scanner s = new Scanner(System.in);
        i = s.nextLong();
      /*  System.out.println("Hello world");
        if (i > 6) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
       switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("six");
        }*/
        long n=i,r=0;
        long rem=0,rev=0,sum=0;
            while (n != 0) {
                rem = n % 10;
                rev = rem + rev * 10;
                n = n / 10;
            }
        if(i==rev)
        {
            System.out.println(i+" is a palindrome number");
                 while(rev!=0) {
                      r = rev % 10;
                     if (r % 2 == 0) {
                         sum = sum + r;
                         rev= rev/ 10;
                     } else {
                         rev = rev / 10;
                     }
                 }
                 if(sum>25)
                 {
                     System.out.println("sum of even number is greater then 25");
                 }
                 else{
                     System.out.println("sum of even number  is less then 25");
                 }
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}

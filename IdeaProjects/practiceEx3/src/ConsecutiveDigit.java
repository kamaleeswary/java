import java.util.Scanner;

public class ConsecutiveDigit {
    public boolean consecutive()
    {
        String str="1,2,3,4,5,6";
        boolean flag = false;
        System.out.println("Enter digits with use of ,");
      //  Scanner sc = new Scanner(System.in);
        //str = sc.next();
        String str1[] = str.split(",");
        int diff = Integer.parseInt(str1[1]) - Integer.parseInt(str1[0]);
      //  if(str.length()==7) {
            if (diff == 1) {
                for (int i = 0; i < str1.length - 1; i++) {
                    int diff1 = Integer.parseInt(str1[i+1]) - Integer.parseInt(str1[i ]);
                    if (diff == diff1)
                        flag = true;
                    else
                        flag = false;

                }
            } else
                flag = false;
        //}
//        else
//        {
//            flag=false;
//       }
        if (flag) {
            System.out.println(str + "is a consecutive numbers ");
            return flag;
        } else{
            System.out.println(str + "Non consecutive numbers");
        return flag;}

    }
    public static void main(String[] args) {
        ConsecutiveDigit cd=new ConsecutiveDigit();
        cd.consecutive();
               }

    }

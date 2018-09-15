import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Grade{
    public int[] grade(int arr[]) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        int[] result=new int[3];
        result[0]=min;
        arr[1]=max;
        arr[2]=(int)avg;
        System.out.println("Maximum is:" + max);
        System.out.println("Minimum is:" + min);
        System.out.println("Average is:" + avg / arr.length);
        return arr;
    }
    public static void main(String[] args) {
        Grade gradeobj=new Grade();
        System.out.println("Enter number of student:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] result=new int[num];
        for(int i=0;i<num;i++)
        {
        System.out.println("Enter Grade for student  "+i+1+" : ");
        result[i]=sc.nextInt();
    }
    gradeobj.grade(result);
}
}

import java.util.Scanner;

public class StudentDetail {
    int number;
    int[] studentgrade;
    String str;

    StudentDetail(int num,int[] studentgrade)
    {
        System.out.println(" hi ");
         this.number=num;
         this.studentgrade=studentgrade;
    }
    public String studentdetails(){
        System.out.println(studentgrade.length);
        for(int i=0;i<number;i++)
        {
            if(studentgrade[i]>=0&&studentgrade[i]<=100){
                System.out.println("Detail of Student "+i+"is :"+studentgrade[i]);
               return  str="true";
            }
            else
               return  str="false";
        }
      return null;
    }
}

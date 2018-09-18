import java.sql.SQLOutput;
import java.util.Scanner;

public class MatrixAddition {
    int[][] a=new int[2][2];
    int[][] b=new int[2][2];
    int[][] c=new int[2][2];
    int i,j;
    int row,col;
    MatrixAddition(int[][] a,int[][]b){
        this.a=a;
        this.b=b;
    }
    public int[][] add()
    {
      /*  System.out.println("Enter row numebr");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter column number");
        int col=sc.nextInt();
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix1 value");
        for(i=0;i<row;i++) {
            for (j = 0; j < col; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter matrix2 value");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
                a[i][j]=sc.nextInt();
        }
        for(i=0;i<row;i++) {
            for (j = 0; j < col; j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        return c;*/
        System.out.println(" hi ");
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]);
        }}
        return c;
    }
}

import java.util.*;
public class assign5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        try {
        System.out.println("Enter the number of element in an array: ");
        int n=input.nextInt();
     
               int[] array = new int[n];
               System.out.println("Enter the elements:");
               for (int i = 0; i < n; i++) {
                   array[i] = input.nextInt();
               }
               for (int num : array)
                   total = total + num;
               System.out.println("Sum of array elements is:" + total);
           }
       catch (InputMismatchException e) {
            System.out.println("Input is not a valid integer");
        }
    }
    }

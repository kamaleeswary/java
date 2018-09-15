public class Factorial64 {
    public static String fact64(int num){
        int fact = 1;
        var factorial="";
        int[] a=new int[10];
        for (int i = 1; i < num+1; i++) {
            fact = fact * i;
            factorial=""+fact;
        }

        if(factorial.length()<20){
            System.out.println("Factorial of "+num+" is :"+factorial);
            return factorial;}
        else{
            System.out.println("Number " +num + " is out of range");
            return null;}
    }
}

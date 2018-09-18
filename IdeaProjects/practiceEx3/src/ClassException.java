public class ClassException {

    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            if(b==0)
            throw new Exception("Exception calling");
            else
                System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is the final block");
        }
    }
}

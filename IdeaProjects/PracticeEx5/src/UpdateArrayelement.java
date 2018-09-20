
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateArrayelement  {
    public List<String> updatearray(List<String> list,String target,String source){
  //  public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
       // List<String> list = new ArrayList<>();
        try {
            int index = -1;
//            list.add("Apple");
//            list.add("Grape");
//            list.add("Melon");
//            list.add("Berry");
            System.out.println("Array list Before update");
            System.out.println(list);
            System.out.println("Array list after update");
          //  Scanner sc = new Scanner(System.in);
            String found = target;
            if (list.contains(found))
                index = list.indexOf(found);
            else{
                index = -1; }
            list.set(index, source);
            System.out.println(list);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound");
        }
        // list.get(0).replace("Kiwi","Apple");
        return list;
    }
}

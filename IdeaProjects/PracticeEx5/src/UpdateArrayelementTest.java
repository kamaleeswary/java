import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayelementTest {

    @org.junit.Test
    public void updatearray() {
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        UpdateArrayelement up=new UpdateArrayelement();
        List<String> result=new ArrayList<>();
        result.add("Apple");
        result.add("Grape");
        result.add("Mango");
        result.add("Berry");
       assertEquals(
               result,
               up.updatearray(list,"Melon","Mango"));
        List<String> result1=new ArrayList<>();
        result1.add("Kiwi");
        result1.add("Grape");
        result1.add("Mango");
        result1.add("Berry");
        assertEquals(result1,up.updatearray(list,"Apple","Kiwi"));
    }
}
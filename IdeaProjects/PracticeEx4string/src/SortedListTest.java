import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    @Test
    public void sort() {
        SortedList sl=new SortedList();
       String result= sl.sort("banana cat dog apple elephent");
        assertEquals("apple banana cat dog elephent ",result);
    }
}
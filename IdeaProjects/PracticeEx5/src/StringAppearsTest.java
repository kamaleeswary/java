import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StringAppearsTest {

    @Test
    public void stringappears() {
        HashMap<String,Boolean> mp1=new HashMap<>();
        mp1.put("a",true);
        mp1.put("b",false);
        mp1.put("c",true);
        mp1.put("d",false);
        StringAppears strapp=new StringAppears();
        assertEquals(mp1,strapp.stringappears("a,b,c,d,a,c,c"));
    }
}
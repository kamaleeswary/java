import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapValueTest {

    @Test
    public void mapvalue() {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("val1", "C++");
        hm.put("val2", "java");
        Map<String, String> hm1 = new HashMap<String, String>();
        hm1.put("val2", "C++");
        hm1.put("val1", " ");
        MapValue mv=new MapValue();
        assertEquals(hm1,mv.mapvalue(hm));
    }
}
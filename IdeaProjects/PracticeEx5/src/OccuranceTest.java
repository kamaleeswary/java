import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class OccuranceTest {

    @Test
    public void occurance() {
        Occurance occurance=new Occurance();
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("one",5);
        mp.put("two",2);
        mp.put("three" ,2);
        assertEquals(mp,occurance.occurance("one one -one___two,,three,one @three*one?two"));
    }
}
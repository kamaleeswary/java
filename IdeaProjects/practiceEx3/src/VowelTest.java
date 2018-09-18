import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {

    @Test
    public void vowel() {
        Vowel vw=new Vowel();
        String [] excepted1={"Ind","Untd Stts" ,"Grmny","Egypt","czchslvk"};
        String[] result1;
        result1=vw.vowel();
        //assertEquals(expected,result);
        assertEquals(excepted1,result1);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class characterReplaceTest {

    @Test
    public void replace() {
        characterReplace co=new characterReplace();
        String excepted="faity fry";
        String result=co.replace("daily dry");
        assertEquals(excepted,result);
    }
}
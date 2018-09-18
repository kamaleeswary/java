import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveDigitTest {

    @Test
    public void consecutive() {
         ConsecutiveDigit con=new ConsecutiveDigit();
        boolean excepted1=true;
        boolean result1;
        result1=con.consecutive();
        excepted1=true;
        //assertEquals(expected,result);
        assertEquals(excepted1,result1);
    }
}
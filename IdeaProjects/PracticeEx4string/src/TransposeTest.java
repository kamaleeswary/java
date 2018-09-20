import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    @Test
    public void transpose() {
         Transpose t=new Transpose();
        String st= t.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god ",st);
    }
}

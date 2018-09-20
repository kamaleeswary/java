import org.junit.Test;

import static org.junit.Assert.*;

public class WordFoundTest {

    @Test
    public void found() {
        WordFound wf=new WordFound();
       //String result=wf.found("This is Harry");
        assertEquals("Harry is present",wf.found("This is Harry"));

    }
}
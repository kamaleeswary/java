import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {


    MultipleOccurance m=new MultipleOccurance();
    @Test
    public void checkValidate(){

        assertEquals("Found at:4 - 6\nFound at:10 - 12\nFound at:27 - 29",m.patternMatcher("She sells seashells by the seashore","se"));




    }



}
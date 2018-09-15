import org.junit.Test;

import java.io.*;
import java.lang.*;

import static org.junit.Assert.*;

public class EvennumberTest {

    @org.junit.Test
    public void iseven() {
        Evennumber evennumber=new Evennumber();
        //arrange
        boolean expected=true;
        //act
        boolean result=evennumber.iseven(4);
        //assert
        assertEquals(expected,result);
    }
   /* @Test
    public void filereader()
    {
        String testFileName = "/path/to/test/file/testFile";
        String expected = "my test";
       // SearchPhrase searchPhrase = new SearchPhrase();
       // String result = searchPhrase.read(testFileName);
        BufferedReader br=new BufferedReader(new FileReader(testFileName));
        String result= br.read("hii");
        assertEquals(expected, result);
    }*/
}
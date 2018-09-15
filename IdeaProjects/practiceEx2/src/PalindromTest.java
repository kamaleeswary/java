import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void reversestring() {
        //assert
        boolean excepted= false;
        //act
        Palindrom palindrom=new Palindrom();
        boolean result= palindrom.reversestring("sanju");
        //assertion
        assertEquals(excepted,result);
    }
    @Test
    public void iseven()
    {
        Evennumber evennumber=new Evennumber();
        //arrange
        boolean expected=false;
        //act
        boolean result=evennumber.iseven(1);
        //assert
        assertEquals(expected,result);
    }
    @Test
    public void power(){
        Powerof4 power=new Powerof4();
        //arrange
        boolean expected=true;
        //act
        boolean result=power.power(64);
        //assert
        assertEquals(expected,result);
    }
   /* @Test
    public void filereader(){
       // assertEquals(
               // "ipl.csv", dataMunger.getFileName("select city,winner,team1,team2 from ipl.csv"));
        String testFileName = "/path/to/test/file/testFile";
        String expected = "my test";
        SearchPhrase searchPhrase = new SearchPhrase();
        String result = searchPhrase.read(testFileName);
        assertEquals(expected, result);
    }*/
   @Test
    public void grade()
    {
        Grade grade=new Grade();
        int [] expected={5,1,3};
        int[] result={5,1,3};
        assertEquals(expected,result);

    }
    @Test
    public void fact()
    {
        Factorial32 fact=new Factorial32();
        String expected="479001600";
        String result=fact.fact(12);
        assertEquals(expected,result);
    }


}
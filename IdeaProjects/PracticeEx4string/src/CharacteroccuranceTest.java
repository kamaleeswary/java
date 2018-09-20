import static org.junit.Assert.*;

public class CharacteroccuranceTest {

    @org.junit.Test
    public void charoccurance() {
        Characteroccurance co=new Characteroccurance();
        int excepted=10;
        int result=co.charoccurance("Java is java again java again");
        assertEquals(excepted,result);
    }
}
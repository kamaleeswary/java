import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDetailTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void studentdetails() {
        //arrange
        String expected="true";
        //act
        StudentDetail student=new StudentDetail(2, new int[]{34, 76});
        String result=student.studentdetails();
        //assert
        assertEquals(expected,result);
    }
}
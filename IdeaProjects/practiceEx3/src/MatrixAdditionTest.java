import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        int[][] expected;
        expected = new int[][]{{10, 10}, {10, 10}};
        //act
        MatrixAddition ma=new MatrixAddition(new int[][]{{5,5},{5,5}},new int[][]{{5,5},{5,5}});
        int[][] result;
        result=ma.add();
        //assert
        MatrixAddition ma1=new MatrixAddition(new int[][]{{2,2},{2,2}},new int[][]{{2,2},{2,2}});
       int [][] excepted1;
        int[][] result1;
        result1=ma1.add();
        excepted1=new int [][]{{4,4},{4,4}};
        assertEquals(expected,result);
        assertEquals(excepted1,result1);
    }
}
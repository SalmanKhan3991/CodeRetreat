
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {

    int[][] testGrid = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0}
    };

    @Before
    public void setup() {
    }

    @Test
    public void testNumOfNeighbours() {

        Assert.assertEquals(4, MainClass.NumOfNeighbours(testGrid, 2,2));
    }

    @Test
    public void testNegativeNumberOfNeighbours() {
        Assert.assertEquals(-1, MainClass.NumOfNeighbours(testGrid, 2 ,3));
    }

    @Test
    public void testInvalidNumberOfNeighbours() {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5;j++) {
                Assert.assertTrue((MainClass.NumOfNeighbours(testGrid, i,j) > 0) && (MainClass.NumOfNeighbours(testGrid,i,j) < 9) );
            }
        }

    }
}
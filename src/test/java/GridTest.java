import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class GridTest extends TestCase {

    Grid grid = new Grid(10,10);

    @Before
    private void setup() {
    }

    @Test
    public void testGetCell() {
        grid.setCell(true, 2 ,1 );
        assertEquals(grid.getCell(2,1), true);
    }

    public void testSetCell() {
    }
}
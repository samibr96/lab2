
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Scaniatest {

   

    @Test
    public void testgetCurrentSpeed() {
        Scania scaniatest = new Scania(Direction.WEST ,  0,  0);
        scaniatest.increaseAngle(1,70);
        assertEquals(0,scaniatest.getCurrentSpeed(), 0);
    }

    
    
}

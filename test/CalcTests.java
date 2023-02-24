import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTests {

    @org.junit.jupiter.api.Test
    public void testAlgorithmArray() {
        double[] percKilled = Moral.testAlgorithm(100);
        boolean allZero = true, allOne = true;
        assertEquals(20, percKilled.length);
        for (double perc : percKilled) {
            assertTrue(perc >= 0);
            assertTrue(perc <= 1);

            if(perc != 0)
                allZero = false;
            if(perc != 1)
                allOne = false;
        }
        assertFalse(allZero);
        assertFalse(allOne);
    }

    @org.junit.jupiter.api.Test
    public void killedMost(){
        double[] percKilled;

        for(int i = 0; i < 20; i++){
            percKilled = new double[20];
            percKilled[i] = 1;
            assertEquals(Generator.getMemberName((char)(i+Generator.MAN)), Moral.killedMost(percKilled));
        }
    }

    @org.junit.jupiter.api.Test
    public void killedLeast(){
        double[] percKilled;
        for(int i = 0; i < 20; i++){
            percKilled = new double[20];
            Arrays.fill(percKilled, 1);
            percKilled[i] = 0;
            assertEquals(Generator.getMemberName((char)(i+Generator.MAN)), Moral.killedLeast(percKilled));
        }
    }


}

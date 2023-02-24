import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratorTests {

    //Used only to ensure that the provided Generator class performs as expected.
    //Your code should not affect the outcome of these tests.

    @org.junit.jupiter.api.Test
    public void testScenarios() {
        int[] validScenarioOptions = {0, 1, 2, 10, 11, 12, 20, 21, 22};
        int[] validScenarioCounts = new int[validScenarioOptions.length];

        for (int i = 0; i < 100; i++) {

            boolean validScenario = false;

            int scenario = Generator.getScenario();

            for(int j = 0; j < validScenarioOptions.length; j++){
                if(validScenarioOptions[j] == scenario) {
                    validScenario = true;
                    validScenarioCounts[j]++;
                    break;
                }
            }
            assertTrue(validScenario);
        }

        for (int validScenarioCount : validScenarioCounts) {
            assertTrue(validScenarioCount > 0);
        }
    }

    @org.junit.jupiter.api.Test
    public void testGroups() {
        for(int i = 0; i < 1000; i++){
            String group = Generator.getGroup();
            assertTrue(group.length() > 0);
            assertTrue(group.length() <= 5);
            for(int j = 0; j < group.length(); j++){
                assertTrue("abcdefghijklmnopqrst".indexOf(group.charAt(j)) >= 0);
            }
        }
    }

    @org.junit.jupiter.api.Test
    public void testNameEndpoints() {
        assertEquals("Man", Generator.getMemberName('a'));
        assertEquals("Cat", Generator.getMemberName('t'));
    }
}

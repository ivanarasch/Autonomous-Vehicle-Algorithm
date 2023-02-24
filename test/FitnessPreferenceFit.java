import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FitnessPreferenceFit {

    @org.junit.jupiter.api.Test
    public void fitVsNormal() {
        assertTrue(Moral.decideSwerve(0, "mnmnmnmnmnmn","abcdefijkloq"));
        assertFalse(Moral.decideSwerve(0, "abcdefijkloq","mnmnmnmnmnmn"));
    }

    @org.junit.jupiter.api.Test
    public void fitVsObese() {
        assertTrue(Moral.decideSwerve(0, "mn","gh"));
        assertFalse(Moral.decideSwerve(0, "gh","mn"));
    }

    @org.junit.jupiter.api.Test
    public void normalVsObese() {
        assertTrue(Moral.decideSwerve(0, "abcdefijkloq","ghghghghghgh"));
        assertFalse(Moral.decideSwerve(0, "ghghghghghgh","abcdefijkloq"));
    }


}
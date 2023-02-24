import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FitnessPreferenceBig {

    @org.junit.jupiter.api.Test
    public void fitVsNormal() {
        assertFalse(Moral.decideSwerve(0, "mnmnmnmnmnmn","abcdefijkloq"));
        assertTrue(Moral.decideSwerve(0, "abcdefijkloq","mnmnmnmnmnmn"));
    }

    @org.junit.jupiter.api.Test
    public void fitVsObese() {
        assertFalse(Moral.decideSwerve(0, "mn","gh"));
        assertTrue(Moral.decideSwerve(0, "gh","mn"));
    }

    @org.junit.jupiter.api.Test
    public void normalVsObese() {
        assertFalse(Moral.decideSwerve(0, "abcdefijkloq","ghghghghghgh"));
        assertTrue(Moral.decideSwerve(0, "ghghghghghgh","abcdefijkloq"));
    }
}
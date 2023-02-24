import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgePreferenceYounger {

    @org.junit.jupiter.api.Test
    public void adultsVsChildren() {
        assertFalse(Moral.decideSwerve(0, "abghijklmnpq","cdcdcdcdcdcd"));
        assertTrue(Moral.decideSwerve(0, "cdcdcdcdcdcd","abghijklmnpq"));
    }

    @org.junit.jupiter.api.Test
    public void adultsVsElderly() {
        assertFalse(Moral.decideSwerve(0, "efefefefefef","abghijklmnpq"));
        assertTrue(Moral.decideSwerve(0, "abghijklmnpq","efefefefefef"));
    }

    @org.junit.jupiter.api.Test
    public void elderlyVsChildren() {
        assertFalse(Moral.decideSwerve(0, "ef","cd"));
        assertTrue(Moral.decideSwerve(0, "cd","ef"));
    }


    @org.junit.jupiter.api.Test
    public void baby() {
        assertFalse(Moral.decideSwerve(0, "abcdefghijklmnopqst","rrrrrrrrrrrrrrrrrrr"));
        assertTrue(Moral.decideSwerve(0, "rrrrrrrrrrrrrrrrrrr","abcdefghijklmnopqst"));

    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertFalse(Moral.decideSwerve(0, "abcdefghijklmnpqrst","ooooooooooooooooooo"));
        assertTrue(Moral.decideSwerve(0, "ooooooooooooooooooo","abcdefghijklmnopqrst"));
    }
}
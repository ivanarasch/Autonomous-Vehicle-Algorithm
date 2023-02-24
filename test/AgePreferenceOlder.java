import static org.junit.jupiter.api.Assertions.*;

public class AgePreferenceOlder {

    @org.junit.jupiter.api.Test
    public void adultsVsChildren() {
        assertTrue(Moral.decideSwerve(0, "abghijklmnpq","cdcdcdcdcdcd"));
        assertFalse(Moral.decideSwerve(0, "cdcdcdcdcdcd","abghijklmnpq"));
    }

    @org.junit.jupiter.api.Test
    public void adultsVsElderly() {
        assertTrue(Moral.decideSwerve(0, "efefefefefef","abghijklmnpq"));
        assertFalse(Moral.decideSwerve(0, "abghijklmnpq","efefefefefef"));
    }

    @org.junit.jupiter.api.Test
    public void elderlyVsChildren() {
        assertTrue(Moral.decideSwerve(0, "ef","cd"));
        assertFalse(Moral.decideSwerve(0, "cd","ef"));
    }


    @org.junit.jupiter.api.Test
    public void baby() {
        assertTrue(Moral.decideSwerve(0, "abcdefghijklmnopqst","rrrrrrrrrrrrrrrrrrr"));
        assertFalse(Moral.decideSwerve(0, "rrrrrrrrrrrrrrrrrrr","abcdefghijklmnopqst"));

    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertTrue(Moral.decideSwerve(0, "abcdefghijklmnpqrst","ooooooooooooooooooo"));
        assertFalse(Moral.decideSwerve(0, "ooooooooooooooooooo","abcdefghijklmnopqrst"));
    }
}
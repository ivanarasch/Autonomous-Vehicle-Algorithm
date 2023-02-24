import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenderPreferenceMale {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertTrue(Moral.decideSwerve(0, "a","b"));
        assertFalse(Moral.decideSwerve(0, "b","a"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertTrue(Moral.decideSwerve(0, "c","d"));
        assertFalse(Moral.decideSwerve(0, "d","c"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertTrue(Moral.decideSwerve(0, "e","f"));
        assertFalse(Moral.decideSwerve(0, "f","e"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertTrue(Moral.decideSwerve(0, "g","h"));
        assertFalse(Moral.decideSwerve(0, "h","g"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertTrue(Moral.decideSwerve(0, "i","j"));
        assertFalse(Moral.decideSwerve(0, "j","i"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertTrue(Moral.decideSwerve(0, "k","l"));
        assertFalse(Moral.decideSwerve(0, "l","k"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertTrue(Moral.decideSwerve(0, "m","n"));
        assertFalse(Moral.decideSwerve(0, "n","m"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertTrue(Moral.decideSwerve(0, "a","o"));
        assertFalse(Moral.decideSwerve(0, "o","a"));
    }
}
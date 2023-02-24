import static org.junit.jupiter.api.Assertions.*;

public class GenderPreferenceFemale {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertFalse(Moral.decideSwerve(0, "a","b"));
        assertTrue(Moral.decideSwerve(0, "b","a"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertFalse(Moral.decideSwerve(0, "c","d"));
        assertTrue(Moral.decideSwerve(0, "d","c"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertFalse(Moral.decideSwerve(0, "e","f"));
        assertTrue(Moral.decideSwerve(0, "f","e"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertFalse(Moral.decideSwerve(0, "g","h"));
        assertTrue(Moral.decideSwerve(0, "h","g"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertFalse(Moral.decideSwerve(0, "i","j"));
        assertTrue(Moral.decideSwerve(0, "j","i"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertFalse(Moral.decideSwerve(0, "k","l"));
        assertTrue(Moral.decideSwerve(0, "l","k"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertFalse(Moral.decideSwerve(0, "m","n"));
        assertTrue(Moral.decideSwerve(0, "n","m"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertFalse(Moral.decideSwerve(0, "a","o"));
        assertTrue(Moral.decideSwerve(0, "o","a"));
    }
}
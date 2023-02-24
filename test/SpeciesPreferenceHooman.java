import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpeciesPreferenceHooman {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertTrue(Moral.decideSwerve(0, "a","s"));
        assertFalse(Moral.decideSwerve(0, "s","a"));

        assertTrue(Moral.decideSwerve(0, "a","t"));
        assertFalse(Moral.decideSwerve(0, "t","a"));

        assertTrue(Moral.decideSwerve(0, "b","s"));
        assertFalse(Moral.decideSwerve(0, "s","b"));

        assertTrue(Moral.decideSwerve(0, "b","t"));
        assertFalse(Moral.decideSwerve(0, "t","b"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertTrue(Moral.decideSwerve(0, "c","s"));
        assertFalse(Moral.decideSwerve(0, "s","c"));

        assertTrue(Moral.decideSwerve(0, "c","t"));
        assertFalse(Moral.decideSwerve(0, "t","c"));

        assertTrue(Moral.decideSwerve(0, "d","s"));
        assertFalse(Moral.decideSwerve(0, "s","d"));

        assertTrue(Moral.decideSwerve(0, "d","t"));
        assertFalse(Moral.decideSwerve(0, "t","d"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertTrue(Moral.decideSwerve(0, "e","s"));
        assertFalse(Moral.decideSwerve(0, "s","e"));

        assertTrue(Moral.decideSwerve(0, "e","t"));
        assertFalse(Moral.decideSwerve(0, "t","e"));

        assertTrue(Moral.decideSwerve(0, "f","s"));
        assertFalse(Moral.decideSwerve(0, "s","f"));

        assertTrue(Moral.decideSwerve(0, "f","t"));
        assertFalse(Moral.decideSwerve(0, "t","f"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertTrue(Moral.decideSwerve(0, "g","s"));
        assertFalse(Moral.decideSwerve(0, "s","g"));

        assertTrue(Moral.decideSwerve(0, "g","t"));
        assertFalse(Moral.decideSwerve(0, "t","g"));

        assertTrue(Moral.decideSwerve(0, "h","s"));
        assertFalse(Moral.decideSwerve(0, "s","h"));

        assertTrue(Moral.decideSwerve(0, "h","t"));
        assertFalse(Moral.decideSwerve(0, "t","h"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertTrue(Moral.decideSwerve(0, "i","s"));
        assertFalse(Moral.decideSwerve(0, "s","i"));

        assertTrue(Moral.decideSwerve(0, "i","t"));
        assertFalse(Moral.decideSwerve(0, "t","i"));

        assertTrue(Moral.decideSwerve(0, "j","s"));
        assertFalse(Moral.decideSwerve(0, "s","j"));

        assertTrue(Moral.decideSwerve(0, "j","t"));
        assertFalse(Moral.decideSwerve(0, "t","j"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertTrue(Moral.decideSwerve(0, "k","s"));
        assertFalse(Moral.decideSwerve(0, "s","k"));

        assertTrue(Moral.decideSwerve(0, "k","t"));
        assertFalse(Moral.decideSwerve(0, "t","k"));

        assertTrue(Moral.decideSwerve(0, "l","s"));
        assertFalse(Moral.decideSwerve(0, "s","l"));

        assertTrue(Moral.decideSwerve(0, "l","t"));
        assertFalse(Moral.decideSwerve(0, "t","l"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertTrue(Moral.decideSwerve(0, "m","s"));
        assertFalse(Moral.decideSwerve(0, "s","m"));

        assertTrue(Moral.decideSwerve(0, "m","t"));
        assertFalse(Moral.decideSwerve(0, "t","m"));

        assertTrue(Moral.decideSwerve(0, "n","s"));
        assertFalse(Moral.decideSwerve(0, "s","n"));

        assertTrue(Moral.decideSwerve(0, "n","t"));
        assertFalse(Moral.decideSwerve(0, "t","n"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertTrue(Moral.decideSwerve(0, "o","s"));
        assertFalse(Moral.decideSwerve(0, "s","o"));

        assertTrue(Moral.decideSwerve(0, "o","t"));
        assertFalse(Moral.decideSwerve(0, "t","o"));
    }

    @org.junit.jupiter.api.Test
    public void homeless() {
        assertTrue(Moral.decideSwerve(0, "p","s"));
        assertFalse(Moral.decideSwerve(0, "s","p"));

        assertTrue(Moral.decideSwerve(0, "p","t"));
        assertFalse(Moral.decideSwerve(0, "t","p"));
    }

    @org.junit.jupiter.api.Test
    public void criminal() {
        assertTrue(Moral.decideSwerve(0, "q","s"));
        assertFalse(Moral.decideSwerve(0, "s","q"));

        assertTrue(Moral.decideSwerve(0, "q","t"));
        assertFalse(Moral.decideSwerve(0, "t","q"));
    }

    @org.junit.jupiter.api.Test
    public void baby() {
        assertTrue(Moral.decideSwerve(0, "r","s"));
        assertFalse(Moral.decideSwerve(0, "s","r"));

        assertTrue(Moral.decideSwerve(0, "r","t"));
        assertFalse(Moral.decideSwerve(0, "t","r"));
    }
}
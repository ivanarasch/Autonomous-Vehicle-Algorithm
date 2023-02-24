import static org.junit.jupiter.api.Assertions.*;

public class SpeciesPreferenceAnimal {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertFalse(Moral.decideSwerve(0, "a","s"));
        assertTrue(Moral.decideSwerve(0, "s","a"));

        assertFalse(Moral.decideSwerve(0, "a","t"));
        assertTrue(Moral.decideSwerve(0, "t","a"));

        assertFalse(Moral.decideSwerve(0, "b","s"));
        assertTrue(Moral.decideSwerve(0, "s","b"));

        assertFalse(Moral.decideSwerve(0, "b","t"));
        assertTrue(Moral.decideSwerve(0, "t","b"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertFalse(Moral.decideSwerve(0, "c","s"));
        assertTrue(Moral.decideSwerve(0, "s","c"));

        assertFalse(Moral.decideSwerve(0, "c","t"));
        assertTrue(Moral.decideSwerve(0, "t","c"));

        assertFalse(Moral.decideSwerve(0, "d","s"));
        assertTrue(Moral.decideSwerve(0, "s","d"));

        assertFalse(Moral.decideSwerve(0, "d","t"));
        assertTrue(Moral.decideSwerve(0, "t","d"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertFalse(Moral.decideSwerve(0, "e","s"));
        assertTrue(Moral.decideSwerve(0, "s","e"));

        assertFalse(Moral.decideSwerve(0, "e","t"));
        assertTrue(Moral.decideSwerve(0, "t","e"));

        assertFalse(Moral.decideSwerve(0, "f","s"));
        assertTrue(Moral.decideSwerve(0, "s","f"));

        assertFalse(Moral.decideSwerve(0, "f","t"));
        assertTrue(Moral.decideSwerve(0, "t","f"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertFalse(Moral.decideSwerve(0, "g","s"));
        assertTrue(Moral.decideSwerve(0, "s","g"));

        assertFalse(Moral.decideSwerve(0, "g","t"));
        assertTrue(Moral.decideSwerve(0, "t","g"));

        assertFalse(Moral.decideSwerve(0, "h","s"));
        assertTrue(Moral.decideSwerve(0, "s","h"));

        assertFalse(Moral.decideSwerve(0, "h","t"));
        assertTrue(Moral.decideSwerve(0, "t","h"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertFalse(Moral.decideSwerve(0, "i","s"));
        assertTrue(Moral.decideSwerve(0, "s","i"));

        assertFalse(Moral.decideSwerve(0, "i","t"));
        assertTrue(Moral.decideSwerve(0, "t","i"));

        assertFalse(Moral.decideSwerve(0, "j","s"));
        assertTrue(Moral.decideSwerve(0, "s","j"));

        assertFalse(Moral.decideSwerve(0, "j","t"));
        assertTrue(Moral.decideSwerve(0, "t","j"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertFalse(Moral.decideSwerve(0, "k","s"));
        assertTrue(Moral.decideSwerve(0, "s","k"));

        assertFalse(Moral.decideSwerve(0, "k","t"));
        assertTrue(Moral.decideSwerve(0, "t","k"));

        assertFalse(Moral.decideSwerve(0, "l","s"));
        assertTrue(Moral.decideSwerve(0, "s","l"));

        assertFalse(Moral.decideSwerve(0, "l","t"));
        assertTrue(Moral.decideSwerve(0, "t","l"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertFalse(Moral.decideSwerve(0, "m","s"));
        assertTrue(Moral.decideSwerve(0, "s","m"));

        assertFalse(Moral.decideSwerve(0, "m","t"));
        assertTrue(Moral.decideSwerve(0, "t","m"));

        assertFalse(Moral.decideSwerve(0, "n","s"));
        assertTrue(Moral.decideSwerve(0, "s","n"));

        assertFalse(Moral.decideSwerve(0, "n","t"));
        assertTrue(Moral.decideSwerve(0, "t","n"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertFalse(Moral.decideSwerve(0, "o","s"));
        assertTrue(Moral.decideSwerve(0, "s","o"));

        assertFalse(Moral.decideSwerve(0, "o","t"));
        assertTrue(Moral.decideSwerve(0, "t","o"));
    }

    @org.junit.jupiter.api.Test
    public void homeless() {
        assertFalse(Moral.decideSwerve(0, "p","s"));
        assertTrue(Moral.decideSwerve(0, "s","p"));

        assertFalse(Moral.decideSwerve(0, "p","t"));
        assertTrue(Moral.decideSwerve(0, "t","p"));
    }

    @org.junit.jupiter.api.Test
    public void criminal() {
        assertFalse(Moral.decideSwerve(0, "q","s"));
        assertTrue(Moral.decideSwerve(0, "s","q"));

        assertFalse(Moral.decideSwerve(0, "q","t"));
        assertTrue(Moral.decideSwerve(0, "t","q"));
    }

    @org.junit.jupiter.api.Test
    public void baby() {
        assertFalse(Moral.decideSwerve(0, "r","s"));
        assertTrue(Moral.decideSwerve(0, "s","r"));

        assertFalse(Moral.decideSwerve(0, "r","t"));
        assertTrue(Moral.decideSwerve(0, "t","r"));
    }
}
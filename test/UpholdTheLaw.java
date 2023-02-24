import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpholdTheLaw {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "a","a"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "b","b"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "a","a"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "b","b"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "c","c"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "d","d"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "c","c"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "d","d"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "e","e"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "f","f"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "e","e"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "f","f"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "g","g"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "h","h"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "g","g"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "h","h"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "i","i"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "j","j"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "i","i"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "j","j"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "k","k"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "k","k"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "l","l"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "l","l"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "m","m"));
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "n","n"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "m","m"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "n","n"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "o","o"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "o","o"));
    }

    @org.junit.jupiter.api.Test
    public void homeless() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "p","p"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "p","p"));
    }

    @org.junit.jupiter.api.Test
    public void criminal() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "q","q"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "q","q"));

        assertTrue(Moral.decideSwerve(0, "a","q"));
        assertFalse(Moral.decideSwerve(0, "q","a"));

        assertTrue(Moral.decideSwerve(0, "b","q"));
        assertFalse(Moral.decideSwerve(0, "q","b"));
    }

    @org.junit.jupiter.api.Test
    public void baby() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "r","r"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "r","r"));
    }

    @org.junit.jupiter.api.Test
    public void dog() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "s","s"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "s","s"));
    }

    @org.junit.jupiter.api.Test
    public void cat() {
        assertTrue(Moral.decideSwerve(Generator.STAY_LEGAL * 10, "t","t"));
        assertFalse(Moral.decideSwerve(Generator.SWERVE_LEGAL * 10, "t","t"));
    }
}
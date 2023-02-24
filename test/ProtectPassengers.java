import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProtectPassengers {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "a","a"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "b","b"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "a","a"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "b","b"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "c","c"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "d","d"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "c","c"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "d","d"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "e","e"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "f","f"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "e","e"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "f","f"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "g","g"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "h","h"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "g","g"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "h","h"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "i","i"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "j","j"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "i","i"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "j","j"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "k","k"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "k","k"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "l","l"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "l","l"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "m","m"));
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "n","n"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "m","m"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "n","n"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "o","o"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "o","o"));
    }

    @org.junit.jupiter.api.Test
    public void homeless() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "p","p"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "p","p"));
    }

    @org.junit.jupiter.api.Test
    public void criminal() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "q","q"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "q","q"));
    }

    @org.junit.jupiter.api.Test
    public void baby() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "r","r"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "r","r"));
    }

    @org.junit.jupiter.api.Test
    public void dog() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "s","s"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "s","s"));
    }

    @org.junit.jupiter.api.Test
    public void cat() {
        assertTrue(Moral.decideSwerve(Generator.SWERVE_PEDESTRIANS, "t","t"));
        assertFalse(Moral.decideSwerve(Generator.STAY_PEDESTRIANS, "t","t"));
    }
}
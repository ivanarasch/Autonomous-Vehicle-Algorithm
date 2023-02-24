import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AvoidIntervention {

    @org.junit.jupiter.api.Test
    public void adults() {
        assertFalse(Moral.decideSwerve(0, "a","a"));
        assertFalse(Moral.decideSwerve(0, "b","b"));
    }

    @org.junit.jupiter.api.Test
    public void children() {
        assertFalse(Moral.decideSwerve(0, "c","c"));
        assertFalse(Moral.decideSwerve(0, "d","d"));
    }

    @org.junit.jupiter.api.Test
    public void elderly() {
        assertFalse(Moral.decideSwerve(0, "e","e"));
        assertFalse(Moral.decideSwerve(0, "f","f"));
    }

    @org.junit.jupiter.api.Test
    public void obese() {
        assertFalse(Moral.decideSwerve(0, "g","g"));
        assertFalse(Moral.decideSwerve(0, "h","h"));
    }

    @org.junit.jupiter.api.Test
    public void executive() {
        assertFalse(Moral.decideSwerve(0, "i","i"));
        assertFalse(Moral.decideSwerve(0, "j","j"));
    }

    @org.junit.jupiter.api.Test
    public void doctor() {
        assertFalse(Moral.decideSwerve(0, "k","k"));
        assertFalse(Moral.decideSwerve(0, "l","l"));
    }

    @org.junit.jupiter.api.Test
    public void jogger() {
        assertFalse(Moral.decideSwerve(0, "m","m"));
        assertFalse(Moral.decideSwerve(0, "n","n"));
    }

    @org.junit.jupiter.api.Test
    public void pregnant() {
        assertFalse(Moral.decideSwerve(0, "o","o"));
    }

    @org.junit.jupiter.api.Test
    public void homeless() {
        assertFalse(Moral.decideSwerve(0, "p","p"));
    }

    @org.junit.jupiter.api.Test
    public void criminal() {
        assertFalse(Moral.decideSwerve(0, "q","q"));
    }

    @org.junit.jupiter.api.Test
    public void baby() {
        assertFalse(Moral.decideSwerve(0, "r","r"));
    }

    @org.junit.jupiter.api.Test
    public void dog() {
        assertFalse(Moral.decideSwerve(0, "s","s"));
    }

    @org.junit.jupiter.api.Test
    public void cat() {
        assertFalse(Moral.decideSwerve(0, "t","t"));
    }
}
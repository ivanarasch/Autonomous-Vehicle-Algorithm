import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaveMoreLives {

    @org.junit.jupiter.api.Test
    public void moreAdults() {
        assertTrue(Moral.decideSwerve(0, "aa","a"));
        assertTrue(Moral.decideSwerve(0, "bb","b"));
        assertFalse(Moral.decideSwerve(0, "a","aa"));
        assertFalse(Moral.decideSwerve(0, "b","bb"));
    }

    @org.junit.jupiter.api.Test
    public void moreChildren() {
        assertTrue(Moral.decideSwerve(0, "cc", "c"));
        assertTrue(Moral.decideSwerve(0, "dd", "d"));
        assertFalse(Moral.decideSwerve(0, "c","cc"));
        assertFalse(Moral.decideSwerve(0, "d","dd"));
    }

    @org.junit.jupiter.api.Test
    public void moreElderly() {
        assertTrue(Moral.decideSwerve(0, "ee", "e"));
        assertTrue(Moral.decideSwerve(0, "ff", "f"));
        assertFalse(Moral.decideSwerve(0, "e","ee"));
        assertFalse(Moral.decideSwerve(0, "f","ff"));
    }

    @org.junit.jupiter.api.Test
    public void moreObese() {
        assertTrue(Moral.decideSwerve(0, "gg", "g"));
        assertTrue(Moral.decideSwerve(0, "hh", "h"));
        assertFalse(Moral.decideSwerve(0, "g","gg"));
        assertFalse(Moral.decideSwerve(0, "h","hh"));
    }

    @org.junit.jupiter.api.Test
    public void moreExecutive() {
        assertTrue(Moral.decideSwerve(0, "ii", "i"));
        assertTrue(Moral.decideSwerve(0, "jj", "j"));
        assertFalse(Moral.decideSwerve(0, "i","ii"));
        assertFalse(Moral.decideSwerve(0, "j","jj"));
    }

    @org.junit.jupiter.api.Test
    public void moreDoctor() {
        assertTrue(Moral.decideSwerve(0, "kk", "k"));
        assertTrue(Moral.decideSwerve(0, "ll", "l"));
        assertFalse(Moral.decideSwerve(0, "k","kk"));
        assertFalse(Moral.decideSwerve(0, "l","ll"));
    }

    @org.junit.jupiter.api.Test
    public void moreJogger() {
        assertTrue(Moral.decideSwerve(0, "mm", "m"));
        assertTrue(Moral.decideSwerve(0, "nn", "n"));
        assertFalse(Moral.decideSwerve(0, "m","mm"));
        assertFalse(Moral.decideSwerve(0, "n","nn"));
    }

    @org.junit.jupiter.api.Test
    public void morePregnant() {
        assertTrue(Moral.decideSwerve(0, "oo", "o"));
        assertFalse(Moral.decideSwerve(0, "o", "oo"));
    }

    @org.junit.jupiter.api.Test
    public void moreExtraLife() {
        assertTrue(Moral.decideSwerve(0, "o", "a"));
        assertFalse(Moral.decideSwerve(0, "a", "o"));
    }

    @org.junit.jupiter.api.Test
    public void moreHomeless() {
        assertTrue(Moral.decideSwerve(0, "pp", "p"));
        assertFalse(Moral.decideSwerve(0, "p", "pp"));
    }

    @org.junit.jupiter.api.Test
    public void moreCriminal() {
        assertTrue(Moral.decideSwerve(0, "qq", "q"));
        assertFalse(Moral.decideSwerve(0, "q", "qq"));
    }

    @org.junit.jupiter.api.Test
    public void moreBaby() {
        assertTrue(Moral.decideSwerve(0, "rr", "r"));
        assertFalse(Moral.decideSwerve(0, "r", "rr"));
    }

    @org.junit.jupiter.api.Test
    public void moreDog() {
        assertTrue(Moral.decideSwerve(0, "ss", "s"));
        assertFalse(Moral.decideSwerve(0, "s", "ss"));
    }

    @org.junit.jupiter.api.Test
    public void moreCat() {
        assertTrue(Moral.decideSwerve(0, "tt", "t"));
        assertFalse(Moral.decideSwerve(0, "t", "tt"));
    }
}
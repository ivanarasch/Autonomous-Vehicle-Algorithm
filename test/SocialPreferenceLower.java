import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SocialPreferenceLower {

    @org.junit.jupiter.api.Test
    public void higherVsNormal() {
        assertTrue(Moral.decideSwerve(0, "abcdefghmnor","ijklijklijkl"));
        assertFalse(Moral.decideSwerve(0, "ijklijklijkl","abcdefghmnor"));
    }

    @org.junit.jupiter.api.Test
    public void higherVsLower() {
        assertTrue(Moral.decideSwerve(0, "pqpq","ijkl"));
        assertFalse(Moral.decideSwerve(0, "ijkl","pqpq"));
    }

    @org.junit.jupiter.api.Test
    public void normalVsLower() {
        assertTrue(Moral.decideSwerve(0, "pqpqpqpqpqpq","abcdefghmnor"));
        assertFalse(Moral.decideSwerve(0, "abcdefghmnor","pqpqpqpqpqpq"));
    }
}
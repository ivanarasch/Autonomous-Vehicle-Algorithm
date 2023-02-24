import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SocialPreferenceHigher {

    @org.junit.jupiter.api.Test
    public void higherVsNormal() {
        assertFalse(Moral.decideSwerve(0, "abcdefghmnor","ijklijklijkl"));
        assertTrue(Moral.decideSwerve(0, "ijklijklijkl","abcdefghmnor"));
    }

    @org.junit.jupiter.api.Test
    public void higherVsLower() {
        assertFalse(Moral.decideSwerve(0, "pqpq","ijkl"));
        assertTrue(Moral.decideSwerve(0, "ijkl","pqpq"));
    }

    @org.junit.jupiter.api.Test
    public void normalVsLower() {
        assertFalse(Moral.decideSwerve(0, "pqpqpqpqpqpq","abcdefghmnor"));
        assertTrue(Moral.decideSwerve(0, "abcdefghmnor","pqpqpqpqpqpq"));
    }
}
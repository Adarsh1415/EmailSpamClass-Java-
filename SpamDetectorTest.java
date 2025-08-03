
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpamDetectorTest {

@Test
public void testSpamDetection() {
SpamDetector detector = new SpamDetector();

Email spamEmail = new Email("You win a free prize now!");
detector.detect(spamEmail);
assertTrue(spamEmail.isSpam());

Email normalEmail = new Email("Let's have lunch tomorrow.");
detector.detect(normalEmail);
assertFalse(normalEmail.isSpam());
}
}

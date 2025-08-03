


import java.util.Arrays;
import java.util.List;

public class SpamDetector {
private static final List<String> SPAM_KEYWORDS = Arrays.asList("win", "free", "prize", "click here");

public void detect(Email email) {
for (String word : SPAM_KEYWORDS) {
if (email.getContent().toLowerCase().contains(word)) {
email.markAsSpam();
break;
}
}
}
}

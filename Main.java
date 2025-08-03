


import java.io.*;
import java.util.*;
import model.Email;
import service.SpamDetector;

public class Main {
public static void main(String[] args) {
SpamDetector detector = new SpamDetector();
List<Email> emails = new ArrayList<>();

try (BufferedReader reader = new BufferedReader(new FileReader("data/emails.txt"))) {
String line;
while ((line = reader.readLine()) != null) {
Email email = new Email(line);
detector.detect(email);
emails.add(email);
}
} catch (IOException e) {
e.printStackTrace();
}

for (Email email : emails) {
System.out.println("Email: " + email.getContent());
System.out.println("Status: " + (email.isSpam() ? "SPAM" : "NOT SPAM"));
System.out.println("-------------------------");
}
}
}

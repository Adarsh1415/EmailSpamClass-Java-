package model;

public class Email {
private String content;
private boolean isSpam;

public Email(String content) {
this.content = content;
this.isSpam = false;
}

public String getContent() {
return content;
}

public boolean isSpam() {
return isSpam;
}

public void markAsSpam() {
this.isSpam = true;
}
}

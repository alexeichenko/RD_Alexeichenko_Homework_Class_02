package diary;

import java.time.LocalDateTime;

public class Note {
    private final int id;
    private String text;
    private final Author author;
    private final long creationTime;

    public Note(int id, String text, Author author) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.creationTime = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author getAuthor() {
        return author;
    }

    public long getCreationTime() {
        return creationTime;
    }
}

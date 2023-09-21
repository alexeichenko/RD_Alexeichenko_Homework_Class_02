package diary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Journal {
    private static int noteIdCounter = 1;
    private final Map<Integer, Note> notes = new HashMap<>();

    public void addNote(String text, Author author) {
        int noteId = noteIdCounter++;
        Note note = new Note(noteId, text, author);
        notes.put(noteId, note);
    }

    public void deleteNote(int noteId) {
        notes.remove(noteId);
    }

    public void updateNote(int noteId, String newText) {
        if (notes.containsKey(noteId)) {
            Note note = notes.get(noteId);
            note.setText(newText);
        }
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes.values());
    }
}

package diary;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        Author author1 = new Author("Олексій");
        Author author2 = new Author("Сергій");

        List<Note> newNotes = Arrays.asList(
                new Note(1, "Це запис Олексія", author1),
                new Note(2, "А це запис Сергія", author2),
                new Note(3, "Це знову запис Олексія", author1)
        );

        // Додавання нотаток через Stream API
        newNotes.forEach(note -> journal.addNote(note.getText(), note.getAuthor()));

        // Перегляд усіх нотаток через Stream API
        journal.getAllNotes()
                .forEach(note -> {
                    System.out.println("Note ID: " + note.getId());
                    System.out.println("Text: " + note.getText());
                    System.out.println("Author: " + note.getAuthor().getName());
                    System.out.println("Creation Time: " + note.getCreationTime());
                    System.out.println();
                });

        // Оновлення нотаток через Stream API
        journal.getAllNotes()
                .stream()
                .filter(note -> note.getId() == 2) // Оновити нотатку з ID 2
                .forEach(note -> journal.updateNote(note.getId(), "Це оновлений запис Сергія"));

        // Видалення нотаток через Stream API
        journal.getAllNotes()
                .stream()
                .map(Note::getId) // Видалити нотатку з ID 3
                .filter(id -> id == 3)
                .forEach(journal::deleteNote);

        // Перегляд усіх нотаток через Stream API після оновлення
        journal.getAllNotes()
                .forEach(note -> {
                    System.out.println("Note ID: " + note.getId());
                    System.out.println("Text: " + note.getText());
                    System.out.println("Author: " + note.getAuthor().getName());
                    System.out.println("Creation Time: " + note.getCreationTime());
                    System.out.println();
                });
    }
}

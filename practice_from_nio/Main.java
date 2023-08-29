package practice_from_nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String text = "Це приклад тексту, який потрібно зберегти у файл.";
        String filePath = "Text.txt";
        try {
            saveStringToFile(text, filePath);
            System.out.println("Рядок успішно збережений у файлі.");

            String readText = readStringFromFile(filePath);
            System.out.println("Дані з файлу: " + readText);
        } catch (IOException e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }
    }
    public static void saveStringToFile(String text, String filePath) throws IOException {
        Path path = Path.of(filePath);
        Files.writeString(path, text, StandardCharsets.UTF_8);
    }

    public static String readStringFromFile(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.readString(path, StandardCharsets.UTF_8);
    }
}
package reader_writer_homework;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite() {
        File file = new File("file.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                bufferedWriteToFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String showContent = bufferedReaderFromFile();
        System.out.println(showContent);
    }

    private static void bufferedWriteToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"))) {
            String content = null;
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Ведіть текст: ");
                content = scanner.nextLine();
            } catch (NullPointerException e) {
                System.out.println("Ви не ввели жодного символу.");
            }
            bufferedWriter.write(content);
            System.out.println("Введені дані записано у файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String bufferedReaderFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}

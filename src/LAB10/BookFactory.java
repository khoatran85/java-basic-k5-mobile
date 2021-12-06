package LAB10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFactory {
    protected static void writeBookList(List<Book> bookList, String filePath) {
        //Implement autoCLosable method
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
            for (Book book : bookList) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthorName() + ";" + book.getYear();
                System.out.println(dataLine);
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected static List<Book> readBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader reader = new BufferedReader(isr);) {

            String dataLine = reader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String authorName = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                bookList.add(new Book(ISBN, title, authorName, year));
                dataLine = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bookList;
    }

    protected static void printListBook(List<Book> savedBookList) {
        for (Book book : savedBookList) {
            System.out.println(book);
        }
    }

    protected static void addBook(String filePath) {
        String ISBN;
        String title;
        String authorName;
        int year;
        List<Book> bookList = new ArrayList<>();
        while (true) {
            System.out.println("Do you want to add book? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                System.out.println("Input ISBN:");
                ISBN = scanner.nextLine();
                System.out.println("Input Title:");
                title = scanner.nextLine();
                System.out.println("input Author Name:");
                authorName = scanner.nextLine();
                System.out.println("Input year:");
                year = scanner.nextInt();
                bookList.add(new Book(ISBN, title, authorName, year));
                writeBookList(bookList, filePath);
            } else {
                System.out.println("thanks");
                break;

            }
        }

    }


    static void searchBook() {
        System.out.println("This function hasn't implemented yet!!");
    }
}

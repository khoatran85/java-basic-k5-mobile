package Lesson10_5;

import Lesson10_6.Book;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static void saveBookList() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1234", "Title 01", "Teo", 2001));
        bookList.add(new Book("1245", "Title 02", "Ti", 2022));

        // 1234;Title 01;Teo;2001
        //1245; Title 02;Ti;2021

        //Implement autoCLosable method
        String filePath = System.getProperty("user.dir") + "/books.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
            for (Book book : bookList) {
                String dataLine = book.getISBN() +";" + book.getTitle()+";"+ book.getAuthorName()+";" +book.getYear();
                System.out.println(dataLine);
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        }catch(Exception e){
            e.printStackTrace();
        }


    }

    static List<Book> readBookList(String filePath){
        List<Book> bookList = new ArrayList<>();
        try( FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader reader = new BufferedReader(isr);){

            String dataLine = reader.readLine();
            while(dataLine != null){
                String [] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String authorName = bookData[2];
                int year= Integer.parseInt(bookData[3]);
                bookList.add(new Book(ISBN, title, authorName, year));
                dataLine = reader.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

return bookList;
    }
}

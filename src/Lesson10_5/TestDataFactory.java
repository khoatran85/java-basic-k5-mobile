package Lesson10_5;

import Lesson10_6.Book;

import java.util.ArrayList;
import java.util.List;

public class TestDataFactory {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1234", "Title 01", "Teo", 2001));
        bookList.add(new Book("1245", "Title 02", "Ti", 2022));
        String filePath = System.getProperty("user.dir") + "/books.txt";
        DataFactory.saveBookList();
        
    }
}

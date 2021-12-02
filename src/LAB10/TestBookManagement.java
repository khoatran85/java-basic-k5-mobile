package LAB10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static LAB10.BookFactory.*;


public class TestBookManagement {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/LAB10/DataBase.txt";
            //Print Book menu
            int inputTime = 0;
            int maxInput = 3;
            while (true) {
                System.out.println("=========Book Manager==========");
                System.out.println("1. Add Book");
                System.out.println("2. Book List");
                System.out.println("3. Search Book");
                System.out.println("0. Exit");
                System.out.println("Your choice: ");
                Scanner scanner = new Scanner(System.in);
                int userOptions = scanner.nextInt();
                switch (userOptions) {
                    case 1:
                        addBook(filePath);
                        break;
                    case 2:
                        printListBook(readBookList(filePath));
                        break;
                    case 3:
                        searchBook();
                        break;
                    case 0:
                        System.out.println("See You Again!!!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Option!!!");
                        inputTime++;
                        if (inputTime == maxInput) {
                            System.out.println("===========Try Again later!!!============");
                            System.exit(100);
                        }

                }
            }

        }
    }

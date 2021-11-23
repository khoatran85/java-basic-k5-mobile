package LAB7;

import sun.font.DelegatingShape;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMenu {
    private static String isbn, title, author;
    private static int year;

    public static void main(String[] args) {
        //Print Book menu
        int inputTime = 0;
        int maxInput = 3;
        while (true) {
            System.out.println("=========Book Manager==========");
            System.out.println("1. Add Book");
            System.out.println("2. Retrieve Book");
            System.out.println("0. Exit");
            System.out.println("Your choice: ");
            Scanner scanner = new Scanner(System.in);
            int userOptions = scanner.nextInt();
            switch (userOptions) {
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBook();
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

    private static void addBook() {
        int inputYearTime = 0;
        int maxYearInput = 3;
        System.out.println("===========Input Book Info===========");

        Scanner scanner = new Scanner(System.in);

        //ISBN
        System.out.println("Input ISBN: ");
        isbn = scanner.nextLine();

        //Title
        System.out.println("Input Title: ");
        title = scanner.nextLine();

        //Author
        System.out.println("Input Author: ");
        author = scanner.nextLine();

        //Year

        System.out.println("Input Year: ");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please input number");
                scanner.next();
                inputYearTime++;
                if (inputYearTime == maxYearInput) {
                    year = 0;
                    System.out.println("Try Again Later");
                    break;
                }
            } else {
                year = scanner.nextInt();
                break;
            }
        }

    }
    private static void retrieveBook() {
        int inputISBNTime = 0;
        int maxInput = 3;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input ISBN: ");
            String isbnCode = scanner.nextLine();
            if (isbnCode.contains(isbn)) {
                System.out.println("===================Book Info=====================");
                System.out.println("ISBN: " + isbn + " || Title: " + title + " || Author: " + author + " || Year: " + year + "\n");
                break;
            } else {
                System.out.println("===================Book Info=====================");
                System.out.println("NOT FOUND !!!!");
                inputISBNTime++;
                if (inputISBNTime == maxInput) {
                    System.out.println("Try again later!!");
                    break;
                }
            }
        }
    }

}

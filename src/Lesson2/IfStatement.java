package Lesson2;

public class IfStatement {
    static boolean isHeOntime;  // defalt value = false

    public static void main(String[] args) {
        System.out.println("1. dat xe ra\n");
        System.out.println("2. Khoi dong xe\n");
        System.out.println("3. Chay toi quan\n");


        if (isHeOntime) {
            System.out.println("Let's talk");
        } else {
            writeALetter("See you later");
        }

    }

    private static void writeALetter(String msg) {
        System.out.println(msg);
    }


}

package Lesson6;

public class Calculator {
    //Method signature
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int sum(String str1, String str2) {
        return 0;
    }

    public String sum(int num1, String num2) {
        return "num1 + num2";
    }

    //Varagrs ~ Rest parameters(nodejs)
    public int sum(int...nums){
        int total = 0;
        for(int num: nums){
            total = total + num;
        }
        return total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,2);
        calculator.sum(1,2,3);
        System.out.println(calculator.sum(1,2,3,4));
    }
}

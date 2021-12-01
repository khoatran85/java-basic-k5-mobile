package Lesson10_4;

public class TryCatch {
    static double division(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        boolean hasErr = false;
        double result = 0;
        try {
            result = division(2, 0);
        } catch (Exception e) {
            hasErr = true;
//            e.printStackTrace();
        }finally {
            System.out.println("Thank you!");
        }

        if(hasErr)
            System.out.println("[ERR] it seems 2nd number is zero");
        else
        System.out.println(result);
    }
}

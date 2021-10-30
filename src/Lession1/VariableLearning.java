package Lession1;

public class VariableLearning {
    public static void main(String[] args) {
        int num = 2;
        double doubleNum = 4.5;
        float floatNum = 2.3f;
        String text = "ABC";
        char a_ = 'a';
        short s = 1;

        System.out.printf("My Integer number is: %d\n", num);
        System.out.printf("My double number is: %f\n", doubleNum);
        System.out.printf("My float number is: %f\n", floatNum);
        System.out.printf("My string text is: %s\n", text);
        System.out.printf("My character text is: %c\n", a_);
        System.out.printf("My character text is: %s\n", a_);
        System.out.printf("My short text is: %d", s);

//=========================postfix prefix============================================

        int a = 3;
        int b = 5;
        int c = ++a + b++;        // ++a : prefix == b++: postfix
        //prefix : run first
        //post : run later
        /*
         * a =4
         * right operand = 9
         * c = 9
         * b = 6
         **/

//==========================================================================
        int d = 7/3;  // chia lấy phần nguyên
        int e = 7%3;  // chia lấy phần dư | 1
        boolean is_e_equal_d = e==d;

        /* toán tử so sánh (số học only)
        * ==
        * >
        * >=
        * <
        * <=
        * !=
        */
    }

}

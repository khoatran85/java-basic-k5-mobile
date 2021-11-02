package Lesson1;

public class ArrayLearning {
    public static void main(String[] args) {


        int[] myIntArr = {1, 2, 4, 2, 7, 8, 4, 5, 9, 'a'};
        int arrayLength = myIntArr.length;

        //Read
        System.out.println(myIntArr[0]);
//        System.out.println(myIntArr[arrayLength]);
        System.out.println(myIntArr[arrayLength - 1]);

        //Update
        myIntArr[0] = 0;
        System.out.println(myIntArr[0]);

        //Tradition for : khi duyệt mảng và muốn thay đổi giá trị trong mảng
        for (int elementIndex = 0; elementIndex < myIntArr.length; elementIndex++) {
            System.out.println(myIntArr[elementIndex]);
        }

        //Enhanced for : khi chỉ lấy giá trị ra
        for (int element : myIntArr) {
            System.out.println(element);
        }
    }
}

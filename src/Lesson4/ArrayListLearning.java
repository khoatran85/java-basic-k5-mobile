package Lesson4;

import java.util.*;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myInArrList = new ArrayList<>();

        //  List myObjArrList = new ArrayList<>(); => khong nen su dung

        //CRUD
        // add element into arrayList | create
        myInArrList.add(1);
        myInArrList.add(2);
        myInArrList.add(3);
        myInArrList.add(4);
        myInArrList.add(5);
        myInArrList.add(5);

        // get element value from arrayList | read
        int firstElement = myInArrList.get(0);
        int lastElement = myInArrList.get(myInArrList.size() - 1);

        // Loop the arrayList
        for (int elementIndex = 0; elementIndex < myInArrList.size(); elementIndex++) {
            myInArrList.get(elementIndex);
        }

        for (Integer elementValue : myInArrList) {
            System.out.println(elementValue);
        }


        // Update element into arraylist | Update
        myInArrList.set(myInArrList.size() - 1, 6);
        for (Integer elementValue : myInArrList) {
            System.out.println(elementValue);
        }

        // Loop and update

        for (int elementIndex = 0; elementIndex < myInArrList.size(); elementIndex++) {
            int currentValue = myInArrList.get(elementIndex);
            boolean isOddNum = (myInArrList.get(elementIndex) % 2 == 1);
            if (isOddNum) myInArrList.set(elementIndex, currentValue + 1);
        }

        for (Integer elementValue : myInArrList) {
            System.out.println(elementValue);
        }
        // Delete/Remove element from arrayList | Delete

        int removedNum = myInArrList.remove(myInArrList.size() - 1);
        boolean isRemovedSuccess = myInArrList.remove(new Integer(6));
        System.out.println("Remove number = " + removedNum);
        for (Integer elementValue : myInArrList) {
            System.out.println(elementValue);
        }


        List<Integer> mixedValueArrList = Arrays.asList(1,3,1,13,2,77,67,2);
        //Sort | Ascending | ASC | Descending DESC
        Collections.sort(mixedValueArrList);

        mixedValueArrList.sort(Collections.reverseOrder());

        Collections.sort(mixedValueArrList, Collections.reverseOrder());

        for (Integer elementValue : mixedValueArrList){
            System.out.println(elementValue);
        }

        //Remove duplicate value
        Set<Integer> set = new HashSet<>(mixedValueArrList);
        List<Integer> withoutDuplicatedValueList = new ArrayList<>(set);
        Collections.sort(withoutDuplicatedValueList);
        for (Integer elementValue : withoutDuplicatedValueList) {
            System.out.println(elementValue);
        }

        //implement yourself removing duplicate
        List<Integer> removedDuplicateValue = new ArrayList<>(set);
        for (int elementIndex = 0; elementIndex < mixedValueArrList.size(); elementIndex++) {
            int elementValue = mixedValueArrList.get(elementIndex);
            if(!removedDuplicateValue.contains(elementValue)){
                removedDuplicateValue.add(elementValue);
            }
        }
        Collections.sort(removedDuplicateValue);

        //SubList => lay gia tri theo index
        List <Integer> subList = withoutDuplicatedValueList.subList(0, 3);
        for (Integer elementValue : subList) {
            System.out.println(elementValue);
        }



        List<Integer> trickyArrList = Arrays.asList(1,2,3); // khong add /remove them phan tu duoc
//        trickyArrList.remove(1);
//        trickyArrList.add(4);


        // => muon them phan tu vao array aslist
        List<Integer> trickyArrListNew = new ArrayList<>(Arrays.asList(1,2,3));
        trickyArrListNew.add(4);
        for (Integer elementValue : trickyArrListNew) {
            System.out.println(elementValue);
        }


        // Convert Arr to ArrayList
        Integer [] myIntArr = {8,7,6};
        List<Integer> listFromArr = Arrays.asList(myIntArr);

        // Arraylist to array
        int [] arrFromList = new int[listFromArr.size()];
        for (int i = 0; i < arrFromList.length; i++) {
            arrFromList[i] = listFromArr.get(i);
        }
        for (int value : arrFromList){
            System.out.println(value);
        }
    }

}

package Lesson4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.util.Map.Entry;

import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        //CRUD
        emergencyList.put(113, "Police");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "abc");
        emergencyList.put(118, "Others");

        //get
        System.out.println(emergencyList.get(113));

        //update
//        emergencyList.replace(116, "One One Six");
//        System.out.println(emergencyList.get(116));

        emergencyList.replace(117, "abc", "New Number");
        System.out.println(emergencyList.get(117));

        //remove
        emergencyList.remove(117, "New Number");
        System.out.println(emergencyList.get(117));
        System.out.println(emergencyList.containsKey(117));
//==========================================

        Map<Integer, Integer> energencyList1 = new HashMap<>();
        energencyList1.put(1, 111);
        emergencyList.remove(1);
        System.out.println(emergencyList.get(1));

//========================================
//        Set<Integer> allKeysBefore = emergencyList.keySet();
//        for (Integer key : allKeysBefore) {
//            System.out.println(emergencyList.get(key));
//        }
//        if (emergencyList.containsKey(116))
//            System.out.println("Yes");
//        else
//            System.out.println("NO");

//========================Loop and update ================
        //1. Loop base on Iterator
        Iterator<Entry<Integer, String>> emergencyListIterator = emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()) {
            Entry<Integer, String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();


            //2. Update Map's value
            if (entryValue.equals("Others"))
                emergencyListIterator.remove();
        }


        Set<Integer> allKeysAfter = emergencyList.keySet();
        for (Integer key : allKeysAfter) {
            System.out.println(emergencyList.get(key));
        }
    }
}


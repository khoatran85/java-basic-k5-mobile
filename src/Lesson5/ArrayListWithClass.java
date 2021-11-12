package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListWithClass {
    public static void main(String[] args) {
        RobotCat lulu = new RobotCat();
        RobotCat lili = new RobotCat();

        lulu.setName("lulu");
        lili.setName("lili");

        List<RobotCat> robotCatList = new ArrayList<>();
        robotCatList.add(lulu);
        robotCatList.add(lulu);

        robotCatList.get(0).setName("Doreamon");
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.getName());
        }

        Map<String, RobotCat> catMap = new HashMap<>();
        catMap.put("lulu", new RobotCat("lulu"));
        catMap.put("lili", new RobotCat("lili"));
    }
}
package Lesson7;

import java.util.HashMap;
import java.util.Map;

//import static Lesson7.HouseBuilder.Builder;
public class TestBuilder {
    public static void main(String[] args) {
        HouseBuilder.Builder builder = new HouseBuilder.Builder();
//        Builder builder = new Builder();
        HouseBuilder house1 = builder.withColor("blue").doorNumbers(2).build();
        System.out.println(house1.getColor());
        HouseBuilder house2 = builder.withColor("blue").withTopRoofColor("Red").build();

//    builder.withColor("blue");
//    builder.withColor("blue");
//    builder.doorNumbers(2);


    }
}

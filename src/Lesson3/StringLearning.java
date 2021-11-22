package Lesson3;

public class StringLearning {
    public static void main(String[] args) {

        //String declaration and compare 2 Strings

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = "cat";

        System.out.println("s1==s2 :" + (s1 == s2));
        System.out.println("s1==s3 :" + (s1 == s3));

        System.out.println("==============================================================");

        //Check lower ,upercase, digit... simulate password required
        String myPasswordStr = "123myPassword";
        char[] myCharacters = myPasswordStr.toCharArray();
        int totalDigits = 0;
        int totalUpperCases = 0;
        int totalLowerCases = 0;

        for (char character : myCharacters) {
            if (Character.isDigit(character))
                totalDigits++;
            if (Character.isUpperCase(character))
                totalUpperCases++;
            if (Character.isLowerCase(character))
                totalLowerCases++;

        }
        if (totalDigits > 0 && totalUpperCases > 0 && totalLowerCases > 0) {
            System.out.println("You are all set!");
        } else {
            System.out.println("Password format is wrong!");
        }


        System.out.println("===================================================================");


        //Replace
        String badWordContainer = " bad, very bad, sth else ";
        badWordContainer.length();
        String newGoodWord = badWordContainer.replace("bad", "b**");
        System.out.println(newGoodWord);


        System.out.println("===================================================================");

        //Trim | remove empty space at beginning and ending | .trim()
        String newTrimString = badWordContainer.trim();
        System.out.println(newTrimString);

        System.out.println("===================================================================");

        //subString, indexOf...split
        String url = "https://go0gle.com";

        // existence of Character/sub-Str | indexOf
        int indexOfW = url.indexOf("w");
        if (indexOfW >= 0) {
            System.out.println("W is in the orginal string!");
        }
            System.out.printf("Sub=str google index: ", url.indexOf("Google"));

            //sub String
            url.substring(8, 14);
            System.out.println(url.substring(8, 14));

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Failure happens on the index number" + (i+1));
//            System.out.println("Failure happens on the index number" + i+1);
//        }

            System.out.println("===================================================================");

            //Split
            String[] splitChars = url.split("");
            for (String c : splitChars) {
                System.out.println(c);
            }

            System.out.println("===================================================================");

            //simple regex |regular expression => tu tim` hieu
            String myCookTimes = "105 mins";

            String myCookTimeString = myCookTimes.replace("[^0-9]", "");
            int myCookTimeInt = Integer.parseInt(myCookTimeString);
            System.out.println("Cook time: "+ myCookTimeInt);

            System.out.println("===================================================================");
            //Concat() | + operator and careful with number
        System.out.println(s1.concat(", Kitty") + ". Hello!");
        }
    }


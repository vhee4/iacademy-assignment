package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrays {
    /**
     * creating the array
     * Access specific element in an array
     * change length of an array
     * array length
     * loop through an array
     */

    /**
     * QUESTION
     * Given two Strings, write a method to decide if one is a permutation of the other.
     *
     *
     *  SOLUTION USING ACSII VALUE
     * convert both strings to char array
     * create 2 sum variables initialized to 0
     * iterate through each array while summing each character
     * check if sum vars are equal
     *
     * USING THE SORT METHOD
     * convert both strs to char array
     * Arrays.sort to sort both arrays
     * convert the arrays back to string (Always)
     * if both sorted arrays are equal
     */

    public static boolean permutation (String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars= str2.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        String firstArrayToString = Arrays.toString(str1Chars);
        String secondArrayToString = Arrays.toString(str2Chars);

        return firstArrayToString.equals(secondArrayToString);
    }
    //OR
    public static boolean isPermutation(String str1, String str2){
    char[] str1ToArray = str1.toCharArray();
    char[] str2ToArray = str2.toCharArray();
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0; i <str1ToArray.length; i++){
        sum1 = sum1 + str1ToArray[i];
    }
    for (int i = 0; i< str1ToArray.length; i++){
        sum2 = sum2 + str2ToArray[i];
    }
   return sum1 == sum2;
    }

//    public static String replaceSpaces(String str1){
////        str1.trim();
//        String stringUsedToReplace = "%20";
//        String emptyString = " ";
//        char[] stringUsedToReplaceChar = stringUsedToReplace.toCharArray();
//        char[] emptyStringChar = emptyString.toCharArray();
//        char[] str1Char = str1.trim().toCharArray();
//        for(int i = 0; i < str1Char.length; i++){
//            if (emptyStringChar[i] == str1Char[i]){
//
//                str1Char[i] = stringUsedToReplaceChar[i];
//            }
//        }
//        String firstArrayToString = Arrays.toString(str1Char);
//        String stringUsedToReplaceArray = Arrays.toString(stringUsedToReplaceChar);
//        return firstArrayToString = stringUsedToReplaceArray;
//    }

    public static  String urlIfy(String str){
        char[] urlArray = str.trim().toCharArray();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < urlArray.length; i++){
            if (urlArray[i] == ' '){
                list.add("%20");
            }
            list.add(Character.toString(urlArray[i]));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i< list.size(); i++){
            result.append(list.get(i));
        }
        return result.toString().replaceAll(" ","");
    }

    public static  String urLify2(String str){
        return str.trim().replaceAll("","%20");
    }






    public static void main(String[] args) {
        System.out.println(urlIfy("  chid onh "));
        System.out.println(urLify2(" dgyh hgt "));
//        System.out.println(replaceSpaces("  chid nma  "));
        System.out.println(isPermutation("dean", "neag"));
        System.out.println(permutation("soar", "roas"));
//        String [] namesOfStudents = new String[10];
        int [] integerArray = new int[4];
//        System.out.println(namesOfStudents.length);

         String [] namesOfStudents = {"tobi", "eze", "sarah", "Noah","Osasere", "kingsley","faith","goodness","tariq", "mama","fghjk"};
        integerArray [0]= 1;
        integerArray [1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 4;
//        integerArray[4] = 5;
//        integerArray[5] = 6;
//        System.out.println(integerArray.toString(integerArray));
        System.out.println(namesOfStudents[4]);

        //change an element in an array
        namesOfStudents[5] = "Chioma";
        System.out.println(namesOfStudents[5]);
        System.out.println(Arrays.toString(namesOfStudents));

        //loop through the array
        for(int i =0; i < namesOfStudents.length; i++){
            System.out.print(namesOfStudents[i] + ",");

        }
    }


}

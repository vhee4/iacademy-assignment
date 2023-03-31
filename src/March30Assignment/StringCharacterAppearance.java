package March30Assignment;

import java.util.Arrays;

public class StringCharacterAppearance {
    /**
     * 1. Write a method that determines the number of times a given character appears in a string.
     * initialize a string say str
     * convert the string to characters
     * sort the array
     * loop through each character
     * check if the current character is contained in the substring **
     * if yes count how many times else return 1
     */


    public static String stringCharacterCount(String str){
        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);
        int j = 1;
        StringBuilder result = new StringBuilder(); //to create a string...

        for(int i = 0; i < strChar.length-1; i++){
            if(strChar[i] == strChar[i+1]) {
                j++;
            } else{
                result.append(strChar[i]).append(" appears ").append(j).append(" time\n");
                j = 1;
            }
        }
        result.append(strChar[strChar.length - 1]).append(" appears ").append(j).append(" time\n");

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCharacterCount("ddiary"));
    }
}

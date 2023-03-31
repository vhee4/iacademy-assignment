package RepetitiveStatements;

import java.util.Arrays;

public class IsUniqueCorrection {




    /**
     * create a loop to iterate through the whole string
     * create a variable to hold the current character
     * take a substring of the string from the i +1
     * check if the current character exists in the substring
     *
     */
    public static boolean IsUniqueCorrection(String s){
        String newString = new String(s.toLowerCase()); //to make the str all lower case
    if(s.length() == 0 || s.length()== 1){
        return true;
    }
    for (int i = 0; i < s.length(); i++){
        char currentCharacter = s.charAt(i); //get the particular character n
        String remainingCharacters = s.substring(i+1); //oahfa
        int locationOfCurrentCharacter = remainingCharacters.indexOf(currentCharacter); //oahfa vs n
        System.out.println(locationOfCurrentCharacter);
        if(locationOfCurrentCharacter != -1)
        {
            return false;
        }
    }
        return true;
    }

    public static boolean isUniqueUsingContains(String str){
        for (int i = 0; i < str.length(); i++){
        char currentCharacter = str.charAt(i);
        return !str.substring(i+1).contains(String.valueOf(currentCharacter));
        }
        return  true;
    }

    public static boolean insUniqueUsingContainsReversed(String str){
        for (int characterToBeChecked = str.length() - 1; characterToBeChecked >= 0; characterToBeChecked--){
            char charX = str.charAt(characterToBeChecked);
            String remChar = str.substring(0, characterToBeChecked);
            //System.out.println(charX);
            //System.out.println(remChar);
            if (remChar.contains(String.valueOf(charX))) {
                return false;
            }
        }
        return true;
    }


    public static  boolean isUniqueUsingArrays(String s){
        /**
         * convert string to character array
         * sort the array using a custom method (iacademy- aacdeimy)
         */
        String newString = new String(s.toLowerCase());
        String newString1 = s.toLowerCase();
        char[] strArray = newString.toCharArray();
        char[] strArray1 = newString1.toCharArray();
        Arrays.sort(strArray);
        Arrays.sort(strArray1);

        for(int i = 0; i < strArray1.length-1; i++){
            if (strArray1[i] == strArray1[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isUniqueUsingArrays("chidInma"));
        System.out.println(IsUniqueCorrection("noahfa"));
//      System.out.println(insUniqueUsingContainsReversed("noah"));
    }
}

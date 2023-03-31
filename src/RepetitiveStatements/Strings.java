package RepetitiveStatements;

public class Strings {


    public static void main(String[] args) {
        //different ways if creating a string
        String name = "    iacademy   ";
        String name2 = new String("iacademy");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        System.out.println(name.trim());
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name2.length());
        System.out.println(name.charAt(4));
        System.out.println(name2.toUpperCase());
        System.out.println(name2.substring(1, 4));
        System.out.println(name2.indexOf('m'));
        System.out.println(name2.lastIndexOf('m'));
        System.out.println(name2.replace('a', 'o'));
        System.out.println(name2.replaceFirst("a", "o"));

        for (int i = 0; i < name2.length(); i++) {
            System.out.println(name2.charAt(i));
        }

        /**
         * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
         *
         * Pseudocode
         * initialize the string
         *
         *
         */
//        public static boolean isUnique(){



                }
            }




//    public static boolean hasUniqueCharacters(String str) {
//        if (str.length() > 128) {
//            return false; // The string has more than 128 characters, so it must have repeated characters
//        }
//        boolean[] charSet = new boolean[128];
//        for (int i = 0; i < str.length(); i++) {
//            int val = str.charAt(i)
//            if (charSet[val]) {
//                return false;
//            }
//            charSet[val] = true;
//        }
//        return true;
//    }


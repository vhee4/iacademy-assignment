package RepetitiveStatements;

public class isUnique {
    public static boolean isUnique(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(0, 1) != s.substring(1)){
                System.out.println("is unique");

            }else if (s.substring(1, 2) == s.substring(2))
            {
                System.out.println("is not unique");
            }else {
                System.out.println("is not not unique");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isUnique("iacademy");
    }

}

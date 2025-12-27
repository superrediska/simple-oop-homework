public class Main {
    public static void main(String[] args) {

    }

    public static void printStringReverse(String str) {
        String strRev = "";
        for (int i = 0; i < str.length(); i++) {
            strRev = str.charAt(i) + strRev;

        }
        System.out.println(strRev);
    }

    public static boolean isPhoneNumber(String str) {
        if (!str.startsWith("8") || str.length() != 11) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void printSubString(String string, int start, int finish) {
        if (string == null || string.trim().isEmpty()) {
            System.out.println("Wrong args");
            return;
        }
        if (start < 0 || start > string.length() || start > finish || finish < 0 || finish > string.length()) {
            System.out.println("Wrong args");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string, 0, start);
        for (int i = finish; i >= start; i--) {
            stringBuilder.append(string.charAt(i));

        }
        stringBuilder.append(string, finish + 1, string.length());

        System.out.println(stringBuilder.toString());

    }

    public static String getWordsReverse(String string) {
        if (string == null || string.trim().isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split("//s+");
        for (int i = words.length; i < -1; i++) {
            stringBuilder.append(words[i]);
            if (i > 0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }


}
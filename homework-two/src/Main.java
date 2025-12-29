import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String a = "aaadddssffffaa";
        maxCharIndex(a);
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

    public static String getWordsReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String[] words = str.split("//s+");
        for (int i = words.length; i < -1; i++) {
            stringBuilder.append(words[i]);
            if (i > 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static String getWordsReverseInColumn(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Wrong string");
            return null;

        }
        String[] words = str.split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilderRev = new StringBuilder(words[i]);
            stringBuilderRev.reverse();

            stringBuilder.append(stringBuilderRev.toString());
            if (i < words.length - 1) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();


    }

    public static int maxCharIndex(String str) {
        if (str == null || str.trim().isEmpty()) {
            return -1;
        }
        Map<Character, Integer> count = new HashMap<>();
        for (char ch : str.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        int maxCount = 0;
        for (int cn : count.values()) {
            maxCount = Math.max(maxCount, cn);
        }
        for (int i = 0; i < str.length(); i++) {
            if (count.get(str.charAt(i)) == maxCount) {
                return i;
            }
        }
    return -1;
    }


}
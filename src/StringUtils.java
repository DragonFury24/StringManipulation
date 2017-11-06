public class StringUtils {

    public static String rotationOf2(String s) {
        return s.length() > 2 ? s.substring(2) + s.substring(0, 2) : s;
    }

    public static String palindrome(String s) {
        if (s.trim().contains(" ")) { //If 2 words are given
            String[] strings = s.trim().split(" "); //separates the 2 words
            return strings[0] + strings[1] + strings[1] + strings[0];
        } else { //A single word is given
            StringBuilder stringBuilder = new StringBuilder(s);
            //Concats the single word with a reversed version of itself
            for (int i = s.length() - 1; i >= 0; i--) {
                stringBuilder.append(s.charAt(i));
            }
            return stringBuilder.toString();
        }
    }

    public static String repeatFront(String s, int prefixToRepeat) {
        if (prefixToRepeat > s.length()) {return s;}

        String temp = s.substring(0, prefixToRepeat);
        StringBuilder stringBuilder = new StringBuilder();
        if (s.substring(0, prefixToRepeat).length() > 1) {
            while (temp.length() > 0) {
                stringBuilder.append(temp);
                temp = temp.substring(0, temp.length() - 1);
            }
            return stringBuilder.toString();
        }
        return s;
    }

    public static String prefixRepeated(String s, int prefixAmount) {
        return prefixAmount > s.length() ? s :
                (s.toLowerCase().substring(prefixAmount).contains(s.substring(0, prefixAmount)) ? "Yes" : "No");

    }
}

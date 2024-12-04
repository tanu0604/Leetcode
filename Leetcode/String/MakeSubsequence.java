package String;

public class MakeSubsequence {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ad";
        System.out.println(canMakeSubsequence(str1, str2));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == lessChar(str2.charAt(j)) || str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == str2.length();
    }

    public static char lessChar(char ch) {
        return ch == 'a' ? 'z' : (char) (ch - 1);
    }
}

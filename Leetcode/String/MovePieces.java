package String;

public class MovePieces {
    public static void main(String[] args) {
        String start = "_L__R__R_";
        String target = "L______RR";
        System.out.println(canChange(start, target));
    }

    public static boolean canChange(String start, String target) {
        // Pointers for both strings
        int i = 0, j = 0;
        int n = start.length();

        while (i < n || j < n) {
            // Move i and j to the next non-underscore character
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            // If one pointer reaches the end while the other doesn't, return false
            if (i == n || j == n) {
                return i == j;
            }

            // Check if the characters at the current positions are different
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Check movement rules
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' can only move left
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' can only move right
            }

            // Move both pointers
            i++;
            j++;
        }

        return true;
    }
}

package geeksforgeeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
    static int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        String str = "ggg";
        Set<String> result = new HashSet<>();

        generateSubsequences(str, 0, "",result);
        System.out.println(result);

        // Reverse
        String str1 = ".like.this.program.very.much";
        System.out.println(reverseWords(str1));

        //Check anagram
        char str3[] = ("geeksforgeks").toCharArray();
        char str4[] = ("forgeeksgeeks").toCharArray();

        System.out.println(isAnagram(str3, str4));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate90(matrix);


    }

    public static void generateSubsequences(String str, int index, String current, Set<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }

        generateSubsequences(str, index + 1, current, result);

        generateSubsequences(str, index + 1, current + str.charAt(index), result);
    }

    // Reverse the words in the string
    public static String reverseWords(String s) {
        String[] words = s.split("\\.");
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                stack.push(word);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static boolean isAnagram(char[] str1,char[]  str2) {
        if (str1.length != str2.length) {
            return false;
        }
        if (str1.length == 0) {
            return false;
        }

        int[] count1 = new int[NO_OF_CHARS];
        int[] count2 = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        Arrays.fill(count2, 0);

        for (int i =0; i < str1.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        for (int i =0; i< NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void rotate90(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[j][n - 1 - i];
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}

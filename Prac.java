import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prac {
    public static void main(String[] args) {
        System.out.println("Enter the name of the word lists text file:");
        String fileName = System.console().readLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int longestSubsequenceLength = findLongestSubsequenceLength(line);
                System.out.println("Longest is " + longestSubsequenceLength + ".");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Done");
    }

    private static int findLongestSubsequenceLength(String line) {
        String[] words = line.split(" "); /// iterate wth i
        int[] lengths = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            lengths[i] = 1;  // Initialize each word with a subsequence length of 1
            for (int j = 0; j < i; j++) {
                if (words[i].compareTo(words[j]) > 0 && lengths[i] < lengths[j] + 1) {
                    lengths[i] = lengths[j] + 1;
                }
            }
        }

        int maxLength = 0;
        for (int length : lengths) {
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}


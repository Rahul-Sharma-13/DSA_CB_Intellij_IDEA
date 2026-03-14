package AssignmentRecursion42Questions;

public class CountVowelsStringDryRun {
    public static void main(String[] args) {
        String word = "aeiou";
        int i = 0;
        int count = 0;
        System.out.println(CountVowels(word, i, count));
    }

    public static int CountVowels(String word, int i, int count) {
        char ch = word.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
        if (i == word.length()-1) {
            return count;
        }
        return CountVowels(word, i + 1, count);
    }
}

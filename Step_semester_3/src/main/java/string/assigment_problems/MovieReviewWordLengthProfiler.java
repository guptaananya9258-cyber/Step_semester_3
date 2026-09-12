package string.assigment_problems;

public class MovieReviewWordLengthProfiler {

    static void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {

            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length <= 8) {
                mediumCount++;
            } else {
                longCount++;
            }
        }

        System.out.println("Short words (1-4): " + shortCount);
        System.out.println("Medium words (5-8): " + mediumCount);
        System.out.println("Long words (9+): " + longCount);
    }

    static void main() {

        String review = "This movie was absolutely fantastic and thrilling";

        classifyWordLengths(review);
    }
}
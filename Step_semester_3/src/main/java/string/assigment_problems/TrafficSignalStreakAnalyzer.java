package string.assigment_problems;

public class TrafficSignalStreakAnalyzer {

    static void findLongestStreak(String signalLog) {

        char longestColor = signalLog.charAt(0);
        int longestLength = 1;

        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest streak: " + longestColor
                + " repeated " + longestLength + " times");
    }

    static void main() {

        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}
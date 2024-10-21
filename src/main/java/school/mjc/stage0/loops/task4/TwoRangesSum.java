package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int sumNumber = 0;
        int sumSkipped = 0;
        for (int a = 1; a <= numberToSkip; a++) {
            sumSkipped += a;
        }

        for (int i = numberToSkip + 1; i <= lastInRow; i++) {
            sumNumber += i;
        }

        System.out.println("skipped sum is " + sumSkipped);
        System.out.println("counted sum is " + sumNumber);
    }
}
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /** DIRECTIONS:
         * One hot summer day Pete and his friend Billy decided to buy a watermelon.
         * They chose the biggest and the ripest one, in their opinion.
         * After that the watermelon was weighed, and the scales showed w kilos.
         * They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.
         *
         * Pete and Billy are great fans of even numbers,
         * that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos,
         * at the same time it is not obligatory that the parts are equal.
         * The boys are extremely tired and want to start their meal as soon as possible,
         * that's why you should help them and find out, if they can divide the watermelon in the way they want.
         * For sure, each of them should get a part of positive weight.
         */

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        // In short, the instructions translate to tell whether a number can be split into two even amounts.
        // As long as a number is even, this is guaranteed to be the case.

        // This is because any even number "n" can be split into the numbers 2 and n - 2, which are both even.
        // This is not the case for two however, as it is only built of two 1s.

        // Therefore, the number must not be 2, and must be divisible by 2.

        System.out.println((n % 2 == 0 && n != 2)? "YES" : "NO");

    }


}
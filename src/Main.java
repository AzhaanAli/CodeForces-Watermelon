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

        // In short, the instructions translate to tell whether a number has two even factors.
        // However, if a number has two even factors, then its prime factorization MUST have at least two 2s.
        // AND if a numbers prime factorization has two 2s, it MUST be divisible by 4.
        // Therefore, all that we have to do is check whether a number is divisible by 4, and print YES/NO accordingly.

        System.out.println(n % 4 == 0? "YES" : "NO");

    }


}
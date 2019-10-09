package October9;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double TestScore;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your test score ");
        TestScore = keyboard.nextDouble();

        if (TestScore < 60)
            System.out.println("Grade is F");
        else if (TestScore >= 60 && TestScore < 70)
            System.out.println("Grade is D");
        else if (TestScore >= 70 && TestScore < 80)
            System.out.println("Grade is C");
        else if (TestScore >= 80 && TestScore < 90)
            System.out.println("Grade is B");
        else
            System.out.println("Grade is A");
    }
}

/* When comparing multiple things, use else if instead of multiple if statements that way it won't go through every single
option.  Originally, you had it only comparing the last if statement (B) for an A, so if you scored less than a B it would
print out both.

You can also compare more than one statement using the && function (and) or the || (or) function.  This takes out your
extra if statements so now you just check if it is between the 2 boundaries.
 */

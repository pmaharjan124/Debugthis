import java.util.Scanner;
public class DebugThis {
    public static void main(String[] args) {
        char grade = 0;
        int testScore;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a score: ");
        testScore = input.nextInt();

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {

        } else if (testScore >= 60) {
            grade = 'C';
        } else if (testScore >= 59) {
            grade = 'F';

        }
        System.out.println("Grade = " + grade);
    }
}

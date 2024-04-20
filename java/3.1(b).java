import java.util.Scanner;

public class GradeCalculator {
    public static char calculateGradeWithSwitch(int score) {
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        
        char grade = calculateGradeWithSwitch(score);
        System.out.println("Grade using switch-case: " + grade);
    }
}

import java.util.Scanner;

public class GradeCalculator {
    public static char calculateGradeWithIf(int score) {
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        
        char grade = calculateGradeWithIf(score);
        System.out.println("Grade using if-else: " + grade);
    }
}

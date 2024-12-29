import java.util.Scanner;
public class StudentGradeCalculator {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of subjects: ");
    int numSubjects = scanner.nextInt();

    double[] marks = new double[numSubjects];
    double totalMarks = 0;

    for (int i = 0; i < numSubjects; i++) {
        System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
        marks[i] = scanner.nextDouble();
        totalMarks += marks[i];
    }

    double averagePercentage = totalMarks / numSubjects;

    char grade;
    if (averagePercentage >= 90) {
        grade = 'A';
    } else if (averagePercentage >= 80) {
        grade = 'B';
    } else if (averagePercentage >= 70) {
        grade = 'C';
    } else if (averagePercentage >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }

    System.out.println("\n=== Results ===");
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
    System.out.println("Grade: " + grade);

    scanner.close();
}
}


import java.util.Scanner;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ThirdRankerWithoutArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student first = null, second = null, third = null;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter marks of " + name + ": ");
            double marks = scanner.nextDouble();
            scanner.nextLine();  
            Student current = new Student(name, marks);

            if (first == null || current.marks > first.marks) {
                
                third = second;
                second = first;
                first = current;
            } else if (second == null || current.marks > second.marks) {
                third = second;
                second = current;
            } else if (third == null || current.marks > third.marks) {
                third = current;
            }
        }

        if (third != null) {
            System.out.println("\nThird Ranker:");
            System.out.println("Name: " + third.name);
            System.out.println("Marks: " + third.marks);
        } else {
            System.out.println("Not enough students to determine third rank.");
        }

        scanner.close();
    }
}


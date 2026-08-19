import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentRegistrationObjectSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student first = new Student();

        first.registrationId = sc.nextInt();
        first.name = sc.next();
        first.attendancePercentage = sc.nextDouble();

        Student second = new Student();

        second.registrationId = sc.nextInt();
        second.name = sc.next();
        second.attendancePercentage = sc.nextDouble();

        int searchId = sc.nextInt();
        double newAttendance = sc.nextDouble();

        Student selectedStudent = null;

        if (searchId == first.registrationId) {
            selectedStudent = first;
        } else if (searchId == second.registrationId) {
            selectedStudent = second;
        }

        if (selectedStudent != null) {

            selectedStudent.attendancePercentage = newAttendance;

            System.out.println("Selected Student: " + selectedStudent.name);

            if (first.attendancePercentage > second.attendancePercentage) {
                System.out.println(
                    first.registrationId + " - "
                    + first.name + " - "
                    + first.attendancePercentage + "%"
                );
            } else {
                System.out.println(
                    second.registrationId + " - "
                    + second.name + " - "
                    + second.attendancePercentage + "%"
                );
            }

        } else {
            System.out.println("Student not found.");

            System.out.println(
                first.registrationId + " - "
                + first.name + " - "
                + first.attendancePercentage + "%"
            );

            System.out.println(
                second.registrationId + " - "
                + second.name + " - "
                + second.attendancePercentage + "%"
            );
        }

        sc.close();
    }
}
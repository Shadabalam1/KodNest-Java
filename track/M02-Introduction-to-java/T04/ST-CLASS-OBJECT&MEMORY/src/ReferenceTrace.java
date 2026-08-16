class Student {
    int id;
    double score;
}

public class ReferenceTrace {
    public static void main(String[] args) {

        Student first = new Student();

        first.id = 101;
        first.score = 75.0;

        Student second = first;

        second.score = 85.0;

        first = new Student();

        first.id = 202;
        first.score = 90.0;

        second = first;

        System.out.println(first.id + " - " + first.score);
        System.out.println(second.id + " - " + second.score);
    }
}
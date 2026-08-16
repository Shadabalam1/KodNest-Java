public class w1
{
    public static void main(String[] args) {
       int number = -7;
       int firstScore = 18;
       int secondScore = 25;

       if (number > 0) {
        System.out.println("Number type: positive");
        } else if (number < 0) {
            System.out.println("Number type: negative");
        } else {
            System.out.println("Number type: zero");
        }

        if (firstScore >= secondScore) {
            System.out.println("First Score");
        } else {
            System.out.println("Second Score");
        }
        if (number % 2 == 0 ){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}   
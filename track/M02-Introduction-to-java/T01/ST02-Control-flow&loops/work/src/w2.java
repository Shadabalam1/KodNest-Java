public class w2 {
    public static void main(String[] args) {
        
        int marks = 72;
        int attendance = 80;
        boolean projectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean acadamicEligible = marksEligible && attendanceEligible;
        boolean placementEligible = acadamicEligible && projectCompleted;
        System.out.println("Placement Eligible : " + placementEligible);
    }
    
}

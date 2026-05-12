public class ManagementSystem {

    public static String CalculateGPA(int id) {
        if (Students.getStudent(id).equals("Student ID not found.")) {
            return "Student not found.";
        } else {
            String data = Students.getStudent(id) + "'s GPA: ";
            double totalGPA = Subjects.getTotalGPA(id);
            if (Double.isNaN(totalGPA)) {
                data = "No subjects added for " + Students.getStudent(id) + ". \nGPA cannot be calculated.";
            } else {
                data += String.format("%.1f", totalGPA);
            }
            return data;
        }
    }

    public static String showGrade(int id) {
        if (Students.getStudent(id).equals("Student ID not found.")) {
            return "Student not found.";
        } else {
            String data = CalculateGPA(id) + " => Grade: ";
            double totalGPA = Subjects.getTotalGPA(id);
            if (Double.isNaN(totalGPA)) {
                data = "No subjects added for " + Students.getStudent(id) + ". \nGPA cannot be calculated.";
            } else if (totalGPA >= 4.0) {
                data += "A+";
            } else if (totalGPA >= 3.7) {
                data += "A";
            } else if (totalGPA >= 3.3) {
                data += "B+";
            } else if (totalGPA >= 3.0) {
                data += "B";
            } else if (totalGPA >= 2.7) {
                data += "B-";
            } else if (totalGPA >= 2.3) {
                data += "C+";
            } else if (totalGPA >= 2.0) {
                data += "C";
            } else if (totalGPA >= 1.7) {
                data += "C-";
            } else if (totalGPA >= 1.3) {
                data += "D+";
            } else if (totalGPA >= 1.0) {
                data += "D";
            } else {
                data += "F";
            }
            return data;
        }
    }

}

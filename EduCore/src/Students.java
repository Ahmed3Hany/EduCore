
import java.util.HashMap;

public class Students {

    private static final HashMap<Integer, String> studentsNames = new HashMap<>();
    private static final HashMap<Integer, String> studentsMajor = new HashMap<>();

    public static String getStudent(int id) {
        if (studentsNames.containsKey(id)) {
            String stdname = studentsNames.get(id);
            return stdname;
        }
        return "Student ID not found.";
    }

    public static String AddStudent(int id, String name, String major) {
        if (getStudent(id).equals("Student ID not found.")) {

            if (studentsNames.containsValue(name)) {
                return "Student already exists.";
            } else {
                studentsNames.put(id, name);
                studentsMajor.put(id, major);
                return "Student added successfully.";
            }
        }
        return "Student already exists.";
    }

    public static String DisplayStudentInfo(int id) {
        if (getStudent(id).equals("Student ID not found.")) {
            return "Student not found.";
        } else {            
            String stdname = studentsNames.get(id);
            String stdmajor = studentsMajor.get(id);
            String stdData = "Student ID: " + id + "\nName: " + stdname + "\nMajor: " + stdmajor + "\n\n";
            String subjectsData = "Subjects:\n\n" + Subjects.getSubject(id, "Java") + Subjects.getSubject(id, "Database 2") + Subjects.getSubject(id, "Data Structure") + Subjects.getSubject(id, "Web Development 2") + Subjects.getSubject(id, "CCNA");
            return stdData + subjectsData;
        }
    }

    public static String DisplayAllStudents() {
        String data = "All Students:\n\n";
        int stdNum = 1;
        for (int id : studentsNames.keySet()) {
            data += stdNum + ". " + studentsNames.get(id) + "\n";
            stdNum++;
        }
        return data;
    }

    public static String RemoveStudentInfo(int id) {
        if (getStudent(id).equals("Student ID not found.")) {
            return "Student not found.";
        } else {
            studentsNames.remove(id);
            studentsMajor.remove(id);
            Subjects.RemoveSubject(id, "Java");
            Subjects.RemoveSubject(id, "Database 2");
            Subjects.RemoveSubject(id, "Data Structure");
            Subjects.RemoveSubject(id, "Web Development 2");
            Subjects.RemoveSubject(id, "CCNA");

            return "Student removed successfully.";
        }
    }




    public static String showHighestGPA() {
        if (Students.DisplayAllStudents().equals("All Students:\n\n")) {
            return "No students found.";
        } else {
            String data = "Student(s) with the Highest GPA:\n\n";
            double highestGPA = -1.0;
            for (int id : studentsNames.keySet()) {
                double studentGPA = Subjects.getTotalGPA(id);
                if (!Double.isNaN(studentGPA)) {
                    if (studentGPA > highestGPA) {
                        highestGPA = studentGPA;
                        data = "Student(s) with the Highest GPA:\n\n" + studentsNames.get(id) + " with GPA: " + String.format("%.1f", studentGPA) + "\n";
                    } else if (studentGPA == highestGPA) {
                        data += studentsNames.get(id) + " with GPA: " + String.format("%.1f", studentGPA) + "\n";
                    }
                }
            }
            if (highestGPA == -1.0) {
                return "No subjects added for any student. \nGPA cannot be calculated.";
            }
            return data;
        }
    }

}

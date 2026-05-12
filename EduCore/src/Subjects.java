
import java.util.HashMap;

public class Subjects {

    private static final HashMap<Integer, Double[]> javaSubject = new HashMap<>();
    private static final HashMap<Integer, Double[]> dbSubject = new HashMap<>();
    private static final HashMap<Integer, Double[]> dsSubject = new HashMap<>();
    private static final HashMap<Integer, Double[]> webSubject = new HashMap<>();
    private static final HashMap<Integer, Double[]> ccnaSubject = new HashMap<>();

    
    public static double getTotalGPA(int id) {
        double totalCreditHours = 0;
        double totalGPA = 0;
        if (javaSubject.containsKey(id)) {
            totalCreditHours += javaSubject.get(id)[0];
            totalGPA += Main.map(javaSubject.get(id)[1], 0.0, 100.0, 0.0, 4.0) * javaSubject.get(id)[0];
        }
        if (dbSubject.containsKey(id)) {
            totalCreditHours += dbSubject.get(id)[0];
            totalGPA += Main.map(dbSubject.get(id)[1], 0.0, 100.0, 0.0, 4.0) * dbSubject.get(id)[0];    
        }
        if (dsSubject.containsKey(id)) {
            totalCreditHours += dsSubject.get(id)[0];
            totalGPA += Main.map(dsSubject.get(id)[1], 0.0, 100.0, 0.0, 4.0) * dsSubject.get(id)[0];
        }
        if (webSubject.containsKey(id)) {
            totalCreditHours += webSubject.get(id)[0];
            totalGPA += Main.map(webSubject.get(id)[1], 0.0, 100.0, 0.0, 4.0) * webSubject.get(id)[0];
        }
        if (ccnaSubject.containsKey(id)) {
            totalCreditHours += ccnaSubject.get(id)[0];
            totalGPA += Main.map(ccnaSubject.get(id)[1], 0.0, 100.0, 0.0, 4.0) * ccnaSubject.get(id)[0];
        }
        return totalGPA / totalCreditHours;
    }

    public static String getSubject(int id, String subject) {
        String data = "";
        if (javaSubject.containsKey(id) && subject.equals("Java")) {
            Double[] subjectInfo = javaSubject.get(id);
            data += "Java: Credit Hours: " + subjectInfo[0] + " | GPA: " + subjectInfo[1] + "\n";
        }
        if (dbSubject.containsKey(id) && subject.equals("Database 2")) {
            Double[] subjectInfo = dbSubject.get(id);
            data += "Database 2: Credit Hours: " + subjectInfo[0] + " | GPA: " + subjectInfo[1] + "\n";
        }
        if (dsSubject.containsKey(id) && subject.equals("Data Structure")) {
            Double[] subjectInfo = dsSubject.get(id);
            data += "Data Structure: Credit Hours: " + subjectInfo[0] + " | GPA: " + subjectInfo[1] + "\n";
        }
        if (webSubject.containsKey(id) && subject.equals("Web Development 2")) {
            Double[] subjectInfo = webSubject.get(id);
            data += "Web Development 2: Credit Hours: " + subjectInfo[0] + " | GPA: " + subjectInfo[1] + "\n";
        }
        if (ccnaSubject.containsKey(id) && subject.equals("CCNA")) {
            Double[] subjectInfo = ccnaSubject.get(id);
            data += "CCNA: Credit Hours: " + subjectInfo[0] + " | GPA: " + subjectInfo[1] + "\n";
        }
        return data;
    }

    public static String AddSubject(int id, String subject, double creditHours, double gpa) {
        if (Students.getStudent(id).equals("Student ID not found.")) {
            return "Student not found.";
        } else if (gpa < 0 || gpa > 100) {
            return "Invalid GPA. Please enter a value between 0 and 100.";
        } else {
            if (getSubject(id, subject).equals("")) {
                Double[] subjectInfo = {creditHours, gpa};
                switch (subject) {
                    case "Java" ->
                        javaSubject.put(id, subjectInfo);
                    case "Database 2" ->
                        dbSubject.put(id, subjectInfo);
                    case "Data Structure" ->
                        dsSubject.put(id, subjectInfo);
                    case "Web Development 2" ->
                        webSubject.put(id, subjectInfo);
                    case "CCNA" ->
                        ccnaSubject.put(id, subjectInfo);
                }
                return "Subject added successfully.";
            } else {
                return "Subject already exists.";
            }
        }
    }

    public static String RemoveSubject(int id, String subject) {
        if (Students.getStudent(id).equals("Student ID not found.")) {
            return "Student not found.";
        } else if (getSubject(id, subject).equals("")) {
            return "Subject not found.";
        } else {
            switch (subject) {
                case "Java" ->
                    javaSubject.remove(id);
                case "Database 2" ->
                    dbSubject.remove(id);
                case "Data Structure" ->
                    dsSubject.remove(id);
                case "Web Development 2" ->
                    webSubject.remove(id);
                case "CCNA" ->
                    ccnaSubject.remove(id);
            }
            return "Subject removed successfully.";
        }
    }

}

import java.util.HashMap;   

public class Students {
    
    private static final HashMap<Integer, String> studentsNames = new HashMap<>();
    private static final HashMap<Integer, String> studentsMajor = new HashMap<>();

    public static String AddStudent(int id, String name, String major) {
        if (Students.studentsNames.containsKey(id) || Students.studentsNames.containsValue(name)) {
            return "Student already exists.";
        }
        else{
            Students.studentsNames.put(id, name);
            Students.studentsMajor.put(id, major);
            return "Student added successfully.";
        }
    }

    public static String DisplayStudentInfo(int id) {
        if (Students.studentsNames.containsKey(id)) {
            String name = Students.studentsNames.get(id);
            String major = Students.studentsMajor.get(id);
            String data = "Student Info:\n\nID: " + id + "\nName: " + name + "\nMajor: " + major;
            
            return data;
        } else {
            return "Student not found.";
        }
    }
}

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        for (Student s : students){
            s.displayInfo();
        }
    }

    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean deleteByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }
}
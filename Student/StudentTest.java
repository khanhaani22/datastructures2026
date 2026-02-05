import java.util.*;
import Student;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Alice", 16));
        students.add(new Student(2, "Bob", 18));
        students.add(new Student(3, "Charlie", 17));
    }
}

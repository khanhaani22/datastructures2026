import java.util.*;
import Student;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(3, "Alice", 16));
        students.add(new Student(2, "Bob", 18));
        students.add(new Student(5, "Charlie", 17));
        //sort by roll no
        System.out.println("Sorting by roll number...");
        Collections.sort(students);

        for(Student st: students)
        {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }
        
        // Line Break
        System.out.println("\n-----------------------------\n");
        
        //sort by name
        System.out.println("\nSorting by name...");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(students, nameCompare);

        for(Student st: students)
        {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }

        // Line Break
        System.out.println("\n-----------------------------\n");
        
        //sort by age
        System.out.println("\nSorting by age...");
        AgeCompare ageCompare = new AgeCompare();
        Collections.sort(students, ageCompare);
        for(Student st: students)
        {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }
    }
}

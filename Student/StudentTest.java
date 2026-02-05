import java.util.*;
import Student;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Alice", 16));
        students.add(new Student(2, "Bob", 18));
        students.add(new Student(3, "Charlie", 17));
        //sort by roll no
        System.out.println("Sorting by roll number...");
        Collections.sort(students);

        for(Student st: students)
        {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }
        //sort by name
        System.out.println("\nSorting by name...");
        Collections.sort(students, new NameCompare());

        for(Student st: students)
        {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }

        //sort by age
        System.out.println("\nSorting by age...");
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
    }
        });

        for(Student st: students)
        {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }
    }
}

import java.util.Comparator;
import java.lang.Comparable;

public class Student implements Comparable<Student>{
    private int rollno;
    private String name;
    private int age;

    public Student(){
        this.name = null;
        this.rollno = this.age = 0;
    }
    public Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getRollno(){
        return rollno;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setName(String name){
        this.name = name;
    }

    public int compareTo(Student s){
        //NameCompare nameCompare = new NameCompare();
        //return nameCompare.compare(this, s);
        
        AgeCompare ageCompare = new AgeCompare();
        return ageCompare.compare(this, s);
    }

    public String toString(){
        return "[name: "+getName()+", rollNo: "+getRollno()+", age: "+getAge()+"]";
    }

    private class NameCompare implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.getName().compareTo(s2.getName());
        }
    }

    private class AgeCompare implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            //ascending
            return s1.getAge() - s2.getAge();
        }
    } 
}

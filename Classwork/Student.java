import java.util.*;

public class Student implements Comparable<Student>
{
   int rollno;
   String name;
   int age;
   
   public Student()
   {
      rollno = 0;
      name = "";
      age = 0;
   }
   
   public Student(int rollno, String name, int age)
   {
      this.rollno = rollno;
      this.name = name;
      this.age = age;
   } 
   public void setRollNo(int rollno)
   {
      this.rollno = rollno;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setAge(int age)
   {
      this.age = age;
   }
   public int getRollNo()
   {
      return rollno;
   }
   public String getName()
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }
   public int compareTo(Student st)
   {
      if(rollno > st.rollno)
         return 1;
      else if(rollno < st.rollno)
         return -1;
      else
         return 0;
   } 
}   
   class NameCompare implements Comparator<Student>
   {
      public int compare(Student s1, Student s2)
      {
         return s1.getName().compareTo(s2.getName());
      }
   }
   class AgeCompare implements Comparator<Student>
   {
      public int compare(Student s1, Student s2)
      {
         if(s1.getAge() > s2.getAge())
            return 1;
         else if(s1.getAge() < s2.getAge())
            return -1;
         else
            return 0;
      }
   }
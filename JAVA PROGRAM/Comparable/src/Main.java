import stud.Student;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import static java.util.Collection.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student>linkedList=new LinkedList<Student>();
        Student[] students=new Student[4];
        students[0]=new Student("Yashashree",89);
        students[1]=new Student("Mayuri",65);
        students[2]=new Student("Vishakha",87);
        students[3]=new Student("Pallavi",98);
        linkedList.addAll(Arrays.asList(students));
        Collections.sort(linkedList);
        for(Student student:linkedList) {
            System.out.println(student.getName()+ " "+ student.getMarks());
        }

    }
}
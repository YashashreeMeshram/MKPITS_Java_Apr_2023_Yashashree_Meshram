

import stud.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList<Student> arrayList=new <Student>ArrayList();
        Student[] students=new Student[6];
        students[0]=new Student("Yashashree",99,"Science");
        students[1]=new Student("Vishakha",96,"Arts");
        students[2]=new Student("Pallavi",93,"Science");
        students[3]=new Student("Mayuri",94,"commerce");
        students[4]=new Student("Gargi",89,"Arts");
        students[5]=new Student("Shreyashree",70,"commerce");

        arrayList.addAll(Arrays.asList(students));
        System.out.println(arrayList);

        List<Student> list=  Arrays.stream(students).map(c->c).collect(Collectors.toList());
        System.out.println(list);



    }
}


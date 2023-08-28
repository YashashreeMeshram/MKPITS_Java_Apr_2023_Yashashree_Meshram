import stud.Student;
import java.util.LinkedList;
import java.util.Scanner;


public class StudentManagement {
    LinkedList<Student> StudentLinkedlist;
    Student student;
    Scanner scanner;
    StudentManagement() {
        StudentLinkedlist = new LinkedList<Student>();
        scanner = new Scanner(System.in);
    }


    public void sms() {
        int choice;

        while (true) {
            System.out.println("1- Add Record");
            System.out.println("2- Display All Records");
            System.out.println("3-Delete");
            System.out.println("4- Delete all record");
            System.out.println("5- Search the record");
            System.out.println("6- Exit");
            System.out.println("Enter Choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name and marks:");
                    student = new Student(scanner.next(), scanner.nextInt());
                    StudentLinkedlist.add(student);
                    break;
                case 2:
                    for (Student s : StudentLinkedlist) {
                        System.out.println(s.getName()+", "+s.getMarks());
                    }
                    break;
                case 3:
                StudentLinkedlist.remove(1);
                break;
                case 4:
                    StudentLinkedlist.clear();
                    break;
                case 5:
                    System.out.println("Enter record number");
                    int n=scanner.nextInt();
                    System.out.println(StudentLinkedlist.get(n));
                    break;
                case 6:
                    StudentLinkedlist.set(1,new Student("Pari",78));
                    System.out.println(student.getName()+", "+student.getMarks());

                case 7:
                    return;


            }
        }

            }
        }


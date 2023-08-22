package stud;

public class Student implements java.io.Serializable {
    private String name;
    private int marks;
    public Student(){

    }
    public Student(String name, String marks){
        this.name=name;
        this.marks= Integer.parseInt(marks);
    }
public String getName(){
        return name;
}

    public int getMarks() {
        return marks;
    }
}

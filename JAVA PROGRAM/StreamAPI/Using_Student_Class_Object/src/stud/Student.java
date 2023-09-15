package stud;

public class Student {

    public Student(String name, int marks, String Breanch) {
    }

    public class student {
        public String Name;
        public String Branch;
        public int Marks;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getBranch() {
            return Branch;
        }

        public void setBranch(String branch) {
            Branch = branch;
        }

        public int getMarks() {
            return Marks;
        }

        public void setMarks(int marks) {
            Marks = marks;
        }

        @Override
        public String toString() {
            return "student{" +
                    "Name='" + Name + '\'' +
                    ", Branch='" + Branch + '\'' +
                    ", Marks=" + Marks +
                    '}';
        }

        public student(String name, String branch, int marks) {
            Name = name;
            Branch = branch;
            Marks = marks;





        }
    }

}


import stud.*;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s=new Student("Yashashree","90");
        ReadWriteObject.writeObjectToFile(s);
        ReadWriteObject.readObjectFromFile();
    }
}
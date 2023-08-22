import java.io.*;

import stud.*;
public class ReadWriteObject {
    public static void writeToFile(String fname) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fname,true));
        String choice;
        do {
            System.out.println("enter the contents");
            String str = br.readLine();
            bw.write(str + "\n");
            System.out.println("Do you want to add anotherString (yes/no)");
            choice=br.readLine();
        } while (choice.equalsIgnoreCase("yes"));
        bw.close();
    }
    public static void readFromFile(String fname){
        File file=new File(fname);


    }
    public static void writeObjectToFile(Student s) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(s);
        oos.close();
    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
        Student s = (Student) (ois.readObject());
        System.out.println(s.getName()+" "+s.getMarks());
    }
}

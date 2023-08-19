import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File f=new File("C:","MyProject12");
        System.out.println(f.exists());
        System.out.println(f.getParentFile());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.lastModified());
        File f2=new File(
                "E:\\");

        System.out.println(f2.exists());
        System.out.println(f2.setReadable(false));
        System.out.println(f2.lastModified());
        System.out.println(f2.getFreeSpace());
        System.out.println(f2.getPath());
        System.out.println(f2.isDirectory());
        System.out.println(f2.length());
        System.out.println(f2.getParentFile());
        System.out.println(f2.getAbsolutePath());
        File f3=new File(f2,"MyProject12");
        String [] files=f2.list();
        for(String  fn:files){
            System.out.println(fn);
    }
}}
import java.io.*;
public class Main {
    public static void main(String[] args) {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the full name:");
        try {
            String nm=br.readLine();
            System.out.println("Hii :"+nm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
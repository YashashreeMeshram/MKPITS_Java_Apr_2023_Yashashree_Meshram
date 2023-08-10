public class Main {
    public static void main(String[] args) {
        Customer c=new Customer();
        try {
            c.displayAge(60);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
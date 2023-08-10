public class Customer {
    public void displayAge(int age) throws InvalidAgeException {
        if(age<0 || age>100)
            throw new InvalidAgeException();
        System.out.println("age" +age);
    }
}

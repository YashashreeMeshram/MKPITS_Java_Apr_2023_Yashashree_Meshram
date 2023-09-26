interface Shape {
    void calArea(int l,int b);
}

public class Main {
    public static void main(String[] args) {
//using Lambda expression//
        Shape s = (l, b) -> System.out.println("Area of Rectangle =" + (l * b));

        s.calArea(76, 45);
    }
};

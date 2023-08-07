package shapes1;
public class Rectangle  implements Shape {

    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public void calArea() {

        double area= length*breath;
        System.out.println("area of Rectagle is"+area);
    }
}

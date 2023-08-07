package shapes1;

 public class Circle implements Shape {
    int radius;
    public Circle(int radius){
        this. radius=radius;
    }

    public void calArea(){
        System.out.println ("area of circle :" +(3.14 * radius*radius*radius));
    }
}



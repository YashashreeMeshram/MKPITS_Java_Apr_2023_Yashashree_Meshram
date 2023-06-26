public class AreaOfTriangleLoading {
public int triangle(int base,int height) {
return base*height/2;
}
public double triangle(double base, double height){
	return base*height/2;
}
public static void main(String[] args) {
AreaOfTriangleLoading area= new AreaOfTriangleLoading();
int First= area.triangle(9,6);
System.out.println("Area of triangle" +First);
double Second= area.triangle(12.0,40.0);
System.out.println("Area of triangle" +Second);
}
}	
	 
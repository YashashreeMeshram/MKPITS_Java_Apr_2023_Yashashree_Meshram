class AdditionArguNoReturntype {
public void addition(int number1,int number2) {
int sum;
sum=number1+number2;
System.out.println("Addition of two numbers"+sum);
}
public static void main(String[] args) {
AdditionArguNoReturntype add= new AdditionArguNoReturntype();
add.addition(10,20);
}
}
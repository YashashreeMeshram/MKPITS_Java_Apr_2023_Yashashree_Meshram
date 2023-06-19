class DivisionNoArguReturntype {
public int divide() {
int number1=20,number2=3;
return number1/number2;
}
public static void main(String[] args) {
DivisionNoArguReturntype add= new DivisionNoArguReturntype();
int div=add.divide();
System.out.println("division of two numbers="+div);
}
}
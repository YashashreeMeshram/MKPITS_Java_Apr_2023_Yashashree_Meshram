class MultiplicationNoArguReturntype {
public int multiply() {
int number1=20,number2=3;
return number1*number2;
}
public static void main(String[] args) {
MultiplicationNoArguReturntype add= new MultiplicationNoArguReturntype();
int mul=add.multiply();
System.out.println("multiplication of two numbers="+mul);
}
}
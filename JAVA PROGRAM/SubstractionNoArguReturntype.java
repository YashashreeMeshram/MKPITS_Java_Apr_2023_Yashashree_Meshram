class SubstractionNoArguReturntype {
public int substract() {
int number1=20,number2=3;
return number1-number2;
}
public static void main(String[] args) {
SubstractionNoArguReturntype add= new SubstractionNoArguReturntype();
int sub=add.substract();
System.out.println("substraction of two numbers="+sub);
}
}
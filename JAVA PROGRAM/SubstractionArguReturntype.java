class SubstractionArguReturntype {
public int substract(int number1,int number2) {
return number1-number2;
}
public static void main(String[] args) {
SubstractionArguReturntype add= new SubstractionArguReturntype();
int sub=add.substract(30,20);
System.out.println("substraction of two numbers="+sub);
}
}
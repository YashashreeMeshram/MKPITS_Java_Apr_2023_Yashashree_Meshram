public class MultiplicationLoading {
int multiply(int num1,int num2) {
return num1*num2;
}
int multiply(int num1,int num2,int num3) {
	return num1*num2*num3;
}
public static void main(String[] args) {
MultiplicationLoading mo=new MultiplicationLoading();
int first= mo.multiply(4,5);
System.out.println("multiplication of 2 no.="+ first);
int second =mo.multiply(3,8,7);
System.out.println("multiplication of 3 no.="+ second);
}
}
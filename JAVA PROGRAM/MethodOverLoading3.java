public class MethodOverLoading3 {
int method(int num1,int num2) {
return num1/num2;
}
int method(int num1,int num2,int num3) {
	return num1*num2*num3;
}
long method(long num1,long num2) {
return num1/num2;
}
public static void main(String[] args) {
MethodOverLoading3 mo=new MethodOverLoading3();
int first= mo.method(4,5);
System.out.println("division of 2 no.="+ first);
int second =mo.method(3,8,7);
System.out.println("multiplication of 3 no.="+ second);
long third= mo.method(4,5);
System.out.println("division of 2 no.="+ third);
}
}
public class MethodOverLoading2 {
int calc(int num1,int num2) {
return num1;
}
long calc(long num1,long num2) {
	return num1+num2;
}
public static void main(String[] args) {
MethodOverLoading mo=new MethodOverLoading();
int first= mo.calc(4,5);
System.out.println("addition of 2 no.="+ first);
int second =mo.calc(3,8);
System.out.println("addition of 2 no.="+ second);
}
}
import methodref.MyClass;
import methodref.MyInterface;

public class Main {
    public static void main(String[] args) {

    }
        //method reference in non static method//
        MyClass myclass = new MyClass();
        MyInterface myInterface = myClass::display;
        myInterface.disp();
        Runnable runnable = myclass::display;
        Thread thread = newThread(runnable);
        thread.start();


        //method reference in static method//
        MyInterface myInterface=MyClass::display;
        MyInterface.disp();
        Runnable runnable=MyClass::display;
        Thread thread=new Thread(runnable);
        thread.start();




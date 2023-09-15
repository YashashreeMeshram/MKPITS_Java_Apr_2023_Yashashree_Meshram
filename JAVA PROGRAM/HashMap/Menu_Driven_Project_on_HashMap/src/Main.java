import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> CodeOfCity=new HashMap<Integer,String>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println(" \n 1.Add \n 2.Display All \n 3.Find City \n 4.Delete City \n 5.Update CityName \n 6.Clear All \n 7.Exit");
            System.out.println("Enter Choice:-");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the code of City:-");
                    Integer code=sc.nextInt();
                    System.out.println("Enter the Name of City:-");
                    String city=sc.next();
                    CodeOfCity.put(code,city);
                    break;

                case 2:
                    System.out.println(CodeOfCity);
                    break;
                case 3:
                    System.out.println("Enter the code :-");
                    Integer code_ofcity=sc.nextInt();
                    System.out.println("   "+" "+CodeOfCity.get(code_ofcity));
                    break;

                case 4:
                    System.out.println("Enter the code:-");
                    Integer codeOfCity_todelete=sc.nextInt();
                    CodeOfCity.remove(codeOfCity_todelete);
                    System.out.println(CodeOfCity);
                    break;

                case 5:
                    System.out.println("Enter the Code:-");
                    Integer codeOfCity_toremove=sc.nextInt();
                    System.out.println("Enter the city which you want to replace:-");
                    String city_replace=sc.next();
                    CodeOfCity.replace(codeOfCity_toremove,city_replace);
                    System.out.println(CodeOfCity);
                    break;
                case 6 :
                    CodeOfCity.clear();
                    break;
                case 7:
                    return;



            }
        }
    }
}
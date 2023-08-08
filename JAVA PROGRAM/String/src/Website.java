public class Website {
    public static void check(String str){
        String s1=str.substring(0,11);
        if(s1.equals("http://www.")) {
            if (str.substring(11).contains("."))
                System.out.println("Valid Website Name");
            else
                System.out.println("Invalid Website Name");
        }
        else
            System.out.println("Invalid Website Name");

        }
    }


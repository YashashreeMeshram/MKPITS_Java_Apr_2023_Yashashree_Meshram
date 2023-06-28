class ShortDatatype {
public short method( short number1) {
return number1;
}
  public static void main(String[] args) {
   ShortDatatype data=new ShortDatatype();
    short range=data.method(7);	
    System.out.println("short number is valid" +range);  
  }
}
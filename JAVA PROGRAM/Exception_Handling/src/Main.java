
class Main {
    public static void main(String[] args)
    {
        int num[] = {18, 24, 63, 44, 56};
        try {
            for (int i = 0; i <= 6; i++)
                System.out.println(num[i]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("\nOut of bound");
        }
        catch (Exception e) {
            System.out.println("\nOut Bound Exception Caught");
        }finally {
            System.out.println("bye");
        }
    }
}
//Year Tester:

public class Tester
{
   public static void main(String[] args)
   {
      Year y = new Year(1960);
      System.out.println(y.isLeapYear());
      System.out.println("Expected: true");
      y = new Year(2000);
      System.out.println(y.isLeapYear());
      System.out.println("Expected: false");
      y = new Year(1940);
      System.out.println(y.isLeapYear());
      System.out.println("Expected: true");
      y = new Year(1300);
      System.out.println(y.isLeapYear());
      System.out.println("Expected: true");
      y = new Year(1969);
      System.out.println(y.isLeapYear());
      System.out.println("Expected: false");
   }
}
import java.util.Scanner;

	public class Tester2
{
   public static void main(String[] args)
   {
      Data y = new Data();
      Scanner in = new Scanner(System.in);

      System.out.println("Would you like to run  Tester 2?: ");
      System.out.print("Please enter a number or press a letter to end program: ");

      
      
      for (int i = 0 ; i < 5; i++){
          System.out.print("Enter a number or press a letter to end program: ");
    	  y.add(in.nextInt());

      }
      
      System.out.println("count: " + y.getCount());
      System.out.println("average: " + y.getAverage());
      System.out.println("standard deviation: " + y.getStandardDeviation());
   }
}
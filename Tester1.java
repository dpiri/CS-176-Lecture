import java.util.Scanner;


	public class Tester1
	{
   public static void main(String[] args)
   {
      Data y = new Data();
      Scanner in = new Scanner(System.in);
      
      System.out.println("Would you like to run Tester 1?: ");
      System.out.print("Please go ahead and enter a number or press a letter to end program: ");
      
      while (in.hasNextInt()) {
    	  y.add(in.nextInt());
          System.out.print("Please enter a number or press a letter to end program: ");

      }
      
      System.out.println("count: " + y.getCount());
      System.out.println("average: " + y.getAverage());
      System.out.println("standard deviation: " + y.getStandardDeviation());
   }
}

	
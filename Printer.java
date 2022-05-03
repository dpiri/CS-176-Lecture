//Year Printer:

import java.util.Scanner;

 
public class Printer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a year: ");
      int year = in.nextInt();

      
      
      
      Year yourYear = new Year(year);
      if (yourYear.isLeapYear())
         System.out.println(year + " is not a leap year.");
      else
         System.out.println(year + " is a leap year.");
   }
}
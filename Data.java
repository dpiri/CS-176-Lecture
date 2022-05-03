	public class Data{
	
	   private double sum;
	   private double sumSquare;
	   private int s;


	   public Data()
	   {
		   sum = 0;
		   sumSquare = 0;
		   s =0;
		   
	   }


	   public void add(double b)
	   {
	      sum = sum + b;
	      sumSquare = sumSquare + b * b;
	      s++;
	   }


	   public double getAverage()
	   {
	      return sum/s;
	   
	   }

	   public double getStandardDeviation()
	   {
	      
		   return Math.sqrt((sumSquare - ((sum * sum) / s)) / (s-1));
	   }
	   public int getCount()
	   {
	      
		   return s; 
	   }
	   
	}
	   
	   

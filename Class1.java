import java.util.*;

	public class Class1 {
	
	int num;
	
	 String[] class1Array;
	 
	 public Class1(int s){
		 
		 num = s;
		 class1Array = new String[s]; 
		 
	}

	 
	 public void load() {
		  
		 Scanner in = new Scanner(System.in);
		 System.out.println("Please enter " +  num  + (" strings: "));
		 
		 for (int i = 0; i < num; i++) {
			 
			 class1Array[i] = in.next();
			 
			 
		 }
		 
		 
		 
	 }
	 
	 public void Print() {
		 
		 for (int i = num-1; i>=0; i--)  {
			 
			 System.out.println(class1Array[i]);
		 }
		 
		 
	 }
	 
}
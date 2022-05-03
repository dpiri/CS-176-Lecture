import java.util.ArrayList;

public class Sequence2 {

	private ArrayList<String> list;

	public Sequence2() {

		list = new ArrayList<String>();
	
        
	}

	public void add(String n){

		list.add(n);
		

	}
	
	public String toString(){

		return list.toString();

	} 

	
	public Sequence2 append(Sequence2 otherString) {
	
		Sequence2 plate = new Sequence2();
		
		for (int q = 0; q < list.size(); q++) {
		
			plate.add(list.get(q));
			
			
		}
		
		for (int a = 0; a < otherString.list.size(); a++){
			
			plate.add(otherString.list.get(a));
			
		}
		return plate;
		
		
}

}
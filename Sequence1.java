import java.util.ArrayList;

public class Sequence1 {

	private ArrayList<Integer> set;

	public Sequence1() {

		set = new ArrayList<Integer>();
	
        
	}

	public void add(int n){

		set.add(n);
		

	}

	public String toString(){

		return set.toString();

	} 
	
	
	public Sequence1 append(Sequence1 other) {
	
		Sequence1 temp = new Sequence1();
		
		for (int i = 0; i < set.size(); i++) {
		
			temp.add(set.get(i));
			
			
		}
		
		for (int i = 0; i < other.set.size(); i++){
			
			temp.add(other.set.get(i));
			
		}
		return temp;
		
		
}

}

public class SequenceTester {

	public static void main(String[] args) {
		

		
		Sequence1 sq = new Sequence1();
		
		sq.add(0);
		sq.add(1);
		sq.add(2);
		sq.add(3);
		
		Sequence1 st = new Sequence1();
		
		st.add(4);
		st.add(5);
		st.add(6);
		
		System.out.println(sq.append(st));
		
//		convert sequence of strings now
		

		Sequence2 sa = new Sequence2();
		
		sa.add("a");
		sa.add("b"); 
		sa.add("c"); 
		sa.add("d");
		
		Sequence2 sb = new Sequence2();
		
		sb.add("e");
		sb.add("f");
		sb.add("g");
		
		System.out.println(sa.append(sb));




		
		
		
		
	}

}

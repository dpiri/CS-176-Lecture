import java.awt.Rectangle;
public class Part2 {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(120, 140, 160, 180);
		
		Rectangle rect2 = new Rectangle(100, 60, 60, 120);
		
		Rectangle intersection = rect1.intersection(rect2);
		
		System.out.println(intersection);	
		

	}

}

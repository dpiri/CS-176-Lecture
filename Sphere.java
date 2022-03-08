
public class Sphere {

	 private String SphereBall;
	 
	 private double radius;
	 
	 public Sphere(double r, String name) {
		 
	 radius = r;
		 
	 SphereBall = name;
		 
	 }

	 public double getDiameter() {
		
	 return radius * 2;
			
		}
		
	 public double getVolume() {
			
	 return 4/3 * Math.PI * radius * radius * radius;
			
		}

	 public double getSurface() {
			
	 return 4 * Math.PI * radius * radius;
				
		}
	}



package pi;

public class ConstPI {
	
		
		
		public static double PI = Math.PI;
        double radius;
		public ConstPI(double radius) {
			this.radius=radius;
		}
		
		public double getArea() {
			return Math.PI * Math.pow(radius,2);
		}
		
		public double getPerimeter() {
			return 2 * Math.PI * radius;
		}

		
		
	}

	


package pi;
import java.util.Scanner;
public class Use {
	

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			ConstPI myCircle = null;
	
				System.out.println("Enter Circle's radius: ");
				myCircle = new ConstPI(input.nextDouble());
				System.out.println("Area of the circle"+myCircle.getArea());
				System.out.println("Perimeter of the circle"+myCircle.getPerimeter());
			}
			
		}

	




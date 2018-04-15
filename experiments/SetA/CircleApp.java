import java.util.Scanner;

public class CircleApp {
    private Circle aCircle;
    private double radius;

    public CircleApp(double radius) {
        aCircle = new Circle(radius);
   }
    public void menu() {

            System.out.println("1: Area 2: Perimeter 3: Change Radius 4: Quit");
            System.out.println("Enter choice: ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            while (ch != 4) {
                switch (ch) {
                    case 1:
                        System.out.println("Area=" + aCircle.getArea());
                        break;
                    case 2:
                        System.out.println("Perimeter=" + aCircle.getPerimeter());
                        break;
                    case 3:
                        System.out.println("Enter new Radius:");
                        radius = scan.nextDouble();
                        aCircle = new Circle(radius);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Not a valid choice...");
                        break;
                }
                System.out.println("1: Area 2: Perimeter 3: Change Radius 4: Quit");
                System.out.println("Enter choice: ");
                ch = scan.nextInt();
            }

    }
}
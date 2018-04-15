import java.util.Scanner;

public class CircleMenu {
    public static void main(String[] args) {

        System.out.println("Enter Radius:");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        CircleApp aCircle= new CircleApp(radius);
        aCircle.menu();
    }
}

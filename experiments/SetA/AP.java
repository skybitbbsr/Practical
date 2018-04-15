//  Develop a menu based program to compute area and perimeter of a circle, rectangle, square and a right angle triangle.import java.util.Scanner;public class AP {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        Scanner dsc = new Scanner(System.in);        int ch = 0;        while (ch !=5) {            System.out.println("1: Circle 2: Rectangle 3: Square 4: Rightangle 5:Quit");            System.out.println("Enter choice [1-5]: ");            ch = sc.nextInt();            switch (ch) {                case 1:                    System.out.println("Enter Radius of Circle: ");                    double rad=dsc.nextDouble();                    APCircle aAPCircle = new APCircle(rad);                    System.out.println("Area: "+ aAPCircle.getArea()+"\nPerimeter: "+ aAPCircle.getPerimeter());                    break;                case 2:                    System.out.println("Enter Length of Rectangle: ");                    double len=dsc.nextDouble();                    System.out.println("Enter Breadth of Rectangle: ");                    double brd=dsc.nextDouble();                    APRectangle rectangle = new APRectangle(len,brd);                    System.out.println("Area: "+rectangle.getArea()+"\nPerimeter: "+rectangle.getPerimeter());                    break;                case 3:                    System.out.println("Enter a side of Square: ");                    double side=dsc.nextDouble();                    APSquare sqr=new APSquare(side);                    System.out.println("Area: "+sqr.getArea()+"\nPerimeter: "+sqr.getPerimeter());                    break;                case 4:                    System.out.println("Enter Height of Rightangle: ");                    double height=dsc.nextDouble();                    System.out.println("Enter Base of Rightangle: ");                    double base=dsc.nextDouble();                    APRightAngle rightAngle=new APRightAngle(height, base);                    System.out.println("Area: "+rightAngle.getArea()+"\nPerimeter: "+rightAngle.getPerimeter());                    break;                case 5:                    break;                default:                    System.out.println("Invalid choice! Please Enter again.");            }        }    }}
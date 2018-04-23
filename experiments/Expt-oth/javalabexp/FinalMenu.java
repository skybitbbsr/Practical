package javalabexp;

import java.util.Scanner;
public class FinalMenu {
	Rectangle r=new Rectangle(5,8);
    Square s=new Square(4.5f);
    Triangle t=new Triangle(4,5);
   
    public char display(){
        System.out.println("Press 'a' for Rectangle");
        System.out.println("Press 'b' for Squre");
        System.out.println("Press 'c' for Circle");
        System.out.println("Press 'd' for Triangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        char p=sc.next().charAt(0);
        return p;
    
    }
    public int choice(){
        System.out.println("choose '1'for area");
        System.out.println("Choose '2' for perimeter");
        Scanner sc=new Scanner(System.in);
        System.out.println("Again enter your choice");
        int i=sc.nextInt();
        return i;
    }
    public void process() {
        switch(display()){
            case 'a':if(choice()==1)
                System.out.println("area of the rectangle is"+r.area());
                else
                System.out.println("perimeter of the rectangle is "+r.perimeter());
                break;
            case 'b':if(choice()==1)
                    System.out.println("area of the square is"+s.area());
                    else
                    System.out.println("perimeter of the square is "+s.perimeter());
                    break;
            case 'c':if(choice()==1)
                        System.out.println("area of the circle is"+r.area());
                        else
                        System.out.println("perimeter of the rectangle is "+r.perimeter());
                        break;
            case 'd':if(choice()==1)
                            System.out.println("area of the rectangle is"+r.area());
                            else
                            System.out.println("perimeter of the rectangle is "+r.perimeter());
                            break;
            }
        }
    }





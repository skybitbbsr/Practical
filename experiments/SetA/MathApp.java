import java.util.Scanner;
public class MathApp 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=4)
        {
            System.out.println("Choose your option\n 1.Addition of Integers\t\t2.Addition of Double\t3.Addition of String\t\t4.Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the 1st Integer:");
                    int num1=sc.nextInt();
                    System.out.println("Enter the 2nd Integer:");
                    int num2=sc.nextInt();
                    System.out.println("The Addition of the Integer numbers is "+SimpleMath.addition(num1,num2));
                    break;
                case 2:
                    System.out.println("Enter the 1st Floating number:");
                    double num3=sc.nextDouble();
                    System.out.println("Enter the 2nd Floating number:");
                    double num4=sc.nextDouble();
                    System.out.println("The Addition of the Integer numbers is "+SimpleMath.addition(num3,num4));
                    break;
                case 3:
                    System.out.println("Enter the 1st String:");
                    String str1=sc.next();
                    System.out.println("Enter the 2nd String:");
                    String str2=sc.next();
                    System.out.println("The Addition of the Integer numbers is "+SimpleMath.addition(str1,str2));
                    break;
                case 4:
                    System.out.println("Thank you.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Entry.");
                    continue;
            }
        }
    }
    
}

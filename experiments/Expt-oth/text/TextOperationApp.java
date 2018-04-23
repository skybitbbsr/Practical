package text;
import java.util.Scanner;

public class TextOperationApp {

	public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        Scanner ip2 = new Scanner(System.in);
        System.out.println("Enter text to perform operation:");
        String text = ip.nextLine();
        
        Text t = new Text(text);
        int ch=0;
        while (ch !=5) {
            System.out.println("Text is:" + t.getText());

            System.out.println("\n1.Count No. of Words\n2.Search a substring\n3.Check for palindrime\n4.Modify Text\n5.Exit");
            System.out.println("Enter Your Choice:");
             ch = ip2.nextInt();
            switch (ch) {
                case 1:
                    t.countWord();
                    break;
                case 2:
                    System.out.println("Enter string to search in the given string:");
                    String subString = ip.nextLine();
                    t.stringSearch(subString);
                    break;
                case 3:
                    t.checkPalindrome();
                    break;
                case 4:
                    System.out.println("Enter the new text:");
                    String newtext = ip.nextLine();
                    t.setText(newtext);
                    break;
                case 5:System.out.println("Exiting.....");
                          break;
                default:
                    System.out.println("Invalid Choice(1-4).....");

            }
            
        }
    }

}

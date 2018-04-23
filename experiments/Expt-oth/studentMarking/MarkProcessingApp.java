
	package studentMarking;

	import java.util.Scanner;

	public class MarkProcessingApp {
		public static void main(String[] args) {

			int numberOfSubjects;
			String subjArray[] = null;
			double subjMarks[] = null;
			String stuName = null;
			String regNo = null;
			int semester = 0;
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Name of the student: ");
			stuName = sc.nextLine();

			System.out.println("Enter the registration number: ");
			regNo = sc.nextLine();

	System.out.println("Enter number of Subjects you have in your semester: ");
			numberOfSubjects = sc.nextInt();
			subjArray = new String[numberOfSubjects];
			subjMarks = new double[numberOfSubjects];
			sc.nextLine();
			
			for (int i = 0; i < subjArray.length; i++) {
				System.out.print("Enter Subject "+(i+1)+":");
				subjArray[i] = sc.nextLine();
				System.out.print("Enter Secured Mark: ");
				subjMarks[i] = sc.nextDouble();
				sc.nextLine();
			}
			Student myStudent = new Student(stuName, regNo, semester, subjArray, subjMarks);

			System.out.println(myStudent);
			sc.close();
		}
	}



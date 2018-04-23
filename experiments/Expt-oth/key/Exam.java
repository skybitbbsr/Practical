package key;

import java.util.Scanner;

public class Exam {
	 static void getInput(char studentAnsgrid[][], int noOfQuestions, int noOfStudents, Scanner scan) {

		for (int i = 0; i < studentAnsgrid.length; i++) {
System.out.println("Enter Answers of Student No " + (i + 1) + ":");
			for (int j = 0; j < studentAnsgrid[0].length; j++) {
				studentAnsgrid[i][j] = scan.next().charAt(0);
			}
		}

	}

	

      static void getKeyAnswer(char keyAnswer[], int numberOfQues, Scanner scan) {

	for (int i = 0; i < numberOfQues; i++) {
		System.out.println("Enter Answer of " + (i + 1) + ":");
		keyAnswer[i] = scan.next().charAt(0);
	}

}
      

}

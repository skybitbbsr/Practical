package key;
import java.util.Scanner;
public class ExamResult {
	

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of Students: ");
			int studentNum = scan.nextInt();
			System.out.println("Enter number of Questions: ");
			int numberOfQues = scan.nextInt();

			char[][] studentAnsgrid = new char[studentNum][numberOfQues];

			char keyAnswer[] = new char[numberOfQues];
			Exam a=new Exam();

			a.getInput(studentAnsgrid, numberOfQues, studentNum, scan);
			a.getKeyAnswer(keyAnswer, numberOfQues, scan);

			int scores[] = getScore(studentAnsgrid, keyAnswer);

			for (int i = 0; i < scores.length; i++) {

	System.out.println("The Score of No " + (i + 1) + " student is :" + scores[i]);
			}

	} 	
		

private static int[] getScore(char[][] studentAnsGrid, char[] keyAnswer) {
		int score[] = new int[studentAnsGrid.length];
		int count = 0;

		for (int i = 0; i < studentAnsGrid.length; i++) {

			for (int j = 0; j < studentAnsGrid[0].length; j++) {

				if (studentAnsGrid[i][j] == keyAnswer[j]) {
					count++;
				}

			}
			score[i] = count;
			count = 0;
		}

		return score;
	}
}







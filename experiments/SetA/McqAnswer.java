public class McqAnswer {
    private char answerKey[] = new char[]{'c', 'a', 'd', 'a'};
    private char answer[][];
    private int studentNo;

    public McqAnswer(char[][] answer, int studentNo) {
        this.answer = answer;
        this.studentNo = studentNo;
    }
    public void getScore() {
        int correct = 0, incorrect = 0;
        for (int i = 0; i < studentNo; i++) {

            for (int j = 0; j < 4; j++) {
                if (answer[i][j] == answerKey[j])
                    correct++;
                else
                    incorrect++;
            }
            System.out.println("Correct Answers of Student "+(i+1)+" =" + correct);
            System.out.println("Incorrect Answers of Student "+(i+1)+" =" + incorrect);
            correct = 0;
            incorrect = 0;
        }
    }
}

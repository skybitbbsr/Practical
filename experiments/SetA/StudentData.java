public class StudentData {    private String studentName, studentID;    private Score score[];    public StudentData(String studentName, String studentID, int subjectNo) {        score = new Score[subjectNo];        this.studentName = studentName;        this.studentID = studentID;    }    public String getStudentName() {        return studentName;    }    public String getStudentID() {        return studentID;    }}
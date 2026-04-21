public class P4Q2Student {

    private String studentID;
    private String studentName;
    private int numberOfQuizzes=0;
    private int totalQuizScore=0;
    private static int contributionOfQuizzes;

    public P4Q2Student() {
        this(" "," ");
    }
    public P4Q2Student(String studentID,String studentName){
        setStudentID(studentID);
        setStudentName(studentName);
    }
    //Setter
    public void setStudentID(String studentID){
        this.studentID=studentID;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public int getNumberOfQuizzes(){
        return this.numberOfQuizzes;
    }

    //Add Quiz
    public void addQuiz(int score){
        this.numberOfQuizzes++;
        this.totalQuizScore+=score;
    }
    public int getTotalScore(){
        return this.totalQuizScore;
    }
    public double  getAverageScore(){
        if(this.totalQuizScore==0){
            return 0.0;
        }
        else{
            return (double)this.totalQuizScore/(double)this.numberOfQuizzes;
        }
    }
}
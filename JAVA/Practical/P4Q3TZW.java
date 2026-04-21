class P4Q3Student{

    private String studentID;
    private String studentName;
    private int numberOfQuizzes=0;
    private int totalQuizScore=0;
    private static double contributionOfQuizzes;

    public P4Q3Student() {
        this(" "," ");
    }
    public P4Q3Student(String studentID,String studentName){
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
    public double getAverageScore(){
        if(this.totalQuizScore==0){
            return 0.0;
        }
        else{
            return (double)this.totalQuizScore/(double)this.numberOfQuizzes;
        }
    }
    public static void setContributionOfQuizzes(double contributionOfQuizzes){
        P4Q3Student.contributionOfQuizzes=contributionOfQuizzes;
    }
    public static double getContributionOfQuizzes(){
        return P4Q3Student.contributionOfQuizzes;
    }

    //Main
    public static void main(String[] args) {
        P4Q3Student zinwei=new P4Q3Student("19WMD06432","TAN ZIN WEI");
        P4Q3Student ali=new P4Q3Student( );
        P4Q3Student abu=new P4Q3Student("10ASD67890","Abu");
        //Setter Static Variable
        setContributionOfQuizzes(0.2);

        //Student zinwei
        zinwei.addQuiz(7);
        zinwei.addQuiz(8);
        System.out.println("Student ID                             : "+zinwei.getStudentID());
        System.out.println("Student Name                      : "+zinwei.getStudentName());
        System.out.println("Number Of Quizees Taken  : "+zinwei.getNumberOfQuizzes());
        System.out.println("Total Score                           : "+zinwei.getTotalScore());
        System.out.println("Avergae Score                      : "+zinwei.getAverageScore());
        System.out.println("Quiz Mark                             : "+zinwei.getTotalScore()*P4Q3Student.getContributionOfQuizzes());

        //Student ali
        ali.setStudentID("20WMD12345");
        ali.setStudentName("Ali");
        ali.addQuiz(7);
        ali.addQuiz(8);
        ali.addQuiz(9);
        System.out.println("\nStudent ID                             : "+ali.getStudentID());
        System.out.println("Student Name                      : "+ali.getStudentName());
        System.out.println("Number Of Quizees Taken  : "+ali.getNumberOfQuizzes());
        System.out.println("Total Score                           : "+ali.getTotalScore());
        System.out.println("Avergae Score                      : "+ali.getAverageScore());
        System.out.println("Quiz Mark                              : "+ali.getAverageScore()*P4Q3Student.getContributionOfQuizzes());

        //Student abu
        //Add Score
        abu.addQuiz(0);
        System.out.println("\nStudent ID                             : "+abu.getStudentID());
        System.out.println("Student Name                      : "+abu.getStudentName());
        System.out.println("Number Of Quizees Taken  : "+abu.getNumberOfQuizzes());
        System.out.println("Total Score                           : "+abu.getTotalScore());
        System.out.println("Avergae Score                      : "+abu.getAverageScore());
        System.out.println("Quiz Mark                              : "+abu.getAverageScore()*P4Q3Student.getContributionOfQuizzes());
    }
}
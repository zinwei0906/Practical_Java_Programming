public class P4Q2TZW {

    public static void main(String[] args) {
        P4Q2Student zinwei=new P4Q2Student("19WMD06432","TAN ZIN WEI");
        P4Q2Student ali=new P4Q2Student( );
        P4Q2Student abu=new P4Q2Student("10ASD67890","Abu");

        //Student zinwei
        System.out.println("Student ID                             : "+zinwei.getStudentID());
        System.out.println("Student Name                      : "+zinwei.getStudentName());
        //Add Score
        zinwei.addQuiz(8);
        zinwei.addQuiz(7);
        System.out.println("Number Of Quizees Taken  : "+zinwei.getNumberOfQuizzes());
        System.out.println("Total Score                           : "+zinwei.getTotalScore());
        System.out.println("Avergae Score                      : "+zinwei.getAverageScore());


        //Student ali
        ali.setStudentID("20WMD12345");
        ali.setStudentName("Ali");
        System.out.println("\nStudent ID                             : "+ali.getStudentID());
        System.out.println("Student Name                      : "+ali.getStudentName());
        //Add Score
        ali.addQuiz(9);
        ali.addQuiz(8);
        ali.addQuiz(10);
        System.out.println("Number Of Quizees Taken  : "+ali.getNumberOfQuizzes());
        System.out.println("Total Score                           : "+ali.getTotalScore());
        System.out.println("Avergae Score                      : "+ali.getAverageScore());


        //Student abu
        System.out.println("\nStudent ID                             : "+abu.getStudentID());
        System.out.println("Student Name                      : "+abu.getStudentName());
        abu.addQuiz(0);
        System.out.println("Number Of Quizees Taken  : "+abu.getNumberOfQuizzes());
        System.out.println("Total Score                           : "+abu.getTotalScore());
        System.out.println("Avergae Score                      : "+abu.getAverageScore());
    }
}
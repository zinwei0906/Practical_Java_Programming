//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class P4Q1Course {

    private String courseTtile;
    private double feePerStudent;
    private int noOfStudent;
    private String [] studentName = new String[100];
    private static int courseCount;

    public P4Q1Course() {
        this("",0.0);
        courseCount++;
    }

    public P4Q1Course(String courseTtile,double feePerStudent) {
        setCourseTitle(courseTtile);
        setFeePerStudent(feePerStudent);
        courseCount++;
    }

    //Setters
    public void setCourseTitle(String courseTtile){
        this.courseTtile=courseTtile;
    }
    public void setFeePerStudent(double feePerStudent){
        this.feePerStudent=feePerStudent;
    }

    //Getters
    public String getCourseTtile(){
        return this.courseTtile;
    }
    public double getFeePerStudent(){
        return this.feePerStudent;
    }
    public int getNoOfStudent(){
        return this.noOfStudent;
    }
    public String[ ] getStudentName(){
        return studentName ;
    }

    public double calcFeesCollected(){
        return feePerStudent*noOfStudent;
    }

    public void addStudent(String studName){
        studentName[noOfStudent]=studName;
        noOfStudent++;
    }

    public String toString(){
        return "\n\tCourse Title : "+courseTtile+"\n\tFees per student : RM "+feePerStudent+
            "\n\tNumber of Student registered =  "+noOfStudent+"\n\tTotal Fees Collected =  RM "+calcFeesCollected()+
                "\n\tName of Student ";
    }
}
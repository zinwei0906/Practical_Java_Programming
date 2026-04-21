//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

import java.util.Scanner;
public class P4Q1TZW {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        P4Q1Course course1=new P4Q1Course("Introduction to Computers",250);
        System.out.println("\tCourse Ttile : "+course1.getCourseTtile());
        System.out.println("\tFees Per Student : RM"+course1.getFeePerStudent());
        System.out.println("\tEnter the student name who have enrolled for the course");
        String StudentName;
        int NumberStudent=1;
        do{
            System.out.print("\tStudent "+NumberStudent +" (Enter XXX to stop)  : ");
            StudentName=scanner.nextLine();
            if(!StudentName.equals("XXX")){
                course1.addStudent(StudentName);
            }
            NumberStudent++;
        }while(!StudentName.equals("XXX"));

        //Display Student Result
        System.out.println(course1);
        String[ ] student=course1.getStudentName();
        int numberstudent=course1.getNoOfStudent();
        for(int number=0;number<numberstudent;number++){
            System.out.println("\t "+(number+1)+" . "+student[number]);
        }
    }
}

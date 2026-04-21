//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI
class Student{
        private String studentID;
        private String name;
        private String faculty;

        public Student(){
            this("","","");
        }
        public Student(String studentID,String name,String faculty){
            this.studentID=studentID;
            this.name=name;
            this.faculty=faculty;
        }
        public static boolean validateStudentID(Student student){
            System.out.print("Student ID  : "+student.studentID+"\nStudent Name : "+student.name+"\nFaculty  : "+student.faculty+"\nThe Student ID ");
            if(student.studentID.length()<6){
                return false;
            }
            else{
                if(student.faculty.equals("FOCS")&&student.studentID.charAt(0)=='A'){
                    return true;
                }
                else if(student.faculty.equals("FAFB")&&student.studentID.charAt(0)=='B'){
                    return true;
                }
                else if(student.faculty.equals("FOET")&&student.studentID.charAt(0)=='C'){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
}

public class P5Q2TZW {
    public static void main(String[] args) {
        Student student[]=new Student[7];
        student[0]=new Student("A11111","TAN ZIN WEI","FOCS");
        student[1]=new Student("B22222","WONG WEN LIN","FAFB");
        student[2]=new Student("C33333","TEE CHEN YONG","FOET");
        student[3]=new Student("C12345","WONG YONG YEE","FOCS");
        student[4]=new Student("B6789","ENG LIN SHENG","FAFB");
        student[5]=new Student("123","KELVIN WONG","FOCS");
        student[6]=new Student("12345B","ONG YIN YONG","FAFB");

        for(int number=0;number<7;number++){
            if(Student.validateStudentID(student[number])){
                System.out.println(" is Valid Student ID!\n");
            }
            else{
                System.out.println(" is Invalid Student ID!!!\n");
            }
        }
    }
}
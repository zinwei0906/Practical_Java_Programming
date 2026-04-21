package control;

import da.StudentDA;
import domain.Student;

public class MaintainStudentControl {

    private StudentDA studDA;

    public MaintainStudentControl() {
        studDA = new StudentDA();
    }

    public Student selectRecord(String id) {
        return studDA.getRecord(id);
    }

    public void insertRecord(Student stud) {
        studDA.storeRecord(stud);
    }

    public void updateRecord(Student stud) {
        studDA.editRecord(stud);
    }

    public void deleteRecord(String id) {
        studDA.removeRecord(id);
    }

    public void listRecord() {
        studDA.readRecord();
    }
}

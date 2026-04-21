package control;

import da.ProgrammeDA;
import domain.Programme;

public class MaintainProgrammeControl {

    private ProgrammeDA progDA;

    public MaintainProgrammeControl() {
        progDA = new ProgrammeDA();
    }

    public Programme selectRecord(String code) {
        return progDA.getRecord(code);
    }

    public void insertRecord(Programme prog) {
        progDA.storeRecord(prog);
    }

    public void updateRecord(Programme prog) {
        progDA.editRecord(prog);
    }

    public void deleteRecord(String code) {
        progDA.removeRecord(code);
    }

    public void listRecord() {
        progDA.readRecord();
    }
}

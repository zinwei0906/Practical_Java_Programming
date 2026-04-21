package Q4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

//Name : Tee Ka Seng
//Student ID : 19WMD10728
public class Example1 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException exception) {
            JOptionPane.showMessageDialog(null, "File Not Found : "+exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Cant Read File : "+exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Error : "+exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}

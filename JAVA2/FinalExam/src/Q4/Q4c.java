package Q4;
//Name : Tee Ka Seng
//Student ID : 19WMD10728

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class Q4c {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>File Not Found<br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, ErrorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>Cant Read File<br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, ErrorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>Error<br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, ErrorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            int arr[] = {0, 1, 2, 3, 4};
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>Index Number out of the Array : <br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, ErrorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>Error : <br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, ErrorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

}

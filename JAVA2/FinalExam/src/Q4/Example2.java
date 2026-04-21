package Q4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

//Name : Tee Ka Seng
//Student ID : 19WMD10728
public class Example2 {

    public static void main(String[] args) {
        try {
            int arr[] = {0, 1, 2, 3, 4};
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>Index Number out of the Array : <br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, "Index Number out of the Array : " + exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception exception) {
            String ErrorMessage = "<html><h3 style='color:red;'>Error : <br/>" + exception.getMessage() + "</h3></html>";
            JOptionPane.showMessageDialog(null, "Error : " + exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
}


package Q1;

//Name : Tee Ka Seng
//Student ID : 19WMD10728
import javax.swing.JOptionPane;

public class Q1c {

    public static void main(String[] args) {
        double meters = 0.00;
        double centimeters = 0.00;
        do {
            String meter = JOptionPane.showInputDialog("Enter a measurement in meters");
            try {
                meters = Double.parseDouble(meter);
                centimeters = meters * 100;
                JOptionPane.showMessageDialog(null, "Meters converted to Centimeters : " + centimeters, "Message", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Enter another measurement (Meters)?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION);
    }

}

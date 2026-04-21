package practical1;

import javax.swing.*;

public class P1Q1 {

    public static void main(String[] args) {
        do {

            String input = JOptionPane.showInputDialog("Enter The Fahrenheit temperature ");
//            double Fahrenheit = Double.parseDouble(input);
            int Fahrenheit = Integer.parseInt(input);

            double Celsius = ((double) Fahrenheit - 32) * 5 / 9;

            String message = String.format("The  Celsius is %.3f", Celsius);

            JOptionPane.showMessageDialog(null, message);

        } while (JOptionPane.showConfirmDialog(null, "Enter Another Fahrenheit temperature?",
                "Another", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

//        int dialogButton = JOptionPane.YES_NO_OPTION;
//        while (dialogButton == JOptionPane.YES_OPTION) {
//
//            String input = JOptionPane.showInputDialog("Enter The Fahrenheit temperature ");
//
//            double Fahrenheit = Double.parseDouble(input);
//
//            double Celsius = (Fahrenheit - 32) * 5 / 9;
//
//            String message = String.format("The  Celsius is %.3f", Celsius);
//
//            JOptionPane.showMessageDialog(null, message);
//            dialogButton = JOptionPane.showConfirmDialog(null, "Enter Another Fahrenheit temperature?", "Another", 
//                    JOptionPane.YES_NO_OPTION);
//
//        }
    }
}

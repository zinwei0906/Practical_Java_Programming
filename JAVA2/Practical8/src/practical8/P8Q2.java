/**
 *
 * @author Wei
 */
package practical8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P8Q2 extends JFrame {

    private JTextField jtfRate = new JTextField();
    private JTextField jtfYear = new JTextField();
    private JTextField jtfAmount = new JTextField();
    private JTextField jtfMonthlyPayment = new JTextField();
    private JTextField jtfTotalPayment = new JTextField();
    private JButton jbtCompute = new JButton("Compute Payment");

    public P8Q2() {
        Font font = new Font("TimesRoman", Font.BOLD, 20);
        //Create one Jpanel is Grid Layout (5,2)
        JPanel p1 = new JPanel(new GridLayout(5, 2));
        p1.add(new JLabel("Amount Interest Rate")).setFont(font);
        p1.add(jtfRate).setFont(font);
        p1.add(new JLabel("Number of Years")).setFont(font);
        p1.add(jtfYear).setFont(font);
        p1.add(new JLabel("Loan Amount")).setFont(font);
        p1.add(jtfAmount).setFont(font);
        p1.add(new JLabel("Monthly Payment")).setFont(font);
        p1.add(jtfMonthlyPayment).setFont(font);
        p1.add(new JLabel("Total Payment")).setFont(font);
        p1.add(jtfTotalPayment).setFont(font);
        p1.setBorder(BorderFactory.createTitledBorder("Enter loan amount, interest rate, and years"));
        //Create one Jpanel is Flow Layout is Right
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(jbtCompute).setFont(font);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        jbtCompute.addActionListener(new ComputeListener());

        setTitle("Loan Calculator");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ComputeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double rate = Double.parseDouble(jtfRate.getText());
                int year = Integer.parseInt(jtfYear.getText());
                double amount = Double.parseDouble(jtfAmount.getText());
                Loan loan = new Loan(rate, year, amount);

                jtfMonthlyPayment.setText("" + loan.getMonthlyPayment());
                jtfTotalPayment.setText("" + loan.getTotalPayment());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Empty Value Or Invalid Value", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        P8Q2 frame = new P8Q2();
        
    }

}

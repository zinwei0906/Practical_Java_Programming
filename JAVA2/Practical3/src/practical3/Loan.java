package practical3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loan extends JFrame {

    class CalculatorClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double number1 = Double.parseDouble(LoanAmount.getText());
                double number2 = Double.parseDouble(InterestRate.getText());
                int number3 = Integer.parseInt(NumberofYear.getText());

                if (number1 <= 0 || number2 <= 0 || number3 <= 0) {
                    throw new IllegalArgumentException("Value must be non-negative and 0");
                }
                Loan loan1 = new Loan(number2, number3, number1);
                MonthlyPayment.setText(String.format("%.2f", loan1.getMonthlyPayment()));
                TotalPayment.setText(String.format("%.2f", loan1.getTotalPayment()));
                LoanDate.setText("'" + loan1.getLoanDate());

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Value must be non-negative and 0", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    private JTextField LoanAmount = new JTextField(10);
    private JTextField InterestRate = new JTextField(10);
    private JTextField NumberofYear = new JTextField(10);
    private JTextField MonthlyPayment = new JTextField(10);
    private JTextField TotalPayment = new JTextField(10);
    private JTextField LoanDate = new JTextField(10);
    private JButton Submit = new JButton("Submit");

    public Loan() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2));
        p1.add(new JLabel("Loan Amount "));
        p1.add(LoanAmount);
        p1.add(new JLabel("Interest Rate "));
        p1.add(InterestRate);
        p1.add(new JLabel("Number of Year"));
        p1.add(NumberofYear);
        p1.add(new JLabel("Monthly Payment "));
        p1.add(MonthlyPayment);
        p1.add(new JLabel("Total Payment "));
        p1.add(TotalPayment);
        p1.add(new JLabel("Loan Date "));
        p1.add(LoanDate);
//        LoanDate.setColumns(ALLBITS);
        LoanAmount.setFont(new Font("Arial", Font.BOLD, 20));
        InterestRate.setFont(new Font("Arial", Font.BOLD, 20));
        NumberofYear.setFont(new Font("Arial", Font.BOLD, 20));
        MonthlyPayment.setFont(new Font("Arial", Font.BOLD, 20));
        TotalPayment.setFont(new Font("Arial", Font.BOLD, 20));
        LoanDate.setFont(new Font("Arial", Font.BOLD, 20));
        add(p1, BorderLayout.CENTER);
        

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 1));
        p2.add(Submit);
        add(p2, BorderLayout.SOUTH);

        Submit.addActionListener(new CalculatorClass());
        setTitle("Loan");
        setSize(800,400);
//        pack();
        MonthlyPayment.setEditable(false);
        TotalPayment.setEditable(false);
        LoanDate.setEditable(false);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Find monthly payment
     */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    }

    /**
     * Find total payment
     */
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    /**
     * Return loan date
     */
    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public static void main(String[] args) {

        new Loan();
    }
}

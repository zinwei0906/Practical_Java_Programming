package practical2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P2Q4 extends JFrame {

    class CalculatorClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(FirstNumber.getText());
            double number2 = Double.parseDouble(SecondNumber.getText());
            double result = 0;

            if (e.getSource() == Add) {
                result = number1 + number2;
            } else if (e.getSource() == Subtract) {
                result = number1 - number2;

            } else if (e.getSource() == Multiply) {
                result = number1 * number2;

            } else if (e.getSource() == Divide) {
                result = number2 / number1;

            }
            Result.setText("" + result);
        }
    }
    private JButton Add = new JButton("Add");
    private JButton Subtract = new JButton("Subtract");
    private JButton Multiply = new JButton("Multiply");
    private JButton Divide = new JButton("Divide");
    private JTextField FirstNumber = new JTextField(10);
    private JTextField SecondNumber = new JTextField(10);
    private JTextField Result = new JTextField(10);

    public P2Q4() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));
        p1.add(new JLabel("First Number "));
        p1.add(FirstNumber);
        p1.add(new JLabel("Second Number "));
        p1.add(SecondNumber);
        p1.add(new JLabel("Result "));
        p1.add(Result);
        add(p1, BorderLayout.NORTH);

        //Add the four buttons
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.add(Add);
        p2.add(Subtract);
        p2.add(Multiply);
        p2.add(Divide);
        add(p2, BorderLayout.CENTER);
        Add.setMnemonic('A');
        Add.setFont(new Font("Arial", Font.BOLD, 20));
        Subtract.setMnemonic('S');
        Subtract.setFont(new Font("Arial", Font.BOLD, 20));
        Multiply.setMnemonic('M');
        Multiply.setFont(new Font("Arial", Font.BOLD, 20));
        Divide.setMnemonic('D');
        Divide.setFont(new Font("Arial", Font.BOLD, 20));

        Add.addActionListener(new CalculatorClass());
        Subtract.addActionListener(new CalculatorClass());
        Multiply.addActionListener(new CalculatorClass());
        Divide.addActionListener(new CalculatorClass());
        setTitle("Simple Calculator");
        pack();
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the Result Text Field Cant Be Edit
        Result.setEditable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P2Q4();
    }

}

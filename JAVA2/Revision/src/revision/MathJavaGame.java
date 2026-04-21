package revision;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MathJavaGame extends JFrame {

    class CalculatorClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double number1 = Double.parseDouble(FirstNumber.getText());
                double number2 = Double.parseDouble(SecondNumber.getText());
                double result = 0;
                String correctMessage = "";

                if (jrbAdd.isSelected()) {
                    ShowMessage.setText(number1 + " + " + number2 + " = ? ");
                    result = number1 + number2;
                    correctMessage = number1 + " + " + number2 + " = " + result;
                } else if (jrbSubtract.isSelected()) {
                    ShowMessage.setText(number1 + " - " + number2 + " = ? ");
                    result = number1 - number2;
                    correctMessage = number1 + " - " + number2 + " = " + result;
                } else if (jrbMultiply.isSelected()) {
                    ShowMessage.setText(number1 + " * " + number2 + " = ? ");
                    result = number1 * number2;
                    correctMessage = number1 + " * " + number2 + " = " + result;
                } else if (jrbDivide.isSelected()) {
                    ShowMessage.setText(number1 + " / " + number2 + " = ? ");
                    result = number1 / number2;
                    correctMessage = number1 + " / " + number2 + " = " + result;
                }

                if (e.getSource() == CheckAnswer) {
                    double answer = Double.parseDouble(Answer.getText());
                    if (answer == result) {
                        JOptionPane.showMessageDialog(null, "Correct :" + correctMessage, "Correct", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong. Please Try Again", "Wrong", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (e.getSource() == Exit) {
                    setVisible(false);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private ButtonGroup bgMath = new ButtonGroup();
    private JRadioButton jrbAdd = new JRadioButton("Add");
    private JRadioButton jrbSubtract = new JRadioButton("Subtract");
    private JRadioButton jrbMultiply = new JRadioButton("Multiply");
    private JRadioButton jrbDivide = new JRadioButton("Divide");

    private JTextField FirstNumber = new JTextField();
    private JTextField SecondNumber = new JTextField();
    private JLabel ShowMessage = new JLabel("Answer");
    private JTextField Answer = new JTextField();

    private JButton CheckAnswer = new JButton("Check Answer");
    private JButton Exit = new JButton("Exit");

    public MathJavaGame() {
        Font font = new Font("Arial", Font.BOLD, 20);
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        p1.add(new JLabel("First Number ")).setFont(font);
        p1.add(FirstNumber).setFont(font);
        p1.add(new JLabel("Second Number ")).setFont(font);
        p1.add(SecondNumber).setFont(font);
        p1.add(ShowMessage).setFont(font);
        p1.add(Answer).setFont(font);
        add(p1, BorderLayout.NORTH);

        //Add the four radio buuton
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.add(jrbAdd).setFont(font);
        p2.add(jrbSubtract).setFont(font);
        p2.add(jrbMultiply).setFont(font);
        p2.add(jrbDivide).setFont(font);
        jrbAdd.setMnemonic('A');
        jrbSubtract.setMnemonic('S');
        jrbMultiply.setMnemonic('M');
        jrbDivide.setMnemonic('D');
        bgMath.add(jrbAdd);
        bgMath.add(jrbSubtract);
        bgMath.add(jrbMultiply);
        bgMath.add(jrbDivide);
        add(p2, BorderLayout.CENTER);

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.add(CheckAnswer).setFont(font);
        p3.add(Exit).setFont(font);
        add(p3, BorderLayout.SOUTH);

        jrbAdd.addActionListener(new CalculatorClass());
        jrbSubtract.addActionListener(new CalculatorClass());
        jrbMultiply.addActionListener(new CalculatorClass());
        jrbDivide.addActionListener(new CalculatorClass());
        CheckAnswer.addActionListener(new CalculatorClass());
        Exit.addActionListener(new CalculatorClass());
        setTitle("Math Game");
        pack();
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the Result Text Field Cant Be Edit
        setVisible(true);
    }

    public static void main(String[] args) {
        new MathJavaGame();
    }

}

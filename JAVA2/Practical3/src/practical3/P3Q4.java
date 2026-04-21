package practical3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P3Q4 extends JFrame {

    class Submit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String pw = Password.getText();
            try {
                new Password(pw);
                String CorrectMessage = "\n\nCongratulation! Your password is Valid.";
                ErrorOrCorrectMessage.setText(CorrectMessage);
                ErrorOrCorrectMessage.setForeground(Color.BLUE);
                ErrorOrCorrectMessage.setFont(new Font("Arial", Font.BOLD, 22));

            } catch (InvalidPasswordException ex) {
                ErrorOrCorrectMessage.setText(ex.getMessage());
                ErrorOrCorrectMessage.setForeground(Color.RED);
                ErrorOrCorrectMessage.setFont(new Font("Arial", Font.BOLD, 16));
            }
        }
    }
    private JLabel Message = new JLabel(" Enter your password     ");
    private JTextField Password = new JTextField(10);
    private JButton Submit = new JButton("Submit");
    private JTextArea ErrorOrCorrectMessage = new JTextArea();

    public P3Q4() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));
        p1.add(Message);
        p1.add(Password);
        p1.add(new JLabel(" "));
        p1.add(Submit);
        Message.setFont(new Font("Arial", Font.BOLD, 20));
        Password.setFont(new Font("Arial", Font.BOLD, 20));
        Submit.setFont(new Font("Arial", Font.BOLD, 20));
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 1));
        p2.add(ErrorOrCorrectMessage);
        add(p2, BorderLayout.CENTER);

        Submit.addActionListener(new Submit());
        setTitle("Set Password");
        setSize(600, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }

    public static void main(String[] args) {
        new P3Q4();
    }
}

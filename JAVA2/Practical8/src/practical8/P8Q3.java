/**
 *
 * @author Wei
 */
package practical8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P8Q3 extends JFrame {

    private JTextField jtfUserName = new JTextField();
    private JPasswordField jtfPassword = new JPasswordField();
    private JButton jbtLogin = new JButton("Login");
    private JButton jbtReset = new JButton("Reset");

    public P8Q3() {
        Font font = new Font("TimesRoman", Font.BOLD, 20);
        //Create one Jpanel is Grid Layout (5,2)
        JPanel p1 = new JPanel(new GridLayout(2, 2));
        p1.add(new JLabel("User Name")).setFont(font);
        p1.add(jtfUserName).setFont(font);
        p1.add(new JLabel("Password")).setFont(font);
        p1.add(jtfPassword).setFont(font);
        //Set password show is *
        jtfPassword.setEchoChar('*');

        p1.setBorder(BorderFactory.createTitledBorder("Login Information"));
        //Create one Jpanel is Flow Layout is Right
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(jbtLogin).setFont(font);
        p2.add(jbtReset).setFont(font);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        jbtLogin.addActionListener(new LoginListener());
        jbtReset.addActionListener(new LoginListener());

    }

    private class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == jbtLogin) {
                    String name = jtfUserName.getText();
                    String password = jtfPassword.getText();
                    if (name.equals("user") && password.equals("user")) {
                        JOptionPane.showMessageDialog(null, "Login Succefully", "Succeful", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        new P8Q2().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password", "Login Fail", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (e.getSource() == jbtReset) {
                    jtfUserName.setText("");
                    jtfPassword.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Value cant null and empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        P8Q3 frame = new P8Q3();
        frame.setTitle("Login");
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

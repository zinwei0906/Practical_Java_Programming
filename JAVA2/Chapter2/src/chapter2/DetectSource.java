package chapter2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DetectSource extends JFrame {

    private JButton jbtOK = new JButton("OK");
    private JButton jbtCancel = new JButton("Cancel");

    public DetectSource() {
        setLayout(new FlowLayout());
        add(jbtOK);
        add(jbtCancel);
        jbtOK.addActionListener(new ButtonListenerClass());
        jbtCancel.addActionListener(new ButtonListenerClass());
    }

    private class ButtonListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtOK) {
                JOptionPane.showMessageDialog(null, "OK button clicked");
            } else if (e.getSource() == jbtCancel) {
                JOptionPane.showMessageDialog(null, "Cancel button clicked.");
            }
        }
    }

    public static void main(String[] args) {
        DetectSource frame = new DetectSource();
        frame.setTitle("DetectSource");
        frame.setSize(250, 100);
        frame.setLocation(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package chapter2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MultipleListeners1 extends JFrame {

    private JButton jbtOK = new JButton("OK");
    private JButton jbtCancel = new JButton("Cancel");
    private int countOKs = 0;
    private int countCancels = 0;

    public MultipleListeners1() {
        setLayout(new FlowLayout());
        add(jbtOK);
        add(jbtCancel);
        jbtOK.addActionListener(new ButtonListenerClass());
        jbtCancel.addActionListener(new ButtonListenerClass());
    }

    private class ButtonListenerClass implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtOK) {
                countOKs++;
                JOptionPane.showMessageDialog(null, "OK button clicked total of " + countOKs + " times.");
            } else if (e.getSource() == jbtCancel) {
                countCancels++;
                JOptionPane.showMessageDialog(null, "Cancel button clicked total of " + countCancels + " times.");
            }
        }
    }

    public static void main(String[] args) {
        MultipleListeners1 frame = new MultipleListeners1();
        frame.setTitle("MultipleListeners ");
        frame.setSize(250, 100);
        frame.setLocation(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

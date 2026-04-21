package chapter2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class OKListenerClass implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "OK button clicked");
    }
}

class CancelListenerClass implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Cancel button clicked.");

    }
}

public class HandleEvent extends JFrame {

    private JButton jbtOK = new JButton("OK");
    private JButton jbtCancel = new JButton("Cancel");

    public HandleEvent() {
        setLayout(new FlowLayout());
        add(jbtOK);
        add(jbtCancel);
        jbtOK.addActionListener(new OKListenerClass());
        jbtCancel.addActionListener(new CancelListenerClass());
    }

    public static void main(String[] args) {
        HandleEvent frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(250, 100);
        frame.setLocation(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//public class HandleEvent extends JFrame {
//
//    public HandleEvent() {
//        FlowLayout layout = new FlowLayout();
//        setLayout(layout);
//        JButton jbtOK = new JButton("OK");
//        JButton jbtCancel = new JButton("Cancel");
//        add(jbtOK);
//        add(jbtCancel);
//// Create listener objects
//        OKListenerClass listener1 = new OKListenerClass();
//        CancelListenerClass listener2 = new CancelListenerClass();
//// Register listeners
//        jbtOK.addActionListener(listener1);
//        jbtCancel.addActionListener(listener2);
//    }
//        public static void main(String[] args) {
//        HandleEvent frame = new HandleEvent();
//        frame.setTitle("Handle Event");
//        frame.setSize(250, 100);
//        frame.setLocation(400, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}

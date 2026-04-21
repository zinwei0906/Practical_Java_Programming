/**
 *
 * @author Wei
 */
package practical9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P9Q3 extends JFrame {
    
    private JTextField jtfName = new JTextField();
    private JTextField jtfID = new JTextField();
    
    private JComboBox jcbProgramme = new JComboBox(new Object[]{" DIA2", " DIB2", " DIT2", " DST2"});
    private JList jlSoftware = new JList(new Object[]{" Window 8", " Window 10", " Visual Studio 2015", " SQL Server"});
    
    private JButton jbtConfirm = new JButton("Confirm");
    private JButton jbtClear = new JButton("Clear");
    private JButton jbtExit = new JButton("Exit");
    
    public P9Q3() {
        Font font = new Font("TimesRoman", Font.BOLD, 20);
        //Create one Jpanel is Grid Layout (2,2) in NORTH
        JPanel p1 = new JPanel(new GridLayout(2, 2));
        p1.add(new JLabel(" Name")).setFont(font);
        p1.add(jtfName).setFont(font);
        p1.add(new JLabel(" ID")).setFont(font);
        p1.add(jtfID).setFont(font);
        add(p1, BorderLayout.NORTH);

        //Create one Jpanel is Grid Layout (5,1) in WEST
        JPanel p2 = new JPanel(new GridLayout(5, 1));
        p2.add(new JLabel(" Programme")).setFont(font);
        p2.add(jcbProgramme).setFont(font);
        jcbProgramme.setForeground(Color.RED);
        jcbProgramme.setBackground(Color.WHITE);
        add(p2, BorderLayout.WEST);

        //Create one Jpanel is Grid Layout (5,1) in EAST
        JPanel p3 = new JPanel(new GridLayout(5, 1));
        p3.add(new JLabel("Software")).setFont(font);
        jlSoftware.setVisibleRowCount(4);
        jlSoftware.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        p3.add(jlSoftware).setFont(font);
        add(p3, BorderLayout.EAST);

        //Create one Jpanel is FlowLayout.CENTER in SOUTH
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p4.add(jbtConfirm).setFont(font);
        p4.add(jbtClear).setFont(font);
        p4.add(jbtExit).setFont(font);
        add(p4, BorderLayout.SOUTH);
        
        setTitle("Check Out System");
        setSize(600, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        jbtConfirm.addActionListener(new CheckListener());
        jbtClear.addActionListener(new CheckListener());
        jbtExit.addActionListener(new CheckListener());
    }
    
    private class CheckListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == jbtConfirm) {
                    String message = "<br/>Name : " + jtfName.getText() + "<br/>ID : " + jtfID.getText()
                            + "<br/>Programme : " + jcbProgramme.getSelectedItem()
                            + "<br/>Software selected : ";
                    
                    for (int number = 0; number < jlSoftware.getSelectedIndices().length; number++) {
                        message += "<br/>" + jlSoftware.getSelectedValuesList().get(number);
                    }
                    
                    message += "<br/><br/>Is the information correct?";
                    JLabel showmessage = new JLabel("<html>" + message + "</html>");
                    Font font = new Font("TimesRoman", Font.BOLD, 18);
                    showmessage.setFont(font);
//                    JOptionPane.showMessageDialog(new JFrame(), showmessage, "Check Information", JOptionPane.QUESTION_MESSAGE);
                    int res = JOptionPane.showOptionDialog(new JFrame(), showmessage, "Check Information",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
                    if (res == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Thank You", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else if (res == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "No", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    } else if (res == JOptionPane.CLOSED_OPTION) {
                        JOptionPane.showMessageDialog(null, "Close", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (e.getSource() == jbtClear) {
                    jtfName.setText("");
                    jtfID.setText("");
                    jcbProgramme.setSelectedIndex(0);
                    jlSoftware.clearSelection();
                    
                } else if (e.getSource() == jbtExit) {
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Value cant null and empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String[] args) {
        new P9Q3();
    }
    
}

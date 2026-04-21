//Name : Tan Zin Wei
//Student ID : 19WMD06432
//Programme : DFT2 Group6
package diploma1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wei
 */
public class Diploma1 extends JFrame {

    //Personal Details
    private JLabel NameMessage = new JLabel("Name", SwingConstants.RIGHT);
    private JTextField Name = new JTextField();
    private JLabel EmailMessage = new JLabel("Email", SwingConstants.RIGHT);
    private JTextField Email = new JTextField();
    private JLabel ContactMessage = new JLabel("Contact", SwingConstants.RIGHT);
    private JTextField Contact = new JTextField();
    private JLabel MaritalMessage = new JLabel("Marital Status", SwingConstants.RIGHT);
    private JComboBox Marital = new JComboBox(new Object[]{"Single", "Married", "Divorced", "Widowed"});
    //Subscription Options
    private JLabel SubscriptionMessage = new JLabel("Subscription Package", SwingConstants.RIGHT);
    private ButtonGroup bgSubscription = new ButtonGroup();
    private JRadioButton Diamond = new JRadioButton("Diamond");
    private JRadioButton Platinum = new JRadioButton("Platinum");
    private JRadioButton Gold = new JRadioButton("Gold");
    private JLabel ReceiveMessage = new JLabel("Receive Promotion Updates?", SwingConstants.RIGHT);
    private ButtonGroup bgReceive = new ButtonGroup();
    private JCheckBox Yes = new JCheckBox("Yes");
    private JCheckBox No = new JCheckBox("No");
    //Submit and Cancel Button
    private JButton Submit = new JButton("Submit");
    private JButton Cancel = new JButton("Cancel");

    public Diploma1() {
        Font font = new Font("TimesRoman", Font.BOLD, 15);
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        TitledBorder PersonalTitle = new TitledBorder("Personal Details");
        PersonalTitle.setTitleFont(PersonalTitle.getTitleFont().deriveFont(Font.BOLD + Font.ITALIC, 20));
        p1.setBorder(PersonalTitle);
        p1.setLayout(new GridLayout(4, 2, 10, 0));
        p1.add(NameMessage).setFont(font);
        p1.add(Name).setFont(font);
        p1.add(EmailMessage).setFont(font);
        p1.add(Email).setFont(font);
        p1.add(ContactMessage).setFont(font);
        p1.add(Contact).setFont(font);
        p1.add(MaritalMessage).setFont(font);
        p1.add(Marital).setFont(font);
        add(p1, BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        TitledBorder SubscriptionTitle = new TitledBorder("Subscription Options");
        SubscriptionTitle.setTitleFont(SubscriptionTitle.getTitleFont().deriveFont(Font.BOLD + Font.ITALIC, 20));
        p2.setBorder(SubscriptionTitle);
        JPanel p2p1 = new JPanel();
        p2p1.setLayout(new GridLayout(1, 2, 10, 0));
        p2p1.add(SubscriptionMessage);
        JPanel p2p1panel4 = new JPanel();
        p2p1panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        bgSubscription.add(Diamond);
        bgSubscription.add(Platinum);
        bgSubscription.add(Gold);
        p2p1panel4.add(Diamond);
        p2p1panel4.add(Platinum);
        p2p1panel4.add(Gold);
        p2p1.add(p2p1panel4);
        p2.add(p2p1, BorderLayout.NORTH);
        JPanel p2p2 = new JPanel();
        p2p2.setLayout(new GridLayout(1, 2, 10, 0));
        JPanel p2p2panel2 = new JPanel();
        p2p2panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2p2.add(ReceiveMessage);
        bgReceive.add(Yes);
        bgReceive.add(No);
        p2p2panel2.add(Yes);
        p2p2panel2.add(No);
        p2p2.add(p2p2panel2);
        p2.add(p2p2, BorderLayout.SOUTH);
        add(p2, BorderLayout.CENTER);
        JPanel p3 = new JPanel();
        p3.add(Submit);
        p3.add(Cancel);
        add(p3, BorderLayout.SOUTH);
        setTitle("Subscription Registration");
        setSize(600, 350);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Diploma1();
    }
}

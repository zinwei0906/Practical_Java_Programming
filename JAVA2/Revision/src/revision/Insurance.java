package revision;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Insurance extends JFrame {

    private ButtonGroup bgInsurance = new ButtonGroup();
    private JCheckBox jcbHMO = new JCheckBox("HMO");
    private JCheckBox jcbPPO = new JCheckBox("PPO");

    private JCheckBox jcbDental = new JCheckBox("Dental Insurance");
    private JCheckBox jcbVision = new JCheckBox("Vision Insurance");

    private JLabel NameMessage = new JLabel("Name ");
    private JTextField Name = new JTextField();
    private JLabel PriceMessage = new JLabel("Price");
    private JTextField Price = new JTextField();

    public Insurance() {
        Font font = new Font("Arial", Font.BOLD, 20);
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.add(jcbHMO).setFont(font);
        p1.add(jcbPPO).setFont(font);
        add(p1, BorderLayout.NORTH);
        bgInsurance.add(jcbHMO);
        bgInsurance.add(jcbPPO);
        TitledBorder insuransBorder = BorderFactory.createTitledBorder("Type of Insurans");
        insuransBorder.setTitleJustification(TitledBorder.CENTER);
        insuransBorder.setTitleFont(font);
        p1.setBorder(insuransBorder);
        p1.setOpaque(true);
        p1.setBackground(Color.WHITE);

        JPanel p2 = new JPanel();
        p2.add(jcbDental).setFont(font);
        p2.add(jcbVision).setFont(font);
        add(p2, BorderLayout.CENTER);

        TitledBorder addtioninsuransBorder = BorderFactory.createTitledBorder("Extra Insurans");
        addtioninsuransBorder.setTitleJustification(TitledBorder.CENTER);
        addtioninsuransBorder.setTitleFont(font);
        p2.setBorder(addtioninsuransBorder);
        p2.setOpaque(true);
        p2.setBackground(Color.LIGHT_GRAY);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(2, 2, 10, 20));
        p3.add(NameMessage).setFont(font);
        p3.add(Name).setFont(font);
        p3.add(PriceMessage).setFont(font);
        p3.add(Price).setFont(font);
        add(p3, BorderLayout.SOUTH);

        jcbHMO.addActionListener(new CalculatorPriceClass());
        jcbPPO.addActionListener(new CalculatorPriceClass());
        jcbDental.addActionListener(new CalculatorPriceClass());
        jcbVision.addActionListener(new CalculatorPriceClass());

        setTitle("Insurans");
        setSize(800, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class CalculatorPriceClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int price = 0;
                if (jcbDental.isSelected()) {
                    price += 75;
                }
                if (jcbVision.isSelected()) {
                    price += 20;
                }
                if (jcbHMO.isSelected()) {
                    Name.setText("HMO (Health Maintenance Organization)");
                    price += 200;
                    Price.setText("RM" + price + " per month");

                } else if (jcbPPO.isSelected()) {
                    Name.setText("PPO (Preferred Provider Organization)");
                    price += 600;
                    Price.setText("RM" + price + " per month");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Insurance();
    }

}

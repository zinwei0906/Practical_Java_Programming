package practical3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class P3Q2 extends JFrame {

    // Creating Random Object
    public static Random RandomNumber = new Random();

    //Create Array of 100 Integer Numbers
    public static int[] ArrayNumber = new int[100];

    class ArrayClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int numberIndex = Integer.parseInt(Index.getText());
                //if the index of array number is invalid will go to the catch
                int numberElement = ArrayNumber[numberIndex];
                Element.setText("" + numberElement);
            } catch (ArrayIndexOutOfBoundsException ex) {
                //User enter the index out of 0-99 ,the element will display "Out of bound"
                Element.setText("Out of Bound");
            } catch (NumberFormatException ex) {
                //User enter input index like @!#$abcd will display error message
                Element.setText("Invalid Array index!!!");
            }
        }
    }
    private JTextField Index = new JTextField(10);
    private JTextField Element = new JTextField(10);
    private JButton ShowElement = new JButton("Show Element");

    public P3Q2() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));
        p1.add(new JLabel("Array Index "));
        p1.add(Index);
        p1.add(new JLabel("Array Element"));
        p1.add(Element);
        add(p1, BorderLayout.NORTH);

        //Add Show Element Button
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 1));
        p2.add(ShowElement);
        add(p2, BorderLayout.CENTER);

        ShowElement.addActionListener(new ArrayClass());
        setTitle("Display : Show Bounds Error");
        pack();
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Element.setEditable(false);
        setVisible(true);
    }

    public static void main(String[] args) {

        for (int num = 0; num < ArrayNumber.length; num++) {
            //Storing Random Integers In An Array
            ArrayNumber[num] = RandomNumber.nextInt(10000);
        }
        new P3Q2();
    }

}

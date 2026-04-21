package practical1;

import javax.swing.*;
import java.awt.*;

public class P1Q2 extends JFrame {

//    private JButton ButtonHello = new JButton("Hello!!!");
    public P1Q2() {
        //Add Button Hello
        add(new JButton("Hello!!!"));
//        add(ButtonHello);
        //Set the frame title is One Frame
        setTitle("One Frame");
        //Set the frame 500pixels wide and 600 pixels high
        setSize(500, 600);
        //Set the frame closed ,the program is terminate
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the frame be center on screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Display the Output
        P1Q2 Frame = new P1Q2();
    }

}

/**
 *
 * @author Wei
 */
package practical8;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class P8Q1 extends JFrame {

    public P8Q1() {
        JPanel panel = new JPanel();
        ImageIcon GrapesIcon = new ImageIcon(getClass().getResource("/images/grapes.gif"));
        JLabel jGrapes = new JLabel("Grapes", GrapesIcon, SwingConstants.CENTER);

        //P8Q1A
//        jGrapes.setHorizontalAlignment(SwingConstants.LEFT);
//        jGrapes.setHorizontalAlignment(SwingConstants.CENTER);
//        jGrapes.setHorizontalAlignment(SwingConstants.RIGHT);
//        jGrapes.setVerticalAlignment(SwingConstants.TOP);
//        jGrapes.setVerticalAlignment(SwingConstants.CENTER);
//        jGrapes.setVerticalAlignment(SwingConstants.BOTTOM);
        //P8Q1B
//        jGrapes.setHorizontalTextPosition(SwingConstants.LEFT);
//        jGrapes.setHorizontalTextPosition(SwingConstants.CENTER);
//        jGrapes.setHorizontalTextPosition(SwingConstants.RIGHT);
//        jGrapes.setVerticalTextPosition(SwingConstants.TOP);
//        jGrapes.setVerticalTextPosition(SwingConstants.CENTER);
        jGrapes.setVerticalTextPosition(SwingConstants.BOTTOM);
        jGrapes.setBorder(BorderFactory.createTitledBorder(""));
        panel.add(jGrapes);
        add(panel);

    }

    public static void main(String[] args) {
        P8Q1 frame = new P8Q1();
        frame.setTitle("LEFT/LEADING");
//        frame.setTitle("CENTER");
//        frame.setTitle("RIGHT");
//        frame.setTitle("TOP");
//        frame.setTitle("CENTER");
//        frame.setTitle("BOTTON");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

/**
 *
 * @author Wei
 */
package practical9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P9Q4SoftwareCheckOut extends JPanel {

    public P9Q4SoftwareCheckOut(String text) {
        JLabel showmessage = new JLabel("<html>" + text + "</html>");
        Font font = new Font("TimesRoman", Font.BOLD, 18);
        showmessage.setFont(font);
        add(showmessage);
       
    }

    public static void main(String[] args) {
//        new P9Q4SoftwareCheckOut(text);
    }

}

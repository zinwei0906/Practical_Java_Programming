package Q3;
//Name : Tee Ka Seng
//Student ID : 19WMD10728

import java.awt.*;
import javax.swing.*;

public class Q3b extends JFrame {

    public Q3b() {
        //JMenu
        JMenuBar jmbMenu = new JMenuBar();
        setJMenuBar(jmbMenu);

        JMenu jmMenu = new JMenu("Menu", false);
        jmbMenu.add(jmMenu);
        jmMenu.add(new JMenuItem("Item 1"));
        jmMenu.add(new JMenuItem("Item 2"));
        jmMenu.add(new JMenuItem("Item 3"));

        JMenu jmSubMenu = new JMenu("Sub Menu");
        jmSubMenu.add(new JMenuItem("Item 4"));
        jmSubMenu.add(new JMenuItem("Item 5"));
        jmMenu.add(jmSubMenu);

        setTitle("Menu and MenuItem Example");
        setSize(600, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3b();
    }

}

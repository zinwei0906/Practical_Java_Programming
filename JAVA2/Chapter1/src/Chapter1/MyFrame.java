/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

import javax.swing.*;

public class MyFrame extends JFrame {

    private JButton jbtOK1 = new JButton("Are you ok?");
    private JButton jbtOK2 = new JButton("OK");

    public MyFrame() {
        super("Frame Title");
        add(jbtOK1);
        add(jbtOK2);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}

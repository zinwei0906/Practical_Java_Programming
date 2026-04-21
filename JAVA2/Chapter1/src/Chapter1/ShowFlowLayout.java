/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ShowFlowLayout extends JFrame {

    public ShowFlowLayout() {
        setLayout(new GridLayout(3, 2));
//        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        

        add(new JLabel("First Name"));
        add(new JTextField(8));
        
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));

        setTitle("ShowFlowLayout\nShowFlowLayout");
        pack();
//        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
    }
}

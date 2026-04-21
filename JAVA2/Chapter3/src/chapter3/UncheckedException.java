/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {
        String[] students = {"Clark Kent", "Natalie Teeger", "Adrian Monk","Kevin Rudd", "Jessica Tandy"};
        String input = JOptionPane.showInputDialog("Enter index [1.."+ students.length + "]");
        int index = Integer.parseInt(input) - 1;
        JOptionPane.showMessageDialog(null, "Student #" + input + ": "+ students[index]);
    }
}

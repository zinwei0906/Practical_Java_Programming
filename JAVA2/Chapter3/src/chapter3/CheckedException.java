/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.*;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter output = new PrintWriter("testfile.txt");
        output.println("Welcome to Java");
        if (output != null) {
            output.close();
        }
    }
}

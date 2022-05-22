package net.gyro;


import javax.swing.*;
import java.awt.*;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300,300,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sex Machine");
        frame.pack();
        frame.setVisible(true);




        /*Grid test = new Grid(25,25);

        System.out.println(test);

        test.display(2);
        System.out.println("yes");*/
    }
}

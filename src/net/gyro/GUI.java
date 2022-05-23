package net.gyro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    GUI() {
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SuS machine");

        JLabel _label = new JLabel("Nigga Balls" );
        _label.setBounds(20,100, 450,50);
        add(_label);

        JButton _button = new JButton("? SUS ?", new ImageIcon("sus.png"));
        _button.setBounds(20,200,450,50);
        add(_button);

        _button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                _button.setText("Amogus");
            }
        });

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
}

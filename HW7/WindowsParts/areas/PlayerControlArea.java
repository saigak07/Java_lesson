package Lesson07.WindowsParts.areas;

import Lesson07.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerControlArea extends JPanel {
    private JButton Left;
    private JButton Right;
    private JButton Up;
    private JButton Down;

    private InfoPanel infoPanel;

    public PlayerControlArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;
        setLayout(new GridLayout(1,4));

        Left = new JButton("<");
        Left.setPreferredSize(new Dimension(100,100));


        Left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Left");

            }
        });

        Right = new JButton(">");
        Right.setPreferredSize(new Dimension(100,100));

        Right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Right");

            }
        });

        Up = new JButton("^");
        Up.setPreferredSize(new Dimension(100,100));

        Up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Up");

            }
        });


        Down = new JButton("v");
        Down.setPreferredSize(new Dimension(100,100));

        Down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Down");

            }
        });


        add(Left);
        add(Up);
        add(Down);
        add(Right);
    }
}

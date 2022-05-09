package Lesson07.WindowsParts.areas;

import Lesson07.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControlArea extends JPanel {

    private JButton startGame;
    private JButton exitGame;

    private InfoPanel infoPanel;

    public GameControlArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;
        setLayout(new GridLayout(2,1));

        startGame = new JButton("Start game");

        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start");

            }
        });


        exitGame = new JButton("Exit game");
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit");

            }
        });

        add(startGame);
        add(exitGame);
    }
}

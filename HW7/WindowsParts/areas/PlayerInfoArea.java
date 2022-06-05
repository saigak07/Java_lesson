package Lesson07.WindowsParts.areas;

import Lesson07.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private JLabel hp;
    private JLabel exp;
    private JLabel coin;

    private InfoPanel infoPanel;

    public PlayerInfoArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;

        setLayout(new GridLayout(4, 1));

        hp = new JLabel("Player Health: ?");
        exp = new JLabel("Player Experience: ?");
        coin = new JLabel("Collected coins: ?");


        add(new JLabel("= Player ="), SwingConstants.CENTER);
        add(hp);
        add(exp);
        add(coin);

    }
}

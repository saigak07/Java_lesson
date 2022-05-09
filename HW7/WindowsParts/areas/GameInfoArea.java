package Lesson07.WindowsParts.areas;

import Lesson07.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {
    private JLabel sizeMap;
    private JLabel levelGame;
    private JLabel countEnemies;

    private InfoPanel infoPanel;

    public GameInfoArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;

        setLayout(new GridLayout(4,1));

        sizeMap = new JLabel("Size map: ?x?");
        levelGame = new JLabel("Level: ?");
        countEnemies = new JLabel("Enemies: ?");


       add(new JLabel("= Game Info ="), SwingConstants.CENTER);
       add(sizeMap);
       add(levelGame);
       add(countEnemies);
    }
}

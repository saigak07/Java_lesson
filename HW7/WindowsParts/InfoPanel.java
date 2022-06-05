package Lesson07.WindowsParts;

import Lesson07.MainWindow;
import Lesson07.WindowsParts.areas.GameControlArea;
import Lesson07.WindowsParts.areas.GameInfoArea;
import Lesson07.WindowsParts.areas.PlayerControlArea;
import Lesson07.WindowsParts.areas.PlayerInfoArea;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea logs;
    private JScrollPane scrollBox;

    private MainWindow mainWindow;


    public InfoPanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(5, 1));

        gameControlArea = new GameControlArea(this);
        gameInfoArea = new GameInfoArea(this);
        playerControlArea = new PlayerControlArea(this);
        playerInfoArea = new PlayerInfoArea(this);

        createLogArea();


        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scrollBox);
    }

    private void createLogArea () {
        logs = new JTextArea();
        scrollBox = new JScrollPane(logs);
    }


}

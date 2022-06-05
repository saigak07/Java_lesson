package Lesson07;

import Lesson07.WindowsParts.GameMap;
import Lesson07.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private int posX = 300;
    private int posY = 200;


    private int widthW = 1024;
    private int heighthW = 768;

    private GameMap gameMap;
    private InfoPanel infoPanel;

//    private JButton button1;
//    private JPanel panel;
//    private JLabel label;

    public MainWindow() {
        setupWindow();

        gameMap = new GameMap();
        infoPanel = new InfoPanel(this);

        add(gameMap, BorderLayout.WEST);
        add(infoPanel, BorderLayout.EAST);

//        button1 = new JButton("Button1");
//        panel = new JPanel();
//        label = new JLabel("Hello");
//
//        panel.setLayout(new GridLayout(3, 3));
//
//        for (int i = 0; i < 6; i++) {
//            panel.add(new Button("Button Panel " + i));
//        }
//
//        add(panel, BorderLayout.NORTH);
//        add(label, BorderLayout.SOUTH);
//        add(button1, BorderLayout.WEST);
//
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Hello!!! This is me first app!!");
//            }
//        });


//        setLayout(new GridLayout(4,4));

//        setLayout(new FlowLayout());


//        for (int i = 0; i < 36; i++) {
//            add (new Button("Button# " + i));
//        }
//
//        add(button1, BorderLayout.WEST);
//    }
//


        setVisible(true);
}
    private void setupWindow () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(widthW, heighthW);
        setLocation(posX, posY);
        setResizable(true);
        setTitle("FirstApp");


    }
}
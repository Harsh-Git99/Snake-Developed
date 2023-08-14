package org.project.frame;

import org.project.game.GamePanel;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame(){
        this.setTitle("Snake and Snack");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600,600);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(new GamePanel());
        //this.pack();
    }
}

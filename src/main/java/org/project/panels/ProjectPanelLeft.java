package org.project.panels;

import org.project.buttons.ExitButton;
import org.project.buttons.PlayButton;
import org.project.frame.GameFrame;
import org.project.frame.ProjectFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectPanelLeft extends JPanel implements ActionListener {
    PlayButton play = new PlayButton();
    ExitButton exit = new ExitButton();
    public ProjectPanelLeft(){

        this.setBackground(new Color(167, 194, 124, 255));
        this.setBounds(0, 150, 150, 650);
        this.setLayout(null);
        this.add(exit);
        this.add(play);
        play.addActionListener(this);
        exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  play){

            ProjectFrame frame = new ProjectFrame();
            frame.closeFrame();

            new GameFrame();

        } else if (e.getSource() == exit) {
            ProjectFrame frame = new ProjectFrame();
            frame.closeFrame();
        }
    }


}

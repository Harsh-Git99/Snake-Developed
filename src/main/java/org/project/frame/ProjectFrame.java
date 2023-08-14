package org.project.frame;

import org.project.panels.ProjectPanelHeader;
import org.project.panels.ProjectPanelLeft;
import org.project.panels.ProjectPanelMain;
import org.project.panels.ProjectPanelMain;

import javax.swing.*;
import java.awt.*;

public class ProjectFrame extends JFrame {

    public ProjectFrame(){
        ProjectPanelMain panelMain = new ProjectPanelMain();
        ProjectPanelHeader panelHead = new ProjectPanelHeader();
        ProjectPanelLeft panelLeft = new ProjectPanelLeft();
        this.setTitle("Snake and Snack");
        this.add(panelLeft);
        this.add(panelMain);
        this.add(panelHead);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600,600);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
//        this.setLocationRelativeTo(null);
    }

    public void closeFrame(){
        System.out.println("The frame has been closed");
        this.dispose();
    }

}

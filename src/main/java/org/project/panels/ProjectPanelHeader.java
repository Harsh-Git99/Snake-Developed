package org.project.panels;

import javax.swing.*;
import java.awt.*;

public class ProjectPanelHeader extends JPanel {
    public ProjectPanelHeader(){

        try {
            ImageIcon icon = new ImageIcon("/Users/harshpratapsingh/Desktop/Learning Java/OopsByKunal/ProjectPratice/src/main/java/org/project/panels/img.png");
            Image resizedImage = icon.getImage().getScaledInstance(50  , 50, Image.SCALE_SMOOTH);
            ImageIcon iconSnake = new ImageIcon(resizedImage);

            JLabel labelTitle = new JLabel();
            labelTitle.setText("Snake & Snack");
            labelTitle.setIcon(iconSnake);

            labelTitle.setVerticalAlignment(JLabel.BOTTOM);

            labelTitle.setFont(new Font("Playfair Display",Font.ITALIC, 30));
            labelTitle.setBounds(100,100,80,40);
            labelTitle.setLayout(null);

            this.add(labelTitle);
            this.setBackground(new Color(107, 72, 206, 255));
            this.setBounds(150, 0, 450, 150);
            this.setPreferredSize(new Dimension(100,50));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

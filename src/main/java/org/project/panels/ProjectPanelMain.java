package org.project.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectPanelMain extends JPanel implements ActionListener {

    Image image;
    public ProjectPanelMain(){

         image = Toolkit.getDefaultToolkit().getImage("/Users/harshpratapsingh/Desktop/Learning Java/OopsByKunal/ProjectPratice/src/main/java/org/project/panels/mainImg.png");
        image = image.getScaledInstance(450   , 450, Image.SCALE_SMOOTH);

        JPanel panel = new JPanel();
       Graphics g = new DebugGraphics();
     //  g.drawImage("/Users/harshpratapsingh/Desktop/Learning Java/OopsByKunal/ProjectPratice/src/main/java/org/project/panels/mainImg.png",0,0,);

        this.setBackground(new Color(176, 149, 240));
        this.setBounds(150,150,450,450);


    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

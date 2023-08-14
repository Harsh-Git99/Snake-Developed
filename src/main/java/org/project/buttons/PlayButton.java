package org.project.buttons;

import javax.swing.*;
import java.awt.*;

public class PlayButton extends JButton {
    
    public PlayButton(){

        ImageIcon icon = new ImageIcon("/Users/harshpratapsingh/Desktop/Learning Java/OopsByKunal/ProjectPratice/src/main/java/org/project/panels/img.png");
        Image resizedImage = icon.getImage().getScaledInstance(40  , 40, Image.SCALE_SMOOTH);
        ImageIcon iconSnake = new ImageIcon(resizedImage);
        
        this.setBounds(20,100,100,50);
        this.setText("Play");
        this.setIcon(iconSnake);
        this.setFont(new Font("Comic Sans", Font.BOLD,10));
        this.setForeground(new Color(62, 94, 9));
        this.setBackground(Color.black);
        //this.setBorder(BorderFactory.createEtchedBorder());
    }
}

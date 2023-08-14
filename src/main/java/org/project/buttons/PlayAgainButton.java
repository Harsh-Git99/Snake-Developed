package org.project.buttons;

import javax.swing.*;
import java.awt.*;

public class PlayAgainButton extends JButton {

    public PlayAgainButton(){

        ImageIcon icon = new ImageIcon("/Users/harshpratapsingh/Desktop/Learning Java/OopsByKunal/ProjectPratice/src/main/java/org/project/panels/img.png");
        Image resizedImage = icon.getImage().getScaledInstance(10  , 10, Image.SCALE_SMOOTH);
        ImageIcon iconSnake = new ImageIcon(resizedImage);

        this.setBounds(270,400,100,50);
        this.setText("Play Again");
        this.setIcon(iconSnake);
        this.setFont(new Font("Comic Sans", Font.BOLD,10));
        this.setForeground(new Color(62, 94, 9));
        this.setBackground(Color.black);

        //this.setBorder(BorderFactory.createEtchedBorder());
    }
}

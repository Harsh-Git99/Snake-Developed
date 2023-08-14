package org.project.buttons;

import javax.swing.*;
import java.awt.*;

public class ExitButton extends JButton {

    public ExitButton(){
        ImageIcon icon = new ImageIcon("/Users/harshpratapsingh/Desktop/Learning Java/OopsByKunal/ProjectPratice/src/main/java/org/project/buttons/door.png");
        Image resizedImage = icon.getImage().getScaledInstance(40  , 40, Image.SCALE_SMOOTH);
        ImageIcon iconSnake = new ImageIcon(resizedImage);


        this.setBounds(20,200,100,50);
        this.setText("Exit");
        this.setIcon(iconSnake);
        this.setFont(new Font("Comic Sans", Font.BOLD,10));
        this.setForeground(new Color(62, 94, 9));
        this.setBackground(Color.black);
        //this.setBorder(BorderFactory.createEtchedBorder());
    }
}

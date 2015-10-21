/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class fieldbackroundroom extends room2 {
    
    private ImageIcon fieldback;

    public fieldbackroundroom(jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world world_in) {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, world_in);
        
        
        
        fieldback = new ImageIcon( getClass().getResource("longfield.jpg") );
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        g.drawImage(fieldback.getImage(), -5, 410, 1300, 90, null);
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world1;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class forge extends insideroom {
    
    
    
    public forge( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, constants.darkbrown, Color.BLACK, platforms, bags, maincharacter, null, null, null);
        
    }
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        ImageIcon portal = new ImageIcon( getClass().getResource("TaldoAnvill.jpg") );
        
        
        g.drawImage(portal.getImage(), 755, 460, 50, 40, null);
        
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class market1 extends room2 {  
    
    
    private ImageIcon portal;
    private ImageIcon portal2;
    
    
    public market1( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        portal = new ImageIcon( getClass().getResource("MeatStall.png") );
        portal2 = new ImageIcon( getClass().getResource("VegiStall.png") );
        
        unit man1 = new castle.marketman2(this, 600, 500);
        
        addneutral(man1);
    }
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        
        g.drawImage(portal.getImage(), 390, 320, 210, 180, null);
        
        
        
        
        g.drawImage(portal2.getImage(), 890, 320, 210, 180, null);
        
        
        
    }
    
    
    
    
}




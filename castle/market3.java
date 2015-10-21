/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import builders.w1_vil1build;
import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class market3 extends room2 {  
    
    private unit ondo;
    
    private ImageIcon portal;
    private ImageIcon portal2;
    private ImageIcon portal3;
    
    
    public market3( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        unit w1_vil1 = new unit( 100, 0, 5, "handsword", 700, 421, new noai(), this.getweap3(), this, 100, 140 );
        
        w1_vil1.setName("Ondo");
        w1_vil1.setStatement("Hello Taldo.  Want something?");
        
        w1_vil1build.buildvil1(w1_vil1);
        
        this.addneutral(w1_vil1);
        
        ondo = w1_vil1;
        
        portal = new ImageIcon( getClass().getResource("MeatStall.png") );
        portal2 = new ImageIcon( getClass().getResource("VegiStall.png") );
        portal3 = new ImageIcon( getClass().getResource("TinCart.png") );
        
        
        unit man1 = new castle.shadowroomperson(this, 300, 500);
        
        addneutral(man1);
    }
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        
        g.drawImage(portal.getImage(), 390, 320, 210, 180, null);
        
        
        
        
        g.drawImage(portal2.getImage(), 890, 320, 210, 180, null);
        
        if ( ondo.getlife() > 0 ) {
            
        
        
            g.drawImage(portal3.getImage(), 600, 440, 100, 60, null);
            
        }
        
    }
    
    
    @Override
    public void extrainit()
    {
        if ( this.getpanel().is_ondo_in_room() ) {
            ondo.respawn();
        }
        else {
            ondo.setlife(-1);
        }
    }
    
    
}



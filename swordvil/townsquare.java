/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;

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
public class townsquare extends room {  
    
    private unit ondo;
    
    
    public townsquare( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        unit w1_vil1 = new unit( 100, 0, 5, "handsword", 700, 421, new noai(), this.getweap3(), this, 100, 140 );
        
        w1_vil1.setName("Ondo");
        w1_vil1.setStatement("Hello Taldo.  My market stall takes me everywhere.");
        
        w1_vil1build.buildvil1(w1_vil1);
        
        this.addneutral(w1_vil1);
        
        ondo = w1_vil1;
        
        
        unit man1 = new swordvil.marketman1(this, 400, 500);
        
        man1.setdir(2);
        
        addneutral(man1);
        
        unit man2 = new swordvil.marketman2(this, 900, 500);
        
        addneutral(man2);
    }
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        ImageIcon portal = new ImageIcon( getClass().getResource("MeatStall.png") );
        
        
        g.drawImage(portal.getImage(), 390, 320, 210, 180, null);
        
        ImageIcon portal2 = new ImageIcon( getClass().getResource("VegiStall.png") );
        
        
        g.drawImage(portal2.getImage(), 890, 320, 210, 180, null);
        
        if ( ondo.getlife() > 0 ) {
            ImageIcon portal3 = new ImageIcon( getClass().getResource("TinCart.png") );
        
        
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


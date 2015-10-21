/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

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
public class market extends room2 {  
    
    private unit ondo;
    private ImageIcon portal3;
    private ImageIcon tree;
    
    
    public market( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        unit w1_vil1 = new unit( 100, 0, 5, "handsword", 700, 421, new noai(), this.getweap3(), this, 100, 140 );
        
        w1_vil1.setName("Ondo");
        w1_vil1.setStatement("Hello Taldo.  Welcome to Bowvil.");
        
        w1_vil1build.buildvil1(w1_vil1);
        
        this.addneutral(w1_vil1);
        portal3 = new ImageIcon( getClass().getResource("TinCart.png") );
        tree = new ImageIcon( getClass().getResource("W5_Market Tree.jpg") );
        ondo = w1_vil1;
        
        unit mor = new moriel( weap3, this, 400, 500 - 79 );
        
        this.addneutral(mor);
        
        unit lal = new lalaithiel( weap3, this, 320, 500 - 79 );
        
        lal.setdir(2);
        
        lal.setcenterx(320);
        
        this.addneutral(lal);
        
        unit vila = new vil1( weap3, this, 800, 500 - 77 );
        
        this.addneutral(vila);
    }
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        if ( ondo.getlife() > 0 ) {
            
        
        
            g.drawImage(portal3.getImage(), 600, 440, 100, 60, null);
            
        }
        g.drawImage(tree.getImage(), 300, 250, 230, 255, null);
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



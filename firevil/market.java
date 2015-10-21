/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

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
    
    
    private boolean attacked;
    private boolean has_reset;
    
    private unit ondo;
    
    public market( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        attacked = false;
        
        unit sign1 = new sign( 600, 441, this.getweap3(), this, "Firevil Market.  Please do not use weapons in this area." );
        
        this.addneutral(sign1);
        
        unit bag1 = new vil1( weap2, this, 200, 500 - 70, maincharacter );
        
        bag1.setdir(2);
        
        this.addbag(bag1);
        
        unit bag2 = new vil2( weap2, this, 500, 500 - 82, maincharacter );
        
        bag2.setdir(2);
        
        this.addbag(bag2);
        
        unit bag3 = new vil3( weap2, this, 800, 500 - 77, maincharacter );
        
        this.addbag(bag3);
        
        unit bag4 = new chicken( weap2, this, 1100, 500 - 22, maincharacter );
        
        this.addbag(bag4);
        
        
        has_reset = false;
        
        
        unit w1_vil1 = new unit( 100, 0, 5, "handsword", 700, 421, new noai(), this.getweap3(), this, 100, 140 );
        
        w1_vil1.setName("Ondo");
        w1_vil1.setStatement("Hello Taldo.  How ya doing?");
        
        w1_vil1build.buildvil1(w1_vil1);
        
        this.addneutral(w1_vil1);
        
        ondo = w1_vil1;
        
    }
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        
        has_reset = true;
        for ( int c = 0; c < bags.size(); c++ ) {
            bags.get(c).resetai();
            bags.get(c).stopleft();
            bags.get(c).stopright();
            
            bags.get(c).setmomentx(0);
        }
    }
    
    @Override
    public void extrastuff( Graphics g )
    {
        if ( weap1.size() > 1 && !has_reset ) {
            attacked = true;
            for ( int c = 0; c < bags.size(); c++ ) {
                bags.get(c).changeai();
            }
        }
        
        if ( weap1.size() > 0 && has_reset ) {
            attacked = true;
            for ( int c = 0; c < bags.size(); c++ ) {
                bags.get(c).changeai();
            }
        }
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
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
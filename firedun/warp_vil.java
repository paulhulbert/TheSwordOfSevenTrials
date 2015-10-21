/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class warp_vil extends room {  
    
    private platform state1;
    
    private ImageIcon portal;
    
    private ladder ladder1;
    
    
    public warp_vil( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, firedungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        
        ladder1 = new ladderup( 900, 500, constants.firedunfloor, this.weap3, this, constants.firedunladder );
        
        
        
        this.addplatform(ladder1);
        
        platform l1 = new lockwall(100, 500, 200, base, Color.RED, weap3, w.r1_lock, panel);
        
        this.addplatform(l1);
        
        
        unit felder = new firevil.fireelder(this, 900, 500, new noai());
        
        this.addneutral(felder);
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
}



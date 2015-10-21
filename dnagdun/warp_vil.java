/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;


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
    
    
    public warp_vil( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        platform wall1 = new wall_left( Color.DARK_GRAY, this.getweap3() );
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        ladder1 = new ladderup( 130, 300, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(ladder1);
        
        
        
        platform plat1 = new platform( 1200, 300, 500, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 100, 300, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        
        platform mover1 = new platform( 270, 300, 80, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover1.makestep(4, 0, 810, "blankweap");
        
        addplatform(mover1);
        
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



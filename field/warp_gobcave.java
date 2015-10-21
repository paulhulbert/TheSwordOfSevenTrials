/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package field;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class warp_gobcave extends fieldroom {  
    
    platform state1;
    
    public warp_gobcave( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 670, 499, 200, 1, base, false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(400);
        
        unit sign1 = new sign( 400, 441, this.getweap3(), this, "BEWARE OF GOBLINS!" );
        
        this.addneutral(sign1);
        
        world w = new gobvil.gobvillage(mainchar, panel);
        
        state1.setWarppoint(w.getentry());
        w.setexit(this);
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        ImageIcon portal = new ImageIcon( getClass().getResource("portal-rocks.png") );
        
        
        g.drawImage(portal.getImage(), 590, 360, 320, 150, null);
        
    }
    
    
}


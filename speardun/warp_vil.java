/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;

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
    
    
    
    public warp_vil( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(950);
        state1.setWarpy(500 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        platform wall1 = new wall_left( constants.speardunfloor, this.getweap3() );
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
}




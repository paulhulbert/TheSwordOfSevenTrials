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

/**
 *
 * @author Dad
 */
public class hammerroom extends room {  
    
    private platform state1;
    
    private ImageIcon portal;
    
    private boolean gotit;
    private unit hammeritem;
    
    public hammerroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        platform wall1 = new every.wall_left(constants.speardunfloor, weap3);
        this.addplatform(wall1);
        
        platform wall2 = new every.wall_right(constants.speardunfloor, weap3);
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
        
        state1 = new platform( 150, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(110);
        state1.setWarpy(250 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        hammeritem = new builders.superhammeritem(this, 600, 500);
        this.addneutral(hammeritem);
        
        gotit = false;
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    @Override
    public void paintextra( Graphics g )
    {
        if ( !gotit && getpanel().getsavefile().gettrigger("gotweap_superhammer").gettrigger() ) {
            neutral.remove(hammeritem);
        }
        
        g.drawImage(portal.getImage(), 140, 360, 120, 150, null);
        
    }
    
}




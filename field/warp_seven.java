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
public class warp_seven extends fieldroom {  
    
    platform state1;
    
    public warp_seven( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(400);
        
        unit sign1 = new sign( 600, 441, this.getweap3(), this, "Seven Trials" );
        
        this.addneutral(sign1);
        
        
        world w1 = new sostrooms.sostworld(mainchar, panel);
        state1.setWarppoint(w1.getentry());
        w1.setexit(this);
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        ImageIcon portal = new ImageIcon( getClass().getResource("Rocks with writing.png") );
        
        
        g.drawImage(portal.getImage(), 590, 360, 300, 140, null);
        
        g.setColor(constants.sky);
        
        g.drawRect(590, 360, 300, 140);
        
    }
    
    
}

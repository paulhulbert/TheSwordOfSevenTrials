/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class warp_castle extends room2 {  
    
    private platform state1;
    private ImageIcon portal;
    
    public warp_castle( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        unit sign1 = new sign( 600, 441, this.getweap3(), this, "Magedoor to the Keep" );
        
        this.addneutral(sign1);
        
        portal = new ImageIcon( getClass().getResource("KingPortal.png") );
        
        
        world w1 = new keepworld( mainchar, panel );
        
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
        
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
}




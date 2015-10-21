/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class warp_field extends room {  
    
    private platform state1;
    
    public warp_field( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        unit sign1 = new sign( 600, 441, this.getweap3(), this, "Magedoor to the field." );
        
        this.addneutral(sign1);
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        ImageIcon portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
}
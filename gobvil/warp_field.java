/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobvil;


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
    
    private ImageIcon portal;
    private ladder ladder1;
    
    public warp_field( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
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
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        
        ladder1 = new ladderdown( 900, 500, Color.darkGray, this.weap3, this, "LIGHT_GRAY" );
        
        this.addplatform(ladder1);
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



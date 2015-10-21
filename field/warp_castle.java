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
public class warp_castle extends fieldroom {  
    
    platform state1;
    
    public warp_castle( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 600, 410, 250, 90, Color.GRAY, false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(520);
        state1.setWarpy(400);
        
        platform plat1 = new platform( 500, 460, 100, 40, Color.GRAY, false, this.getweap3() );
        
        platform plat2 = new platform( 850, 460, 100, 40, Color.GRAY, false, this.getweap3() );
        
        this.addplatform(plat1);
        this.addplatform(plat2);
        
        unit sign1 = new sign( 400, 441, this.getweap3(), this, "Magedoor to the Castle." );
        unit sign2 = new sign( 1100, 441, this.getweap3(), this, "Magedoor to the Castle." );
        
        this.addneutral(sign1);
        this.addneutral(sign2);
        
        
        insideroom r = new gatehouse( panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null );
        state1.setWarppoint(r);
        r.setwarproom(this);
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
        
        
        g.drawImage(portal.getImage(), 650, 260, 120, 150, null);
        
    }
    
    
    @Override
    public void extrastuff( Graphics g )
    {
        if ( getpersonon( mainchar ) == 2 && mainchar.getcenterx() > 580 ) { 
            mainchar.setcenterx(580);
            
        }
        
        if ( getpersonon( mainchar ) == 3 && mainchar.getcenterx() < 870 ) { 
            mainchar.setcenterx(870);
            
        }
        
        
    }
    
    
}



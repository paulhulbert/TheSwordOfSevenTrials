/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class dungeonportal extends room2 {  
    
    
    private platform state1;
    
    public dungeonportal( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        platform state9 = new hardblock( 1200, 200, 30, 300, constants.brown, constants.darkbrown, false, this.getweap3());
        
        this.addplatform( state9 );
        
        world w1 = new dnagdun.dnagdungeon(mainchar, panel);
        
        w1.setexit(this);
        
        state1.setWarppoint(w1.getentry());
        
        
        unit delder = new dnagelder(this, 400, 500, new noai());
        
        this.addneutral(delder);
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


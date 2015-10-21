/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class dungeonplat extends room2 {  
    
    
    private platform state1;
    
    private trigger open;
    
    
    private ImageIcon portal;
    
    
    public dungeonplat( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowvillage w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(false);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        world w2 = new bowdun.bowdungeon(mainchar, panel);
        
        state1.setWarppoint(w2.getentry());
        w2.setexit(this);
        
        open = w.openportal;
        
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        if ( open.gettrigger() ) {
            
            state1.setWarps(true);
            g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        }
        
        
    }
    
    
    
    
}


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
public class gatehouse extends insideroom {
    
    
    private platform state1;
    private ImageIcon portal;
    
    public gatehouse( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        this.setroomdim(300, 300, 1000, 500);
        
        unit u = new builders.knight(weap3, this, 600, 500 - 85);
        u.setName("Guard");
        u.setStatement("You may pass.");
        this.addneutral(u);
        
        
        state1 = new platform( 400, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(670);
        state1.setWarpy(400 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        
        
        platform state2 = new platform( 800, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state2);
        
        state2.setWarppoint(this);
        state2.setWarps(true);
        state2.setWarpx(720);
        state2.setWarpy(500 - constants.taldoheight() - 1);
        
        
        
        
        world cw = new castle.castleworld(mainchar, panel);
        
        cw.setexit(this);
        state2.setWarppoint(cw.getentry());
        
    }
    
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        
        
        g.drawImage(portal.getImage(), 390, 360, 120, 150, null);
        g.drawImage(portal.getImage(), 790, 360, 120, 150, null);
        
    }
}

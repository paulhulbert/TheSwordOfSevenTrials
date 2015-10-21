/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class spearplat_inroom1 extends insideroom {
    
    
    private platform state1;
    private platform state2;
    
    public spearplat_inroom1( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(500, 300, 1100, 500);
        
        state1 = new platform( 600, 410, 80, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(640);
        state1.setWarpy(400 - constants.taldoheight());
        
        this.addplatform(state1);
        
        
        state2 = new platform( 890, 490, 120, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state2);
        
        state2.setWarppoint(this);
        state2.setWarps(true);
        state2.setWarpx(620);
        state2.setWarpy(400);
        
        
        world dungeon = new speardun.speardungeon(mainchar, panel);
        
        state2.setWarppoint(dungeon.getentry());
        dungeon.setexit(this);
        
        
        
        unit selder = new spearelder(this, 800, 500, new noai());
        
        this.addneutral(selder);
        
    }
    
    
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    @Override
    public void paintextra( Graphics g )
    {
        ImageIcon portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        g.drawImage(portal.getImage(), 890, 360, 120, 150, null);
        
    }
    
    
    
    
}
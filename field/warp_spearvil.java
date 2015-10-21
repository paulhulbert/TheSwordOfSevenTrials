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
public class warp_spearvil extends fieldroom {  
    
    platform state1;
    
    public warp_spearvil( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 600, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(720);
        state1.setWarpy(400);
        
        unit sign1 = new sign( 400, 441, this.getweap3(), this, "Magedoor to Spearvil." );
        
        this.addneutral(sign1);
        
        
        unit goblin = new speardun.spearlauncher( this, 300, 500 - 74, new noai());
        
        AI gobai = new basicai();
        gobai.setperson(goblin);
        gobai.settarget(maincharacter);
        goblin.setai(gobai);
        
        this.addbag(goblin);
        
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
        
        
        g.drawImage(portal.getImage(), 590, 360, 120, 150, null);
        
    }
    
    
}


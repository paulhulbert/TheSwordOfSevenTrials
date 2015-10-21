/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;
import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class room1 extends room {  
    
    platform state1;
    
    public room1( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 600, 410, 80, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(640);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        platform state2 = new platform( 300, 280, 600, 220, Color.GRAY, false, this.getweap3() );
        
        addplatform(state2);
        addplatform(state1);
        
        
        
        room inroom1 = new room1_inroom1( panel, platforms, bags, maincharacter );
        
        state1.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextraover( Graphics g )
    {
        ImageIcon portal = new ImageIcon( getClass().getResource("INNSing.jpg") );
        
        
        g.drawImage(portal.getImage(), 600, 260, 80, 50, null);
        
        g.setColor(constants.sky);
        g.fillRect(590, 230, 110, 50);
        
        g.setColor(Color.GRAY);
        g.drawRect(600, 280, 79, 30);
        
    }
    
    
}

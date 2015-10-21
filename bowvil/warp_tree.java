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
public class warp_tree extends room2 {  
    
    private ImageIcon portal;
    
    public warp_tree( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowvillage w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform state1 = new platform( 670, 499, 200, 1, constants.bowvil, false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(920);
        state1.setWarpy(400);
        
        room tree = new greattree( panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w, this );
        
        state1.setWarppoint(tree);
        
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
    }
    
    
}

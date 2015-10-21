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
public class normaltrap extends room2 {  
    
    private platform state1;
    private ImageIcon tree;
    private ImageIcon portal;
    
    public normaltrap( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
//        
//        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        platform state2 = new hardblock( 100, 200, 30, 300, constants.brown, constants.darkbrown, false, this.getweap3());
        
        this.addplatform( state2 );
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        
        
        weapon spearleft = new steadyspear( 1110, 430, -1 );
        
        weap3.add(spearleft);
        
        platform base1 = new hardblock( 1100, 450, 500, 50, Color.GRAY, Color.BLACK, false, this.getweap3() );
        
        this.addplatform(base1);
        
    }
    
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
//        
//        
//        g.drawImage(tree.getImage(), 330, 100, 620, 405, null);
    }
    
    
    
    
    
    @Override
    public void extrainit()
    {
        weapon spearleft = new steadyspear( 1110, 430, -1 );
        
        weap3.add(spearleft);
        
        
    }
    
    
}

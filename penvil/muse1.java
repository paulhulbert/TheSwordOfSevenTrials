/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class muse1 extends room2 {  
    
    private platform state1;
    
    public muse1( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        state1 = new platform( 800, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        unit stand1 = new builders.scrollstand(weap3, this, 300, 500 - 47);
        stand1.setName("Essay on Monster1");
        stand1.setStatement("Monster1");
        this.addneutral(stand1);
        
        
        
        unit stand2 = new builders.scrollstand(weap3, this, 700, 500 - 47);
        stand2.setName("Essay on Monster2");
        stand2.setStatement("Monster2");
        this.addneutral(stand2);
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
        
        
        g.drawImage(portal.getImage(), 790, 360, 120, 150, null);
        
    }
    
}


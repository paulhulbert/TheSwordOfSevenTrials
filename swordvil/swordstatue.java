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
public class swordstatue extends room {  
    
    private unit gen;
    private int counter0;
    
    public swordstatue( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        gen = new general( weap3, this, 750, 500 - 78 );
        this.addneutral(gen);
        
        counter0 = 0;
    }
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        ImageIcon portal = new ImageIcon( getClass().getResource("SwordStatue.jpg") );
        
        
        g.drawImage(portal.getImage(), 590, 270, 100, 230, null);
        
        g.setColor(constants.sky);
        
        g.drawLine(590, 270, 590, 420);
        g.drawLine(591, 270, 591, 420);
        g.drawLine(592, 270, 592, 420);
        
        
    }
    
    
    @Override
    public unit chatter()
    {
        unit targ = super.chatter();
        
        getpanel().getsavefile().room3_inroom1_locked.settrigger(true);
        
        
        
        
        return targ;
        
        
    }
    
    @Override
    public void extrastuff(  Graphics g ) {
        
        if ( getpanel().getsavefile().room3_inroom1_locked.gettrigger() && counter0 > 5 ) {
            gen.clearstatements();
            gen.setStatement("You have my permission to get the sword.  It is in the barracks.");
        }
        
        if ( getpanel().getsavefile().room3_inroom1_locked.gettrigger() && counter0 <= 5 ) {
            counter0++;
        }
        
    }
    
}

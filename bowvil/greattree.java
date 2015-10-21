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
public class greattree extends room2 {  
    
    private ImageIcon portal;
    private ImageIcon tree;
    
    private trigger dead;
    
    private unit bag1;
    
    public greattree( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowvillage w, room uproom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        dead = w.openportal;
        
        platform state1 = new hardblock( 100, 200, 30, 300, constants.brown, constants.darkbrown, false, this.getweap3());
        
        this.addplatform( state1 );
        
        platform state2 = new hardblock( 1200, 200, 30, 300, constants.brown, constants.darkbrown, false, this.getweap3());
        
        this.addplatform( state2 );
        
        
        platform state3 = new platform( 870, 499, 200, 1, constants.bowvil, false, this.getweap3() );
        
        addplatform(state3);
        
        state3.setSolid(false);
        state3.setWarppoint(uproom);
        state3.setWarps(true);
        state3.setWarpx(710);
        state3.setWarpy(500 - constants.taldoheight());
        
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        tree = new ImageIcon( getClass().getResource("Mallorn.jpg") );
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        bag1 = new builders.junglemonkeylizard(this, 300, 500 - 1, ai1);
        bag1.settrigger(w.openportal);
        this.addbag(bag1);
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        if ( bag1.getdead() ) {
            dead.settrigger(true, getpanel());
            bag1.stopondeadtrigger();
        }
        
        
        
        g.drawImage(portal.getImage(), 890, 360, 120, 150, null);
        g.drawImage(tree.getImage(), 330, 0, 420, 503, null);
        
    }
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        
        if ( dead.gettrigger() ) {
            bag1.setlife(-10);
        }
        
    }
    
    
}



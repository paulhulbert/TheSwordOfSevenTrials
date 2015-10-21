/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;


import every.*;
import java.awt.Color;
import java.util.ArrayList;
import speardun.mobilefiretrap;

/**
 *
 * @author Dad
 */
public class r6 extends room2 { 
    
    private platform state4;
    
    
    public r6( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, firedungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        state4 = new platform( 700, 410, 50, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state4.setSolid(false);
        state4.setWarppoint(this);
        state4.setWarps(true);
        state4.setWarpx(720);
        state4.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state4);
        
        AI ai1 = new artintell.patrol(800, false);
        ai1.settarget(mainchar);
        unit bag1 = new mobilefiretrap(this, 300, 500 - 1, ai1);
        this.addbag(bag1);
        
        AI ai2 = new artintell.patrol(400, false);
        ai2.settarget(mainchar);
        unit bag2 = new mobilefiretrap(this, 500, 500 - 1, ai2);
        this.addbag(bag2);
        
    }
    
    
    @Override
    public void setwarproom( room targ )
    {
        state4.setWarppoint(targ);
    }
    
    
    
}







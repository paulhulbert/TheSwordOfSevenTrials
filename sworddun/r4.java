/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r4 extends room2 {  
    
    private ladder ladder1;
    
    public r4( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sworddungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        ladder1 = new ladderdown( 900, 500, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        this.addplatform(ladder1);
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        w.lock_r4 = new lockwall(1100, 500, 200, base, Color.RED, weap3, w.r4_lock, panel);
        
        this.addplatform(w.lock_r4);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.gobwarrior(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        
        AI ai2 = new basicai();
        ai2.settarget(mainchar);
        unit bag2 = new builders.gobwarrior(this, 400, 500 - 1, ai2);
        this.addbag(bag2);
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    
    
}





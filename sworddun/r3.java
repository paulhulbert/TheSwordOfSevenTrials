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
public class r3 extends room2 {  
    
    private ladder ladder1;
    
    public r3( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        ladder1 = new ladderup( 900, 500, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        this.addplatform(ladder1);
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.gobwarrior(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        bag1.setdropdead("heart");
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    
    
}




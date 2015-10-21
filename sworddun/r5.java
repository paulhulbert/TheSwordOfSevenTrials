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
public class r5 extends room2 {  
    
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sworddungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new every.wall_left(base, weap3);
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        
        button b1 = new every.button(400, 500, 20, Color.red, weap3, w.r4_lock, this, false);
        
        this.addplatform(b1);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.gobwarrior(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        bag1.setdropdead("heart");
        
        
    }
    
    
    
}




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r14 extends room {  
    
    
    
    private ladder ladder1;
    
    
    public r14( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, firedungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        ladder1 = new ladderup( 200, 500, constants.firedunfloor, this.weap3, this, constants.firedunladder );
        
        
        
        this.addplatform(ladder1);
        
        button b1 = new every.button(1100, 500, 20, Color.RED, weap3, w.r1_lock, this, false);
        
        this.addplatform(b1);
        
        button b2 = new every.button(1200, 500, 20, Color.BLUE, weap3, w.r7_lock, this, false);
        
        this.addplatform(b2);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new firehoverrobot(this, 500, 500 - 1, ai1);
        this.addbag(bag1);
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
}




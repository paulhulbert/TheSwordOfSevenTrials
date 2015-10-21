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
public class r7 extends room {  
    
    
    
    private ladder ladder1;
    
    
    public r7( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, firedungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        ladder1 = new ladderup( 900, 500, constants.firedunfloor, this.weap3, this, constants.firedunladder );
        
        
        
        this.addplatform(ladder1);
        
        platform l1 = new lockwall(1100, 500, 200, base, Color.BLUE, weap3, w.r7_lock, panel);
        
        this.addplatform(l1);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.heartblob(this, 1200, 500 - 1, ai1);
        this.addbag(bag1);
        bag1.setdropdead("heart");
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
}



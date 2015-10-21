/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r2 extends room2 {  
    
    private ladder ladder1;
    
    
    
    public r2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, speardungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        ladder1 = new ladderup( 900, 500, constants.speardunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder1);
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
//        platform lock1 = new lockwall(1100, 500, 200, base, Color.RED, weap3, w.r2_lock);
//        
//        this.addplatform(lock1);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new spearlauncher(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    
    
    
    
}





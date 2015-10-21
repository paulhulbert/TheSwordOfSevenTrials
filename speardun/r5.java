/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;


import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r5 extends room2 {  
    
    private ladder ladder1;
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, speardungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        ladder1 = new ladderup( 1000, 500, constants.speardunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder1);
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
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
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    
    
}





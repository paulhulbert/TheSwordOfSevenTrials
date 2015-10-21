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
public class r8 extends room2 {  
    
    private ladder ladder1;
    private ladder ladder2;
    
    public r8( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, speardungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new every.wall_left(base, weap3);
        this.addplatform(wall1);
        
        platform wall2 = new every.wall_right(base, weap3);
        this.addplatform(wall2);
        
        ladder1 = new ladderdown( 400, 500, constants.speardunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder1);
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
        
        platform lock1 = new lockwall(500, 500, 200, base, Color.RED, weap3, w.r8_lock1, panel);
        
        this.addplatform(lock1);
        
        platform lock2 = new lockwall(600, 500, 200, base, Color.BLUE, weap3, w.r8_lock2, panel);
        
        this.addplatform(lock2);
        
        
        ladder2 = new ladderup( 1100, 500, constants.speardunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder2);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new hoverrobot(this, 300, 500 - 1, ai1);
        this.addbag(bag1);
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    public void setladder2( room targ )
    {
        ladder2.setWarppoint(targ);
    }
    
    
}





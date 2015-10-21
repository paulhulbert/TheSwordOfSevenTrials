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
public class r7 extends room2 {  
    
    private ladder ladder1;
    
    public r7( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, speardungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new every.wall_left(base, weap3);
        this.addplatform(wall1);
        
        platform wall2 = new every.wall_right(base, weap3);
        this.addplatform(wall2);
        
        ladder1 = new ladderdown( 1000, 500, constants.speardunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder1);
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
        button b1 = new every.button(100, 500, 20, Color.BLUE, weap3, w.r8_lock2 , this, false);
        
        this.addplatform(b1);
        
        platform lock1 = new lockwall(400, 500, 200, base, Color.YELLOW, weap3, w.r3_lock, panel);
        
        this.addplatform(lock1);
        
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
    
    
    
}




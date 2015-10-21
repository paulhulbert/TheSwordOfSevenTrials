/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r4 extends room2 {  
    
    
    
    private ladder ladder1;
    private ladder ladder2;
    
    
    public r4( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, finaldungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w );
        
        
        
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        
        ladder1 = new ladderup( 550, 500, constants.gobdunfloor, this.weap3, this, constants.speardunladder );
        
        ladder2 = new ladderdown( 700, 500, constants.gobdunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder2);
        
        this.addplatform(ladder1);
        
        platform l1 = new lockwall(700, 480, 50, base, Color.BLUE, weap3, w.warp_vil_lock3, panel);
        platform l2 = new lockwall(700, 430, 50, base, Color.RED, weap3, w.warp_vil_lock4, panel);
        
        
        this.addplatform(l2);
        this.addplatform(l1);
        
        
        platform h1 = new hardblock(650, 430, 50, 70, base, Color.BLACK, false, weap3);
        
        platform h2 = new hardblock(750, 430, 50, 70, base, Color.BLACK, false, weap3);
        
        this.addplatform(h1);
        this.addplatform(h2);
        
        
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    public void setladder2( room targ ) {
        ladder2.setWarppoint(targ);
    }
    
}



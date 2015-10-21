/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowdun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r4 extends room {  
    
    
    
    private ladder ladder1;
    private ladder ladder2;
    
    
    public r4( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        ladder2 = new ladderdown( 610, 500, base, this.weap3, this, constants.bowdunlowladder );
        this.addplatform(ladder2);
        ladder2.setWarpx(1100);
        
        ladder1 = new ladderup( 1100, 500, constants.bowdunlowfloor, this.weap3, this, constants.bowdunlowladder );
        
        
        
        this.addplatform(ladder1);
        
        platform l1 = new lockwall(600, 480, 50, base, Color.BLUE, weap3, w.lock_2, panel);
        platform l2 = new lockwall(600, 430, 50, base, Color.RED, weap3, w.lock_1, panel);
        
        
        this.addplatform(l2);
        this.addplatform(l1);
        
        
        platform h1 = new hardblock(550, 430, 50, 70, base, Color.BLACK, false, weap3);
        
        platform h2 = new hardblock(650, 430, 50, 70, base, Color.BLACK, false, weap3);
        
        this.addplatform(h1);
        this.addplatform(h2);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.junglemonkeylizard(this, 1000, 500 - 1, ai1);
        this.addbag(bag1);
        
        AI ai2 = new basicai();
        ai2.settarget(mainchar);
        unit bag2 = new builders.junglemonkeylizard(this, 200, 500 - 1, ai2);
        this.addbag(bag2);
        
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



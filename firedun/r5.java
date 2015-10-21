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
public class r5 extends room {  
    
    private platform state1;
    
    
    private ladder ladder1;
    
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, firedungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        state1 = new platform( 700, 410, 50, 90, Color.BLACK, false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(720);
        state1.setSolid(false);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        
        ladder1 = new ladderup( 900, 500, constants.firedunfloor, this.weap3, this, constants.firedunladder );
        
        
        
        this.addplatform(ladder1);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new firehoverrobot(this, 300, 500 - 1, ai1);
        this.addbag(bag1);
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
    
}




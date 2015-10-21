/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;


import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r2 extends room2 {  
    
    private ladder ladder1;
    private platform state4;
    
    public r2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, firedungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        ladder1 = new ladderdown( 900, 500, base, this.weap3, this, constants.firedunladder );
        
        this.addplatform(ladder1);
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        state4 = new platform( 200, 410, 50, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state4.setSolid(false);
        state4.setWarppoint(this);
        state4.setWarps(true);
        state4.setWarpx(220);
        state4.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state4);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new flamethrower(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state4.setWarppoint(targ);
    }
    
}





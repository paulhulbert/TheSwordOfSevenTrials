/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r2 extends room2 {  
    
    private ladder ladder1;
    
    public r2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        ladder1 = new ladderdown( 700, 500, base, this.weap3, this, "LIGHT_GRAY" );
        
        this.addplatform(ladder1);
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.lightgob(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    
}






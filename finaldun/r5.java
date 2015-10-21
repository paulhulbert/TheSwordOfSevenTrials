/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r5 extends room2 {  
    
    private unit bag1;
    private boolean removed;
    
    private finaldungeon w;
    
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, finaldungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w );
        
        
        
        platform wall2 = new wall_right( base, weap3 );
        
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        bag1 = new builders.gobwizard(this, 1000, 500 - 1, ai1);
        this.addbag(bag1);
        
        AI ai2 = new basicai();
        ai2.settarget(mainchar);
        unit bag2 = new builders.gobmortar(this, 950, 500 - 1, ai2);
        this.addbag(bag2);
        
        bag1.settrigger(w.warp_vil_lock4);
        
        removed = false;
        
        this.w = w;
        
    }
    
    
    @Override
    public void resetroom()
    {
        
        if ( !removed && !w.warp_vil_lock4.gettrigger() ) {
            bags.remove(bag1);
            removed = true;
        }
        super.resetroom();
        
    }
    
    
    
    
}





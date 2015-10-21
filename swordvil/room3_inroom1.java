/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class room3_inroom1 extends insideroom {
    
    
    private trigger locked;
    
    
    private platform state1;
    public platform state2;
    private platform locker;
    
    private jpanel1 panel1;
    
    private unit guard;
    
    public room inroom1;  // load dungeon
    
    public room3_inroom1( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(250, 350, 580, 500);
        
        locked = new trigger( true );
        
        state1 = new platform( 300, 410, 80, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(320);
        state1.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state1);
        
        state2 = new platform( 480, 410, 50, 90, Color.black, false, this.getweap3() );
        
        state2.setSolid(false);
        state2.setWarppoint(this);
        state2.setWarps(false);
        state2.setWarpx(490);
        state2.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state2);
        
        locker = new platform( 480, 410, 50, 90, constants.brown, false, this.getweap3() );
        
        locker.setSolid(false);
        this.addplatform(locker);
        
        inroom1 = new room3_inroom1_inroom1( panel, platforms, bags, maincharacter );
        
        state2.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        
        guard = new unit( 100, 0, 5, "handsword", 480, 500 - 79, new noai(), this.getweap3(), this, 100, 140 );
        
        guard.setName("Head Guard");
        
        guard.setStatement("This is the Swordvil barracks.");
        guard.setStatement("You may not enter without permission.");
        guard.setStatement("You may try to get permission from the Elder.");
        
        builders.svil_headguard.build(guard);
        
        this.addneutral(guard);
        
        
        panel1 = panel;
        
    }
    
    
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    public void unlock()
    {
        locked.settrigger(false);
        getterrain().remove(locker);
        state2.setWarps(true);
        
    }
    
    @Override
    public void extrastuff( Graphics g )
    {
        if ( super.getpanel().getsavefile().room3_inroom1_locked.gettrigger() ) {
            unlock();
            guard.clearstatements();
            guard.setStatement("You may pass.");
        }
        
    }
    
}
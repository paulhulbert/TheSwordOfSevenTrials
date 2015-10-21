/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobdun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r3 extends room2 {  
    
    private ladder ladder1;
    
    private boolean addedboss;
    private boolean removedboss;
    private unit bag1;
    
    private gobdungeon w1;
    
    public r3( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform wall1 = new wall_left( constants.gobdunfloor, this.getweap3() );
        this.addplatform(wall1);
        
        ladder1 = new ladderup( 30, 150, constants.gobdunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy( 499 - constants.taldoheight() );
        
        addplatform(ladder1);
        
        w1 = w;
        addedboss = false;
        removedboss = false;
        
        platform plat1 = new platform( 600, 450, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 500, 400, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 400, 350, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 300, 300, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new platform( 200, 250, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        platform plat6 = new platform( 100, 200, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat6);
        
        platform plat7 = new platform( 26, 150, 54, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat7);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        bag1 = new gobdun_gobmortar(this, 1400, 500 - 1, ai1);
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    @Override
    public void resetroom()
    {
        
        super.resetroom();
        
        
        
    }
    
    
    @Override
    public void step(Graphics g)
    {
        super.step(g);
        
        
        
            if ( w1.bossisactive.gettrigger() && !addedboss ) {
                addbag(bag1);
                addedboss = true;
                
            }
        
        
        if ( !w1.bossisactive.gettrigger() && !removedboss && addedboss ) {
            removedboss = true;
            bags.remove(bag1);
        }
    }
}




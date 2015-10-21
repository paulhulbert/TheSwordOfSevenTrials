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
public class r7 extends room2 {  
    
    private ladder ladder1;
    
    
    private boolean addedboss;
    private boolean removedboss;
    private unit bag1;
    
    private gobdungeon w1;
    
    public r7( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform wall1 = new wall_right( constants.gobdunfloor, this.getweap3() );
        this.addplatform(wall1);
        
        ladder1 = new ladderup( 720, 150, constants.gobdunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy( 499 - constants.taldoheight() );
        
        addplatform(ladder1);
        
        
        platform plat1 = new platform( 1000, 450, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 900, 400, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 700, 150, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform mover1 = new platform( 800, 150, 80, 10, constants.gobdunfloor, true, this.getweap3());
        
        mover1.makestep(0, 6, 250, "blankweap");
        
        addplatform(mover1);
        
        
        w1 = w;
        addedboss = false;
        removedboss = false;
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        bag1 = new gobdun_gobmortar(this, 50, 300 - 1, ai1);
        bag1.setdir(2);
        bag1.getfig().setdir(1);
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
    
    @Override
    public void step(Graphics g)
    {
        super.step(g);
        
        
        g.setColor(background);
        
        g.fillRect(-5, 200, 200, 100);
        
        
        
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




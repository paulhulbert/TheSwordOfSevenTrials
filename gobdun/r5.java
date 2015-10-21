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
public class r5 extends room2 {  
    
    private ladder ladder2;
    
    private room downroom;
    private every.jpanel1 panel;
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        terrain.remove(0);
        
        downroom = this;
        
        
        this.panel = panel;
        
        platform ceiling1 = new ceiling( constants.gobdunfloor, weap3 );
        this.addplatform(ceiling1);
        
        ladder2 = new ladderdown( 1050, 500, constants.gobdunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder2.setWarpy( 199 - constants.taldoheight() );
        
        this.addplatform(ladder2);
        
        
        
        
        platform plat1 = new hardblock( 1000, 500, 200, 50, constants.gobdunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new hardblock( -100, 500, 190, 50, constants.gobdunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform mover1 = new platform( 100, 500, 80, 10, constants.gobdunfloor, true, this.getweap3());
        
        mover1.makestep(3, 0, 800, "blankweap");
        
        addplatform(mover1);
        
        
    }
    
    public void setladder2( room targ )
    {
        ladder2.setWarppoint(targ);
        downroom = targ;
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        
        
        if ( mainchar.gety() > 700 ) {
            mainchar.setroom(downroom);
            mainchar.sety(0);
            panel.setroom(downroom);
            online = false;
            downroom.onscreen(true);
        }
        
    }
}




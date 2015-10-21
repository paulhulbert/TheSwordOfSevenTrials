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
public class r4 extends room2 {  
    
    private ladder ladder1;
    private ladder ladder2;
    
    private room downroom;
    private every.jpanel1 panel;
    
    public r4( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        terrain.remove(0);
        
        downroom = this;
        
        
        this.panel = panel;
        
        platform wall1 = new wall_left( constants.gobdunfloor, this.getweap3() );
        this.addplatform(wall1);
        
        ladder1 = new ladderup( 1050, 200, constants.gobdunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy( 500 - constants.taldoheight() );
        
        addplatform(ladder1);
        
        ladder2 = new ladderdown( 30, 500, constants.gobdunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder2.setWarpy( 149 - constants.taldoheight() );
        
        this.addplatform(ladder2);
        
        
        
        
        platform plat1 = new hardblock( 26, 500, 124, 500, constants.gobdunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 1000, 500, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 900, 450, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 800, 400, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new platform( 700, 350, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        platform plat6 = new platform( 800, 300, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat6);
        
        platform plat7 = new platform( 900, 250, 80, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat7);
        
        platform plat8 = new platform( 1000, 200, 200, 40, constants.gobdunfloor, false, this.getweap3() );
        
        addplatform(plat8);
        
        platform mover1 = new platform( 200, 550, 80, 10, constants.gobdunfloor, true, this.getweap3());
        
        mover1.makestep(3, 0, 700, "blankweap");
        
        addplatform(mover1);
        
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
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




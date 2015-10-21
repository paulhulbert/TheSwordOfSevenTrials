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
public class r9 extends room2 {  
    
    private ladder ladder2;
    
    private room downroom;
    private every.jpanel1 panel;
    
    public r9( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        terrain.remove(0);
        
        downroom = this;
        
        
        this.panel = panel;
        
        platform ceiling1 = new ceiling( constants.gobdunfloor, weap3 );
        this.addplatform(ceiling1);
        
        ladder2 = new ladderdown( 620, 500, constants.gobdunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder2.setWarpy( 149 - constants.taldoheight() );
        
        this.addplatform(ladder2);
        
        
        
        
        platform plat1 = new hardblock( 600, 500, 200, 50, constants.gobdunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new hardblock( 350, 340, 100, 20, constants.gobdunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new hardblock( 1100, 200, 1000, 50, constants.gobdunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform mover1 = new platform( 125, 325, 100, 10, constants.gobdunfloor, true, this.getweap3());
        
        mover1.makestep(5, 3, 400, "blankweap");
        
        addplatform(mover1);
        
        platform mover2 = new platform( 460, 335, 100, 10, constants.gobdunfloor, true, this.getweap3());
        
        mover2.makestep(6, -1, 540, "blankweap");
        
        addplatform(mover2);
        
        
    }
    
    public void setladder( room targ )
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
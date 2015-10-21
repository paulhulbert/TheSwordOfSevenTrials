/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r7 extends room2 {  
    
    private ladder ladder1;
    private ladder ladder2;
    
    public r7( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform wall1 = new wall_left( Color.DARK_GRAY, this.getweap3() );
        this.addplatform(wall1);
        
        platform wall2 = new wall_right( Color.DARK_GRAY, this.getweap3() );
        this.addplatform(wall2);
        
        ladder1 = new ladderdown( 130, 500, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy(300 - constants.taldoheight());
        
        this.addplatform(ladder1);
        
        ladder2 = new ladderup( 1050, 250, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder2.setWarpy( 500 - constants.taldoheight() );
        
        this.addplatform(ladder2);
        
        platform plat1 = new hardblock( 300, 300, 50, 200, constants.sworddunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new hardblock( 500, 0, 50, 400, constants.sworddunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 250, 300, 50, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 700, 450, 50, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new platform( 750, 400, 50, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        platform plat6 = new platform( 700, 250, 700, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat6);
        
        platform mover1 = new platform( 100, 300, 100, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover1.makestep(0, 3, 150, "blankweap");
        
        addplatform(mover1);
        
        platform mover2 = new platform( 350, 300, 100, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover2.makestep(0, 3, 150, "blankweap");
        
        addplatform(mover2);
        
        platform mover3 = new platform( 550, 300, 100, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover3.makestep(0, 2, 60, "blankweap");
        
        addplatform(mover3);
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.heartblob(this, 1000, 500 - 1, ai1);
        this.addbag(bag1);
        bag1.setdropdead("heart");
        
        
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    public void setladder2( room targ )
    {
        ladder2.setWarppoint(targ);
    }
    
}




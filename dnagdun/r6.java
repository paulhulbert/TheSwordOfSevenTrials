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
public class r6 extends room2 {  
    
    private ladder ladder1;
    private ladder ladder2;
    
    
    public r6( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new wall_left( Color.DARK_GRAY, this.getweap3() );
        this.addplatform(wall1);
        
        platform wall2 = new wall_right( Color.DARK_GRAY, this.getweap3() );
        this.addplatform(wall2);
        
        ladder1 = new ladderdown( 1050, 500, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy(250 - constants.taldoheight());
        
        this.addplatform(ladder1);
        
        ladder2 = new ladderup( 100, 300, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder2.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(ladder2);
        
        
        platform plat1 = new platform( 1100, 450, 50, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 1000, 400, 50, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 1100, 350, 50, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 1000, 300, 50, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform mover1 = new platform( 250, 300, 80, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover1.makestep(3, 0, 650, "blankweap");
        
        addplatform(mover1);
        
        platform plat5 = new platform( 100, 300, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        
        
        
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        
        
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




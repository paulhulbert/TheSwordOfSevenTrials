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
public class r5 extends room2 {  
    
    private ladder ladder1;
    private ladder ladder2;
    
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
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
        
        
        platform plat1 = new platform( 200, 450, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 400, 400, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 600, 350, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 800, 300, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new platform( 1000, 250, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        AI ai1 = new constantattack();
        ai1.settarget(mainchar);
        unit bag1 = new builders.floatinggreenball(this, 600, 150 - 1, ai1);
        this.addbag(bag1);
        
        
        
        
        
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




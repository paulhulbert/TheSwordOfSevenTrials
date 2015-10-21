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
public class r4 extends room2 {  
    
    
    public r4( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new wall_right( Color.DARK_GRAY, this.getweap3() );
        this.addplatform(wall1);
        
        
        platform plat1 = new platform( -10, 300, 160, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 250, 300, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        
        platform plat3 = new platform( 450, 350, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 650, 400, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new platform( 850, 450, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        
        
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        AI ai1 = new constantattack();
        ai1.settarget(mainchar);
        unit bag1 = new builders.floatinggreenball(this, 500, 200 - 1, ai1);
        this.addbag(bag1);
        
        
        
    }
    
    
    
}




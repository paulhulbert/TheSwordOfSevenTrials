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
public class r3 extends room2 {  
    
    
    public r3( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform plat1 = new platform( -10, 300, 150, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        
        platform mover1 = new platform( 200, 300, 80, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover1.makestep(3, 0, 900, "blankweap");
        
        addplatform(mover1);
        
        
        platform plat2 = new platform( 1200, 300, 600, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new hardblock( -10, 450, 210, 50, constants.sworddunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat3);
        
        
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
    }
    
    
    
}




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
public class r1 extends room2 {  
    
    
    public r1( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform plat1 = new platform( -10, 300, 150, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 250, 300, 100, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform mover1 = new platform( 400, 300, 80, 10, constants.sworddunfloor, true, this.getweap3());
        
        mover1.makestep(0, 2, 100, "blankweap");
        
        addplatform(mover1);
        
        platform plat3 = new platform( 500, 400, 200, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 800, 300, 600, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new hardblock( 1100, 450, 600, 50, constants.sworddunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat5);
        
        unit sign1 = new sign( 900, 441, this.getweap3(), this, "No floor, watch your step." );
        
        this.addneutral(sign1);
        
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        
        
    }
    
    
    
}




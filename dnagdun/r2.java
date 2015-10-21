/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r2 extends room2 {  
    
    private int lastplat;
    
    
    public r2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        terrain.remove(0);
        
        lastplat = 1;
        
        platform nofloor = new platform( -10, 500, 1500, 400, Color.BLACK, false, this.getweap3() );
        
        nofloor.setSolid(false);
        
        addplatform(nofloor);
        
        platform plat1 = new platform( -10, 300, 150, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 200, 250, 200, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 450, 200, 200, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 700, 250, 200, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform plat5 = new platform( 950, 300, 450, 40, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat5);
        
        platform plat6 = new hardblock( -10, 450, 210, 750, constants.sworddunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat6);
        
        platform plat7 = new platform( 300, 450, 200, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat7);
        
        platform plat8 = new platform( 600, 450, 200, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat8);
        
        platform plat9 = new platform( 900, 450, 200, 50, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat9);
        
        platform plat10 = new hardblock( 1200, 450, 500, 750, constants.sworddunfloor, Color.BLACK, false, this.getweap3() );
        
        addplatform(plat10);
        
        
        
        platform ceiling1 = new ceiling( Color.DARK_GRAY, weap3 );
        this.addplatform(ceiling1);
        
        
        
        AI ai1 = new constantattack();
        ai1.settarget(mainchar);
        unit bag1 = new builders.floatinggreenball(this, 300, 350 - 1, ai1);
        this.addbag(bag1);
        
        AI ai2 = new constantattack();
        ai2.settarget(mainchar);
        unit bag2 = new builders.floatinggreenball(this, 700, 350 - 1, ai2);
        this.addbag(bag2);
        
        
        
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( mainchar.getcurrentplat() != -1 ) {
            lastplat = mainchar.getcurrentplat();
        }
        
        
        if ( mainchar.gety() > 700 ) {
            mainchar.setlife(mainchar.getlife() - 20);
            mainchar.setx(terrain.get(lastplat).getcenterx());
            mainchar.sety(terrain.get(lastplat).gety() - 100);
            mainchar.setmomentx(0);
            mainchar.setmomenty(0);
        }
        
    }
    
    
    
}




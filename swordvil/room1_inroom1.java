/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class room1_inroom1 extends insideroom {
    
    
    private platform state1;
    
    public room1_inroom1( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(300, 280, 900, 500);
        
        state1 = new platform( 600, 410, 80, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(640);
        state1.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state1);
        
        platform state2 = new hardblock( 400, 450, 40, 50, constants.darkbrown, Color.BLACK, false, this.getweap3() );
        
        this.addplatform(state2);
        
        
        unit barkeep = new swordvil.bartender(this, 350, 500);
        
        barkeep.setdir(2);
        
        addneutral(barkeep);
        
        unit man1 = new swordvil.innman1(this, 850, 500);
        
        addneutral(man1);
        
        unit man2 = new swordvil.innman2(this, 750, 500);
        
        addneutral(man2);
    }
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    
    @Override
    public void extrastuff( Graphics g )
    {
//        if ( mainchar.getcenterx() > 388 && mainchar.getcenterx() < 400 && ( mainchar.gety() + mainchar.getfig().getlength() ) > 449 ) {
//            mainchar.setcenterx(388);
//        }
//        
//        if ( mainchar.getcenterx() < 452 && mainchar.getcenterx() > 440 && ( mainchar.gety() + mainchar.getfig().getlength() ) > 450 ) {
//            mainchar.setcenterx(452);
//        }
        
    }
    
}
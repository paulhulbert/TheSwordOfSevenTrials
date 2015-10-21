/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class insidehouse extends insideroom {
    
    
    private platform state1;
    
    
    public insidehouse( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(200, 330, 500, 500);
        
        state1 = new platform( 320, 420, 50, 80, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(warpx);
        state1.setWarpy(warpy - constants.taldoheight());
        
        this.addplatform(state1);
        
        unit vil = new boringvil( this.getweap3(), this, 450, 500 - 79 );
        
        vil.setStatement("I am a Swordvil warrior.  Are you friend or foe?");
        
        this.addneutral(vil);
        
        
    }
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    
    
    

    @Override
    public void setWarpx(int warpx) {
        this.warpx = warpx;
        state1.setWarpx(warpx);
    }

    

    @Override
    public void setWarpy(int warpy) {
        this.warpy = warpy;
        state1.setWarpy(warpy - constants.taldoheight());
    }
    
    
    
    
    
}

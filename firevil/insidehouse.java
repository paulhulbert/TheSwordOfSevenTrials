/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

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
        
        state1 = new platform( 240, 420, 50, 80, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(warpx);
        state1.setWarpy(warpy - constants.taldoheight());
        
        this.addplatform(state1);
        
        unit vil = new vil4( weap3, this, 400, 500 - 77, maincharacter );
        
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


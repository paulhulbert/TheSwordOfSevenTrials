/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

public class insideguardhouse extends insideroom {
    
    
    private platform state1;
    
    
    public insideguardhouse( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(200, 330, 900, 500);
        
        state1 = new platform( 240, 420, 50, 80, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(warpx);
        state1.setWarpy(warpy - constants.taldoheight());
        
        this.addplatform(state1);
        
        
        unit k1 = new builders.knight(weap3, this, 700, 500 - 85 );
        k1.setName("Guard");
        k1.setStatement("Welcome to the guardhouse.");
        this.addneutral(k1);
        unit k2 = new builders.knight(weap3, this, 400, 500 - 85 );
        k2.setName("Guard");
        k2.setStatement("Welcome to the guardhouse.");
        this.addneutral(k2);
        unit k3 = new builders.knight(weap3, this, 500, 500 - 85 );
        k3.setName("Guard");
        k3.setStatement("Welcome to the guardhouse.");
        this.addneutral(k3);
        unit k4 = new builders.knight(weap3, this, 600, 500 - 85 );
        k4.setName("Guard");
        k4.setStatement("Welcome to the guardhouse.");
        this.addneutral(k4);
        
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


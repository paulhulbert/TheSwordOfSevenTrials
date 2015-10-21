/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class housetower2 extends insideroom {
    
    
    private platform state1;
    
    
    public housetower2( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, constants.brown, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(500, 300, 800, 500);
        
        state1 = new platform( 600, 410, 50, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(620);
        state1.setWarpy(300 - constants.taldoheight());
        
        this.addplatform(state1);
        
        
        
    }
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    
    
    
    
}


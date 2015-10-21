/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class insidehouse extends insideroom {
    
    private platform state1;
    
    public insidehouse( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, world w, room target )
    {
        super(panel, constants.brown, constants.darkbrown, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(540, 350, 720, 500);
        
        
        state1 = new platform( 640, 410, 50, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(target);
        state1.setWarps(true);
        state1.setWarpx(660);
        state1.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state1);
        
        unit vil = new housevil( weap3, this, 580, 500 - 79 );
        
        this.addneutral(vil);
        
        
    }
    
}

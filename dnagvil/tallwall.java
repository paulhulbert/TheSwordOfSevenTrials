/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class tallwall extends fieldbackroundroom {  
    
    
    
    public tallwall( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform state1 = new hardblock( 500, 200, 30, 300, constants.brown, constants.darkbrown, false, this.getweap3());
        
        this.addplatform( state1 );
        
        
        
    }
    
    
    
    
    
}



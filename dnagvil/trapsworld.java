/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class trapsworld extends world {
    
    public trapsworld( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room room0 = new normaltrap(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        room room1 = new firetrap(panel, constants.sky, constants.firevil, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        room room2 = new icetrap(panel, constants.sky, new Color( 204,255,255 ), blank1, blank2, mainperson, room1, null, null, this);
        
        room1.setrightroom(room2);
        
        room room3 = new dungeonportal(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room2, null, null, this);
        
        room2.setrightroom(room3);
        
        room3.setrightroom(room0);
        room0.setleftroom(room3);
        
    }
    
}

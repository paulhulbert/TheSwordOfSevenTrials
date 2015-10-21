/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import every.*;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class keepworld extends world {
    
    public keepworld( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room room0 = new portal_castle(panel, Color.GRAY, Color.DARK_GRAY, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        room room1 = new castle_entry(panel, Color.GRAY, Color.DARK_GRAY, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        room room2 = new front_court(panel, Color.GRAY, Color.DARK_GRAY, blank1, blank2, mainperson, room1, null, null, this);
        
        room1.setrightroom(room2);
        
        room room3 = new back_court(panel, Color.GRAY, Color.DARK_GRAY, blank1, blank2, mainperson, room2, null, null, this);
        
        room2.setrightroom(room3);
        
        room3.setrightroom(room0);
        room0.setleftroom(room3);
    }
    
}


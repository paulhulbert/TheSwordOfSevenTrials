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
public class castleworld extends world {
    
    public castleworld( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room room0 = new warp_field(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        
        room room1 = new market1(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        room room2 = new market2(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room1, null, null, this);
        
        room1.setrightroom(room2);
        
        room room3 = new market3(panel, Color.DARK_GRAY, constants.darkbrown, blank1, blank2, mainperson, room2, null, null, this);
        
        room2.setrightroom(room3);
        
        room room4 = new guardhouse(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room3, null, null, this);
        
        room3.setrightroom(room4);
        
        room room5 = new warp_castle(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room4, null, null, this);
        
        room4.setrightroom(room5);
        
        room room6 = new citystuff1(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room5, null, null, this);
        
        room5.setrightroom(room6);
        
        room room7 = new history_entry(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room6, null, null, this);
        
        room6.setrightroom(room7);
        
        room room8 = new citystuff2(panel, Color.GRAY, constants.brown, blank1, blank2, mainperson, room7, null, null, this);
        
        room7.setrightroom(room8);
        
        
        room8.setrightroom(room0);
        room0.setleftroom(room8);
        
    }
    
}

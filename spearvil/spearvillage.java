/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
/**
 *
 * @author Dad
 */
public class spearvillage extends world {
    
    public spearvillage( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room room0 = new warp_field(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, null, null, null);
        
        entry = room0;
        
        room room1 = new spearfaceleft(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room0, null, null, entry);
        
        room0.setrightroom(room1);
        
        housetower room3 = new housetower(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room1, null, null);
        
        room1.setrightroom(room3);
        
        room room4 = new phalanxfaceleft(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room3, null, null);
        
        room3.setrightroom(room4);
        
        room room5 = new spearplat(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room4, null, null, entry);
        
        room4.setrightroom(room5);
        
        room room6 = new phalanxfaceright(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room5, null, null);
        
        room5.setrightroom(room6);
        
        room room7 = new spearfaceright(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room6, null, null, entry);
        
        room6.setrightroom(room7);
        
        tavern room8 = new tavern(panel, constants.sky, constants.spearvil, blank1, blank2, mainperson, room7, null, null);
        
        room8.settrapdoor(room3);
        room3.settrapdoor(room8.getinroom());
        
        room7.setrightroom(room8);
        
        
        room0.setleftroom(room8);
        room8.setrightroom(room0);
        
        
        
        
    }
    
}

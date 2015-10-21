/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
/**
 *
 * @author Dad
 */
public class bowvillage extends world {
    
    
    public trigger openportal;
    
    public bowvillage( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        openportal = new trigger( false, "bowvil_bowvillage_openportal" );
        
        room room0 = new warp_field(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        room room1 = new arange(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        room room2 = new market(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, room1, null, null, this);
        
        room1.setrightroom(room2);
        
        room room3 = new treehouse(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, room2, null, null, this);
        
        room2.setrightroom(room3);
        
        room room4 = new dungeonplat(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, room3, null, null, this);
        
        room3.setrightroom(room4);
        
        room room5 = new Elderroom(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, room4, null, null, this);
        
        room4.setrightroom(room5);
        
        room room6 = new warp_tree(panel, constants.sky, constants.bowvil, blank1, blank2, mainperson, room5, null, null, this);
        
        room5.setrightroom(room6);
        
        room6.setrightroom(room0);
        room0.setleftroom(room6);
        
        
        
        
        
    }
    
}


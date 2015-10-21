/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;

/**
 *
 * @author Dad
 */
public class dnagvillage extends world {
    
    public dnagvillage( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room room0 = new warp_field(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        room room1 = new farm1(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        room room2 = new farmhouse(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room1, null, null, this);
        
        room1.setrightroom(room2);
        
        room room3 = new barn(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room2, null, null, this);
        
        room2.setrightroom(room3);
        
        room room4 = new farm1(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room3, null, null, this);
        
        room3.setrightroom(room4);
        
        room room5 = new farmstand(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room4, null, null, this);
        
        room4.setrightroom(room5);
        
        room room6 = new dungeonplat(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room5, null, null, this);
        
        room5.setrightroom(room6);
        
        room room7 = new tallwall(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room6, null, null, this);
        
        room6.setrightroom(room7);
        
        room room8 = new farm1(panel, constants.sky, constants.dnagvil, blank1, blank2, mainperson, room7, null, null, this);
        
        room7.setrightroom(room8);
        
        room8.setrightroom(room0);
        room0.setleftroom(room8);
        
        
        
        world trapvil = new trapsworld(mainperson, pan);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        room6.setwarproom(trapvil.getentry());
        trapvil.setexit(room6);
        
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;

import every.*;
/**
 *
 * @author Dad
 */
public class swordvillage extends world {
    
    public swordvillage( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room sword_room0 = new swordvil.warp_field(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, null, null, null);
        
        entry = sword_room0;
        
        
        room sword_room1 = new swordvil.room1(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, sword_room0, null, null);
        
        sword_room0.setrightroom(sword_room1);
        
        
        room room2 = new swordvil.room2(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, sword_room1, null, null);
        
        sword_room1.setrightroom(room2);
        
        room room3 = new swordvil.room3(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, room2, null, null);
        
        room2.setrightroom(room3);
        
        room room4 = new swordvil.room4and5(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, room3, null, null);
        
        room3.setrightroom(room4);
        
        room room5 = new swordvil.room4and5(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, room4, null, null);
        
        room4.setrightroom(room5);
        
        room room6 = new swordvil.swordstatue(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, room5, null, null);
        
        room5.setrightroom(room6);
        
        room room7 = new swordvil.townsquare(panel, constants.sky, constants.swordvil, blank1, blank2, mainperson, room6, null, null);
        
        room6.setrightroom(room7);
        
        room7.setrightroom(sword_room0);
        
        sword_room0.setleftroom(room7);
        
        
        
        
    }
    
}

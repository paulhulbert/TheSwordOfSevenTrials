/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penvil;

import every.*;

/**
 *
 * @author Dad
 */
public class penvillage extends world {
    
    public penvillage( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        room room0 = new warp_field(panel, constants.sky, constants.penvil, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        room room1 = new monsters(panel, constants.sky, constants.penvil, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        room room2 = new museumentry(panel, constants.sky, constants.penvil, blank1, blank2, mainperson, room1, null, null, this);
        
        room1.setrightroom(room2);
        
        dungeonplat room3 = new dungeonplat(panel, constants.sky, constants.penvil, blank1, blank2, mainperson, room2, null, null, this);
        room3.setwarproom();
        room2.setrightroom(room3);
        
        room room4 = new townsquare(panel, constants.sky, constants.penvil, blank1, blank2, mainperson, room3, null, null, this);
        
        room3.setrightroom(room4);
        
        room room5 = new monsters2(panel, constants.sky, constants.penvil, blank1, blank2, mainperson, room4, null, null, this);
        
        room4.setrightroom(room5);
        
        room5.setrightroom(room0);
        room0.setleftroom(room5);
    }
    
}

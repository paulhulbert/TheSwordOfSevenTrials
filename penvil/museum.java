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
public class museum extends world {
    
    public museum( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        room room0 = new muse1(panel, constants.brown, constants.darkbrown, blank1, blank2, mainperson, null, null, null, this);
        
        entry = room0;
        
        room room1 = new muse2(panel, constants.brown, constants.darkbrown, blank1, blank2, mainperson, room0, null, null, this);
        
        room0.setrightroom(room1);
        
        
        room1.setrightroom(room0);
        room0.setleftroom(room1);
        
    }
    
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddun;

import every.*;
/**
 *
 * @author Dad
 */
public class sworddungeon extends world {
    
    
    
    public platform lock_r4;
    
    public trigger r4_lock;
    public trigger r8_lock;
    
    public sworddungeon( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        r4_lock = new trigger( true, "sworddungeon_r4_lock" );
        r8_lock = new trigger( true, "sworddun_sworddungeon_r8_lock" );
        
        room room0 = new warp_vil(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null);
        
        entry = room0;
        
        room ro2 = new r2(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        room0.setladder(ro2);
        ro2.setladder(room0);
        
        room ro3 = new r3(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro2.setrightroom(ro3);
        ro3.setleftroom(ro2);
        
        
        room ro4 = new r4(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro3.setladder(ro4);
        ro4.setladder(ro3);
        
        room ro5 = new r5(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro5.setrightroom(ro4);
        ro4.setleftroom(ro5);
        
        room ro6 = new r6(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro4.setrightroom(ro6);
        ro6.setleftroom(ro4);
        
        r7 ro7 = new r7(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro6.setladder(ro7);
        ro7.setladder(ro6);
        
        room ro8 = new r8(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro7.setladder2(ro8);
        ro8.setladder(ro7);
        
        room ro9 = new r9(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro9.setrightroom(ro8);
        ro8.setleftroom(ro9);
        
        room bossr = new bossroom(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, ro2, null, null, this);
        
        ro8.setrightroom(bossr);
        bossr.setleftroom(ro8);
    }
    
}
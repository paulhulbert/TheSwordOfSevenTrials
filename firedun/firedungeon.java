/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;

import every.*;

/**
 *
 * @author Dad
 */
public class firedungeon extends world {
    
    
    public trigger r1_lock;
    
    public trigger r7_lock;
    
    public firedungeon( unit mainchar, jpanel1 panel )
    {
        super( mainchar, panel );
        
        r1_lock = new trigger( true, "firedun_firedungeon_r1_lock" );
        r7_lock = new trigger( true, "firedun_firedungeon_r7_lock" );
        
        entry = new warp_vil(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        room ro2 = new r2(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        entry.setladder(ro2);
        ro2.setladder(entry);
        
        room ro3 = new r3(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro2.setwarproom(ro3);
        ro3.setwarproom(ro2);
        
        room ro4 = new r4(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro4.setleftroom(ro3);
        ro3.setrightroom(ro4);
        
        room ro5 = new r5(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro5.setladder(ro4);
        ro4.setladder(ro5);
        
        room ro6 = new r6(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro6.setwarproom(ro5);
        ro5.setwarproom(ro6);
        
        room ro7 = new r7(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro7.setleftroom(ro6);
        ro6.setrightroom(ro7);
        
        r8 ro8 = new r8(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro8.setladder(ro7);
        ro7.setladder(ro8);
        
        r9 ro9 = new r9(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro9.setladder(ro8);
        ro8.setladder2(ro9);
        
        room ro10 = new r10(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro9.setladder2(ro10);
        ro10.setladder(ro9);
        
        room ro11 = new r11(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro11.setleftroom(ro10);
        ro10.setrightroom(ro11);
        
        r12 ro12 = new r12(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro12.setladder2(ro11);
        ro11.setladder(ro12);
        
        r13 ro13 = new r13(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro13.setladder2(ro12);
        ro12.setladder(ro13);
        
        room ro14 = new r14(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro13.setladder(ro14);
        ro14.setladder(ro13);
        
        ro14.setleftroom(ro7);
        ro7.setrightroom(ro14);
        
        room broom = new bossroom(panel, constants.firedunwall, constants.firedunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        
        entry.setleftroom(broom);
        broom.setrightroom(entry);
        
    }
    
}

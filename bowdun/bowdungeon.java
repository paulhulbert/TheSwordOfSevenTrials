/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowdun;

import every.*;

/**
 *
 * @author Dad
 */
public class bowdungeon extends world {
    
    public trigger lock_1;  // Lock to get to the boss
    public trigger lock_2;  // Lock2 to get to the boss
    public trigger lock_3;  // Lock in r14
    
    public bowdungeon( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        lock_1 = new trigger(true, "bowdun_bowdungeon_lock_1");
        lock_2 = new trigger(true, "bowdun_bowdungeon_lock_2");
        lock_3 = new trigger(true, "bowdun_bowdungeon_lock_3");
        
        entry = new warp_vil(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, null, null, null, this);
        
        room ro2 = new r2(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro2.setleftroom(entry);
        entry.setrightroom(ro2);
        
        room ro3 = new r3(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro2.setladder(ro3);
        ro3.setladder(ro2);
        
        r4 ro4 = new r4(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro4.setleftroom(ro3);
        ro3.setrightroom(ro4);
        
        room ro5 = new r5(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro5.setleftroom(ro4);
        ro4.setrightroom(ro5);
        
        room ro6 = new r6(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro5.setladder(ro6);
        ro6.setladder(ro5);
        
        room ro7 = new r7(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro7.setleftroom(ro6);
        ro6.setrightroom(ro7);
        
        r8 ro8 = new r8(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro4.setladder(ro8);
        ro8.setladder(ro4);
        
        r9 ro9 = new r9(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro9.setladder(ro8);
        ro8.setladder2(ro9);
        
        r10 ro10 = new r10(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro9.setladder2(ro10);
        ro10.setladder(ro9);
        
        r11 ro11 = new r11(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro10.setladder3(ro11);
        ro11.setladder(ro10);
        
        r12 ro12 = new r12(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro12.setladder(ro11);
        ro11.setladder2(ro12);
        
        r13 ro13 = new r13(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro10.setladder2(ro13);
        ro13.setladder(ro10);
        
        r14 ro14 = new r14(panel, constants.bowdunwall, constants.bowdunfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        ro14.setladder(ro13);
        ro13.setladder2(ro14);
        
        bossroom broom = new bossroom(panel, constants.bowdunlowwall, constants.bowdunlowfloor, blank1, blank2, mainchar, entry, entry, entry, this);
        
        broom.setladder(ro4);
        ro4.setladder2(broom);
    }
    
}

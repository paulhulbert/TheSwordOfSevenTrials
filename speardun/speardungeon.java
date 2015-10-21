/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;

import every.*;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class speardungeon extends world {
    
    public trigger r3_lock;
    public trigger r8_lock1;
    public trigger r8_lock2;
    
    public speardungeon( unit mainchar, jpanel1 panel )
    {
        super( mainchar, panel );
        
        r3_lock = new trigger(true, "speardun_speardungeon_r3_lock");
        r8_lock1 = new trigger(true, "speardun_speardungeon_r8_lock1");
        r8_lock2 = new trigger(true, "speardun_speardungeon_r8_lock2");
        
        
        entry = new warp_vil(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, null, null, null);
        
        room ro2 = new r2(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        entry.setrightroom(ro2);
        ro2.setleftroom(entry);
        
        room ro3 = new r3(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro3.setladder(ro2);
        ro2.setladder(ro3);
        
        room ro4 = new r4(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro2.setrightroom(ro4);
        ro4.setleftroom(ro2);
        
        room ro5 = new r5(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro4.setrightroom(ro5);
        ro5.setleftroom(ro4);
        
        room ro6 = new r6(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro5.setrightroom(ro6);
        ro6.setleftroom(ro5);
        
        room ro7 = new r7(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro7.setladder(ro5);
        ro5.setladder(ro7);
        
        r8 ro8 = new r8(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro8.setladder(ro4);
        ro4.setladder(ro8);
        
        room broom = new bossroom(panel, constants.speardunwall, constants.speardunfloor, blank1, blank2, mainchar, entry, null, null, this);
        
        ro8.setladder2(broom);
        broom.setladder(ro8);
    }
    
}

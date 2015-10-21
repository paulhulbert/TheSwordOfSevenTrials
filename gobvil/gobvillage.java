/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobvil;


import every.*;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class gobvillage extends world {
    
    
    public gobvillage( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        entry = new warp_field(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r1 ro1 = new r1(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        entry.setladder(ro1);
        ro1.setladder2(entry);
        
        room ro2 = new r2(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro2.setleftroom(ro1);
        ro1.setrightroom(ro2);
        
        r3 ro3 = new r3(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro3.setladder2(ro2);
        ro2.setladder(ro3);
        
        room ro4 = new r4(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro4.setladder(ro3);
        ro3.setladder(ro4);
        
        room d_plat = new dungeon_plat(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        d_plat.setleftroom(ro4);
        ro4.setrightroom(d_plat);
        
        room ro5 = new r5(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro1.setleftroom(ro5);
        ro5.setrightroom(ro1);
        
        r6 ro6 = new r6(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro6.setladder2(ro5);
        ro5.setladder(ro6);
        
        r7 ro7 = new r7(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro6.setladder(ro7);
        ro7.setladder(ro6);
        
        room ro8 = new r8(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro8.setladder(ro7);
        ro7.setladder2(ro8);
        
        throne_warp t_warp = new throne_warp(panel, Color.gray, Color.DARK_GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        ro8.setleftroom(t_warp);
        t_warp.setrightroom(ro8);
    }
    
}

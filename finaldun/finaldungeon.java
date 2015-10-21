/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

import every.*;

/**
 *
 * @author Dad
 */
public class finaldungeon extends world {
    
    
    public trigger warp_vil_lock1;
    public trigger warp_vil_lock2;
    public trigger warp_vil_lock3;
    public trigger warp_vil_lock4;
    public trigger warp_vil_lock5;
    public trigger warp_vil_lock6;
    
    
    public finaldungeon( unit mainchar, jpanel1 panel )
    {
        super( mainchar, panel );
        
        warp_vil_lock1 = new trigger( true );
        warp_vil_lock2 = new trigger( true );
        warp_vil_lock3 = new trigger( true );
        warp_vil_lock4 = new trigger( true );
        warp_vil_lock5 = new trigger( true );
        warp_vil_lock6 = new trigger( true );
        
        entry = new warp_vil(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        r1 ro1 = new r1(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        entry.setleftroom(ro1);
        ro1.setrightroom(entry);
        
        r2 ro2 = new r2(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        entry.setrightroom(ro2);
        ro2.setleftroom(entry);
        
        r3 ro3 = new r3(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        
        r4 ro4 = new r4(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        entry.setladder(ro4);
        ro4.setladder(entry);
        
        ro4.setleftroom(ro3);
        ro3.setrightroom(ro4);
        
        r5 ro5 = new r5(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro4.setrightroom(ro5);
        ro5.setleftroom(ro4);
        
        
        r6 ro6 = new r6(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        
        r7 ro7 = new r7(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro4.setladder2(ro7);
        ro7.setladder(ro4);
        
        ro7.setleftroom(ro6);
        ro6.setrightroom(ro7);
        
        r8 ro8 = new r8(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro7.setrightroom(ro8);
        ro8.setleftroom(ro7);
        
        r9 ro9 = new r9(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro7.setladder2(ro9);
        ro9.setladder(ro7);
        
        bossroom broom = new bossroom(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro9.setrightroom(broom);
        broom.setleftroom(ro9);
        
        
        ro1.resetroom();
        ro2.resetroom();
        ro3.resetroom();
        ro4.resetroom();
        ro5.resetroom();
        ro6.resetroom();
        ro7.resetroom();
        ro8.resetroom();
        ro9.resetroom();
        
        
    }
    
}

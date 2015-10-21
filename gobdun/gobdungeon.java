/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobdun;

import every.*;
/**
 *
 * @author Dad
 */
public class gobdungeon extends world {
    
    public int bosslife;
    
    public trigger mainlock_1;
    public trigger mainlock_2;
    public trigger mainlock_3;
    
    public room warpplace;
    
    public trigger bossisactive;
    
    public gobdungeon( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        mainlock_1 = new trigger( true, "gobdun_gobdungeon_mainlock_1" );
        mainlock_2 = new trigger( true, "gobdun_gobdungeon_mainlock_2" );
        mainlock_3 = new trigger( true, "gobdun_gobdungeon_mainlock_3" );
        
        bossisactive = new trigger(false);
        
        bosslife = 7;
        
        warp_vil room0 = new warp_vil(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        constants.gobdun_bossroom = room0;
        warpplace = room0;
        
        room2 ro1 = new r1(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        room2 ro2 = new r2(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro1.setladder(ro2);
        ro2.setladder(room0);
        
        entry = ro1;
        
        room2 ro3 = new r3(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro3.setrightroom(room0);
        room0.setleftroom(ro3);
        
        r4 ro4 = new r4(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro3.setladder(ro4);
        ro4.setladder2(ro3);
        ro4.setrightroom(ro2);
        ro2.setleftroom(ro4);
        
        r5 ro5 = new r5(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro4.setladder(ro5);
        ro5.setladder2(ro4);
        ro5.setrightroom(ro1);
        ro1.setleftroom(ro5);
        
        room2 ro6 = new r6(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro6.setrightroom(ro5);
        ro5.setleftroom(ro6);
        
        room2 ro7 = new r7(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        room0.setrightroom(ro7);
        ro7.setleftroom(room0);
        
        r8 ro8 = new r8(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro7.setladder(ro8);
        ro8.setladder2(ro7);
        ro2.setrightroom(ro8);
        ro8.setleftroom(ro2);
        
        r9 ro9 = new r9(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro9.setladder(ro8);
        ro8.setladder(ro9);
        ro1.setrightroom(ro9);
        ro9.setleftroom(ro1);
        
        room2 ro10 = new r10(panel, constants.gobdunwall, constants.gobdunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro9.setrightroom(ro10);
        ro10.setleftroom(ro9);
        
    }
    
    
    @Override
    public void setexit( room r )
    {
        warpplace.setwarproom(r);
    }
    
}
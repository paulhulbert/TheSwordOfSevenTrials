/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;


import every.*;
/**
 *
 * @author Dad
 */
public class dnagdungeon extends world {
    
    
    
    
    public dnagdungeon( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        room room0 = new warp_vil(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null);
        
        entry = room0;
        
        room2 ro1 = new r1(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        entry.setrightroom(ro1);
        ro1.setleftroom(entry);
        
        room2 ro2 = new r2(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro1.setrightroom(ro2);
        ro2.setleftroom(ro1);
        
        room2 ro3 = new r3(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro2.setrightroom(ro3);
        ro3.setleftroom(ro2);
        
        room2 ro4 = new r4(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro3.setrightroom(ro4);
        ro4.setleftroom(ro3);
        
        r5 ro5 = new r5(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro5.setladder(entry);
        entry.setladder(ro5);
        
        r6 ro6 = new r6(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro6.setladder(ro5);
        ro5.setladder2(ro6);
        
        r7 ro7 = new r7(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        ro7.setladder(ro6);
        ro6.setladder2(ro7);
        
        bossroom broom = new bossroom(panel, constants.sworddunwall, constants.sworddunfloor, blank1, blank2, mainchar, null, null, null, this);
        
        broom.setladder(ro7);
        ro7.setladder2(broom);
    }
    
}
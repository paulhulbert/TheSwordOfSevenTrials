/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sostrooms;

import every.*;
import java.awt.Color;

/**
 *
 * @author Dad
 */
public class sostworld extends world {
    
    public trigger hitsword;
    public trigger hitspear;
    public trigger hitbow;
    public trigger hitfire;
    public trigger hitdnag;
    public trigger hitgob;
    public trigger hithammer;
    
    public sostworld( unit mainchar, jpanel1 pan )
    {
        super( mainchar, pan );
        
        
        
        
        hitsword = new trigger( false );
        hitspear = new trigger( false );
        hitbow = new trigger( false );
        hitfire = new trigger( false );
        hitdnag = new trigger( false );
        hitgob = new trigger( false );
        hithammer = new trigger( false );
        
        entry = new warp_field(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        swordroom r1 = new swordroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        entry.setrightroom(r1);
        r1.setleftroom(entry);
        
        spearroom r2 = new spearroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r1.setrightroom(r2);
        r2.setleftroom(r1);
        
        bowroom r3 = new bowroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r2.setrightroom(r3);
        r3.setleftroom(r2);
        
        fireroom r4 = new fireroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r3.setrightroom(r4);
        r4.setleftroom(r3);
        
        dnagroom r5 = new dnagroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r4.setrightroom(r5);
        r5.setleftroom(r4);
        
        gobroom r6 = new gobroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r5.setrightroom(r6);
        r6.setleftroom(r5);
        
        hammerroom r7 = new hammerroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r6.setrightroom(r7);
        r7.setleftroom(r6);
        
        sostroom r8 = new sostroom(panel, Color.LIGHT_GRAY, Color.GRAY, blank1, blank2, mainchar, null, null, null, this);
        
        r7.setrightroom(r8);
        r8.setleftroom(r7);
        
    }
    
}
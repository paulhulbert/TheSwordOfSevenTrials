/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class housetower extends room {  
    
    private platform state9;
    
    
    public housetower( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        platform state1 = new platform( 500, 300, 300, 200, constants.brown, false, this.getweap3() );
        
        
        
        addplatform(state1);
        
        platform state2 = new platform( 500, 100, 300, 200, constants.brown, false, this.getweap3() );
        
        
        
        addplatform(state2);
        
        platform state3 = new platform( 500, 300, 300, 5, constants.darkbrown, false, this.getweap3() );
        
        
        
        addplatform(state3);
        
        platform state4 = new platform( 600, 410, 50, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state4.setSolid(false);
        state4.setWarppoint(this);
        state4.setWarps(true);
        state4.setWarpx(620);
        state4.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state4);
        
        room inroom1 = new housetower1(panel, platforms, bags, maincharacter );
        
        
        
        state4.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        platform state5 = new platform( 600, 210, 50, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state5.setSolid(false);
        state5.setWarppoint(this);
        state5.setWarps(true);
        state5.setWarpx(620);
        state5.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state5);
        
        room inroom2 = new housetower2(panel, platforms, bags, maincharacter );
        
        
        
        state5.setWarppoint(inroom2);
        inroom2.setwarproom(this);
        
        
        
        
        
        
        
        platform stair1 = new platform( 400, 450, 50, 10, constants.darkbrown, false, this.getweap3() );
        
        
        
        addplatform(stair1);
        
        platform stair2 = new platform( 450, 400, 50, 10, constants.darkbrown, false, this.getweap3() );
        
        
        
        addplatform(stair2);
        
        platform stair3 = new platform( 400, 350, 50, 10, constants.darkbrown, false, this.getweap3() );
        
        
        
        addplatform(stair3);
        
        platform stair4 = new platform( 450, 300, 50, 10, constants.darkbrown, false, this.getweap3() );
        
        
        
        addplatform(stair4);
        
        platform stair5 = new platform( 380, 300, 20, 200, constants.darkbrown, false, this.getweap3() );
        
        
        
        addplatform(stair5);
        
        state9 = new platform( 240, 499, 80, 1, constants.brown, false, this.getweap3() );
        
        state9.setSolid(false);
        state9.setWarppoint(this);
        state9.setWarps(true);
        state9.setWarpx(300);
        state9.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state9);
        
        
    }
    
    public void settrapdoor( room r )
    {
        state9.setWarppoint(r);
    }
    
    
    
    
    
}

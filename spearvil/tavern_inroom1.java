/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class tavern_inroom1 extends insideroom {
    
    
    private platform state1;
    private platform state9;
    
    
    private blueweasel blue;
    private louis lo;
    
    private boolean ontable1 = false;
    private boolean ontable2 = false;
    
    public tavern_inroom1( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, constants.brown, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(100, 280, 900, 500);
        
        
        state1 = new platform( 600, 410, 80, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(640);
        state1.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state1);
        
        platform state2 = new platform( 400, 450, 60, 50, constants.darkbrown, false, this.getweap3() );
        
        this.addplatform(state2);
        
        platform state3 = new platform( 200, 450, 60, 50, constants.darkbrown, false, this.getweap3() );
        
        this.addplatform(state3);
        
        state9 = new platform( 280, 499, 80, 1, constants.brown, false, this.getweap3() );
        
        state9.setSolid(false);
        state9.setWarppoint(this);
        state9.setWarps(false);
        state9.setWarpx(240);
        state9.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state9);
        
        blue = new blueweasel( weap3, this, 180, 500 - 68 );
        this.addneutral(blue);
        
        unit goldi = new goldie( weap3, this, 300, 500 - 85 );
        this.addneutral(goldi);
        
        lo = new louis( weap3, this, 370, 500 - 85 );
        this.addneutral(lo);
        
    }
    
    @Override
    public void settrapdoor( room r )
    {
        state9.setWarppoint(r);
    }
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    @Override
    public void extrainit()
    {
        ontable1 = false;
        ontable2 = false;
        if ( getpanel().getsavefile().gettrigger("spearvil_blueweasel_spoke").gettrigger() ) {
            state9.setWarps(true);
        }
        blue.untable();
        lo.untable();
        
    }
    
    @Override
    public void paintextraover( Graphics g )
    {
        super.paintextraover(g);
        
    }
    
    
    @Override
    public void extrastuff( Graphics g )
    {
        
        if ( mainchar.getcurrentplat() == 1 && !ontable1 ) {
            ontable1 = true;
            lo.table();
        }
        
        if ( mainchar.getcurrentplat() == 3 && !ontable2 ) {
            ontable2 = true;
            blue.table();
        }
        
        if ( getpanel().getsavefile().gettrigger("spearvil_blueweasel_spoke").gettrigger() ) {
            state9.setWarps(true);
        }
        
    }
    
}

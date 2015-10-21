/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class spearplat extends resroomclass {  
    
    
    public spearplat( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, room r )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, r);
        
        
        platform base1 = new hardblock( 400, 450, 500, 50, Color.GRAY, Color.BLACK, false, this.getweap3() );
        
        this.addplatform(base1);
        
        platform base2 = new hardblock( 500, 400, 300, 50, Color.GRAY, Color.BLACK, false, this.getweap3() );
        
        this.addplatform(base2);
        
        platform plat1 = new platform( 550, 300, 200, 100, constants.darkbrown, false, this.getweap3() );
        
        this.addplatform(plat1);
        
        platform state1 = new platform( 620, 310, 50, 90, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(640);
        state1.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state1);
        
        room inroom1 = new spearplat_inroom1( panel, platforms, bags, maincharacter );
        
        state1.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        
        weapon spearleft = new steadyspear( 410, 430, -1 );
        
        weap3.add(spearleft);
        
        weapon spearright = new steadyspear( 890, 430, 1 );
        
        weap3.add(spearright);
        
        weapon spearleft2 = new steadyspear( 580, 380, -1 );
        
        weap3.add(spearleft2);
        
        weapon spearright2 = new steadyspear( 720, 380, 1 );
        
        weap3.add(spearright2);
        
        unit signpost = new sign( 100, 441, this.getweap3(), this, "BEWARE POISON SPEARS.  They will kill you very quickly." );
        
        this.addneutral(signpost);
        
        unit signpost2 = new sign( 1100, 441, this.getweap3(), this, "BEWARE POISON SPEARS.  They will kill you very quickly." );
        
        this.addneutral(signpost2);
        
        
    }
    
    
    @Override
    public void extrainit()
    {
        weapon spearleft = new steadyspear( 410, 430, -1 );
        
        weap3.add(spearleft);
        
        weapon spearright = new steadyspear( 890, 430, 1 );
        
        weap3.add(spearright);
        
        weapon spearleft2 = new steadyspear( 580, 380, -1 );
        
        weap3.add(spearleft2);
        
        weapon spearright2 = new steadyspear( 720, 380, 1 );
        
        weap3.add(spearright2);
    }
    
    
    
    
    
}



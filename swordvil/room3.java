/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swordvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class room3 extends room {  
    
    platform state1;
    
    public room3( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        platform state2 = new platform( -20, 200, 600, 300, Color.GRAY, false, this.getweap3() );
        
        addplatform(state2);
        
        state1 = new platform( 300, 410, 80, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(340);
        state1.setWarpy(500 - constants.taldoheight());
        
        addplatform(state1);
        
        room inroom1 = new room3_inroom1( panel, platforms, bags, maincharacter );
        
        state1.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
    }
    
    
}


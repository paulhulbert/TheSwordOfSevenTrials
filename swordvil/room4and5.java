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
public class room4and5 extends room {  
    
    private platform state1;
    private platform state3;
    
    
    
    public room4and5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        platform state2 = new platform( 100, 330, 300, 170, Color.GRAY, false, this.getweap3() );
        
        addplatform(state2);
        
        state1 = new platform( 220, 420, 50, 80, Color.BLACK, false, this.getweap3() );
        
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(340);
        state1.setWarpy(500 - constants.taldoheight());
        
        addplatform(state1);
        
        room inroom1 = new insidehouse( panel, platforms, bags, maincharacter );
        
        inroom1.setWarpx(240);
        inroom1.setWarpy(500);
        
        state1.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        
        
        
        
        platform state4 = new platform( 600, 330, 300, 170, Color.GRAY, false, this.getweap3() );
        
        addplatform(state4);
        
        state3 = new platform( 720, 420, 50, 80, Color.BLACK, false, this.getweap3() );
        
        
        state3.setSolid(false);
        state3.setWarppoint(this);
        state3.setWarps(true);
        state3.setWarpx(340);
        state3.setWarpy(500 - constants.taldoheight());
        
        
        
        addplatform(state3);
        
        room inroom2 = new insidehouse( panel, platforms, bags, maincharacter );
        
        state3.setWarppoint(inroom2);
        inroom2.setwarproom(this);
        inroom2.setWarpx(740);
        inroom2.setWarpy(500);
        
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
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
public class tavern extends room {  
    
    private platform state1;
    private room room1;
    
    public tavern( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 600, 410, 80, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(640);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        platform state2 = new platform( 100, 280, 800, 220, Color.GRAY, false, this.getweap3() );
        
        addplatform(state2);
        addplatform(state1);
        
        
        
        room1 = new tavern_inroom1( panel, platforms, bags, maincharacter );
        
        state1.setWarppoint(room1);
        room1.setwarproom(this);
        
        
    }
    
    public room getinroom()
    {
        return room1;
    }
    
    @Override
    public void settrapdoor( room r )
    {
        room1.settrapdoor(r);
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextraover( Graphics g )
    {
        
        
        
        
    }
    
    
}


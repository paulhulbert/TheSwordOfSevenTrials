/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class house extends room2 {  
    
    private platform state1;
    
    
    
    public house( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform state2 = new platform( 200, 330, 300, 170, Color.GRAY, false, this.getweap3() );
        
        addplatform(state2);
        
        state1 = new platform( 240, 420, 50, 80, Color.BLACK, false, this.getweap3() );
        
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(260);
        state1.setWarpy(500 - constants.taldoheight());
        
        addplatform(state1);
        
        room inroom1 = new insidehouse( panel, platforms, bags, maincharacter );
        
        inroom1.setWarpx(260);
        inroom1.setWarpy(500);
        
        state1.setWarppoint(inroom1);
        inroom1.setwarproom(this);
        
        
        
        
        
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class treehouse extends room2 {  
    
    
    private ImageIcon tree;
    private platform state1;
    
    public treehouse( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        
        
        state1 = new platform( 640, 410, 50, 90, Color.BLACK, false, this.getweap3() );
        
        
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(660);
        state1.setWarpy(500 - constants.taldoheight());
        addplatform(state1);
        
        
        room room1 = new insidehouse( panel, platforms, bags, maincharacter, w, this );
        
        state1.setWarppoint(room1);
        
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        g.drawImage(tree.getImage(), 330, 100, 620, 405, null);
    }
    
    
}


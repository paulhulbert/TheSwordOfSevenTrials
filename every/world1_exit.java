/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class world1_exit extends room {
    
    private platform state1;
    private unit wizard;
    
    
    public world1_exit( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 500, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(720);
        state1.setWarpy(400);
        
        unit w1_room1_sign1 = new sign( 400, 441, this.getweap3(), this, "Magedoor to the field." );
        
        this.addneutral(w1_room1_sign1);
        
        wizard = new world1.wizardcom(this.getweap3(), this, 500, 500 - 76);
        this.addneutral(wizard);
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        ImageIcon portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        g.drawImage(portal.getImage(), 490, 360, 120, 150, null);
        
        
        
        
    }
    
    
    
}

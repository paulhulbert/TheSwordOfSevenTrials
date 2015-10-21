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

public class room3_inroom1_inroom1 extends insideroom {
    
    
    
    private platform state1;
    private platform state2;
    
    public room3_inroom1_inroom1( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        state1 = new platform( 600, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(620);
        state1.setWarpy(400);
        
        this.setroomdim(250, 350, 750, 500);
        
        
        
        state2 = new platform( 480, 410, 50, 90, Color.black, false, this.getweap3() );
        
        state2.setSolid(false);
        state2.setWarppoint(this);
        state2.setWarps(true);
        state2.setWarpx(320);
        state2.setWarpy(500 - constants.taldoheight());
        
        this.addplatform(state2);
        
    }
    
    
    @Override
    public void setwarproom( room r )
    {
        state2.setWarppoint(r);
        
    }
    
    public void setwarproom2( room r )
    {
        state1.setWarppoint(r);
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        ImageIcon portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        g.drawImage(portal.getImage(), 590, 360, 120, 150, null);
        
    }
    
    
    
}
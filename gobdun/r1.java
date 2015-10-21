/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobdun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r1 extends room2 {  
    
    private room downroom;
    private every.jpanel1 panel;
    
    private ImageIcon portal;
    
    public r1( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        terrain.remove(0);
        
        downroom = this;
        
        
        this.panel = panel;
        
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        
        
        if ( mainchar.gety() > 700 ) {
            mainchar.setroom(downroom);
            mainchar.sety(0);
            panel.setroom(downroom);
            online = false;
            downroom.onscreen(true);
        }
        
    }
    
    @Override
    public void setladder( room r )
    {
        downroom = r;
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        g.drawImage(portal.getImage(), 690, 0, 120, 150, null);
        
    }
    
}




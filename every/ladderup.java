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
public class ladderup extends ladder {
    
    
    public ladderup( int x, int ybase, Color col, ArrayList<weapon> weapons, room r, String color )
    {
        super( x, ybase - 1, 40, 1, col, false, weapons, r );
        
        this.setSolid(false);
        this.setWarps(true);
        this.setWarpx(x);
        
        isladder = true;
        
        ladder = new ImageIcon( getClass().getResource("Ladder.png") );
    }
    
//    @Override
//    public void draw(Graphics g)
//    {
//        super.draw(g);
//        
//        g.drawImage(ladder.getImage(), super.x, -10, 40, 10 + super.y, null);
//    }
    
    
    @Override
    public void drawladder(Graphics g)
    {
        g.drawImage(ladder.getImage(), super.x, -10, 40, 10 + super.y, null);
    }
}

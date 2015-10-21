/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class insideroom extends room {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    
    
    public insideroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        
        
        
        
        
    }
    
    @Override
    public void checkoffscreen()
    {
        if ( mainchar.getcenterx() < 12 + x1 ) {
            mainchar.setcenterx( 12 + x1 );
        }
        if ( mainchar.getcenterx() > x2 - 12 ) {
            mainchar.setcenterx( x2 - 13 );
        }
        if ( mainchar.gety() < y1 ) {
            mainchar.sety( y1 );
        }
    }
    
    @Override
    public void setroomdim( int x1, int y1, int x2, int y2 )
    {
        
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        
        platform wall1 = new wall_left( Color.BLACK, getweap3() );
        wall1.setx(x1 - 10);
        wall1.setwidth( 5 );
        addplatform( wall1 );
        
        platform wall2 = new wall_right( Color.BLACK, getweap3() );
        wall2.setx(x2);
        wall2.setwidth( 5 );
        addplatform( wall2 );
        
        platform ceiling1 = new ceiling( Color.BLACK, getweap3() );
        ceiling1.sety(y1 - 5);
        ceiling1.setheight(5);
        addplatform(ceiling1);
    }
    
    
    @Override
    public void paintextraover( Graphics g )
    {
        
        g.setColor(Color.black);
        
        g.fillRect(-5, -5, x1, 1000);
        g.fillRect(x2, -5, 1400 - x2 + 100, 1000);
        
        g.fillRect(-5, -5, 1400, y1 + 5);
        
    }
    
}

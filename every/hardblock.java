/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class hardblock extends platform {
    
    Color col2;
    
    public hardblock( int x, int y, int wide, int tall, Color col, Color border, boolean step, ArrayList<weapon> weapons )
    {
        super( x, y, wide, tall, col, step, weapons );
        col2 = border;
        ishardblock = true;
    }
    
    @Override
    public void drawover( Graphics g )
    {
        g.setColor(col2);
        g.drawRect(x, y, wide, tall);
        
        
    }
    
    @Override
    public void inplatform( unit u )
    {
        int halfwidth = u.getfig().getwidth() / 2;
        int centerx = u.getcenterx();
        int centery = u.gety() + u.getfig().getlength() / 2;
        int bottomy = u.gety() + u.getfig().getlength();
        int topy = u.gety();
        
        
        
        int x2 = x + wide;
        int y2 = y + tall;
        
        int centeryplat = y + ( y2 - y ) / 2;
        int centerxplat = x + ( x2 - x ) / 2;
        
        
        if ( centerx + halfwidth > x && centerx - halfwidth < x2 ) {
            if ( topy < y2 && bottomy > y ) {
                
//                if ( u.getisfalling() ) {
//                    if ( centery < centeryplat && u.getmomenty() > 0 ) {
//                        u.sety( y - u.getfig().getlength() );
//                        u.setmomenty(0);
//                    }
//                    
//                    
//                }
                
                u.getai().hithard();
                
                if ( centerx <= centerxplat ) {
                    u.setcenterx( x - halfwidth );
                    u.setmomentx(0);
                }
                else {
                    u.setcenterx( x2 + halfwidth );
                    u.setmomentx(0);
                }
                    
            }
        }
        
        
        
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weapons;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import weapons.junglemonkeylizardvine;
/**
 *
 * @author Dad
 */
public class movingbomb extends unit {
    
    public int fuse = 0;
    
    
    public movingbomb( room currentroom, int x, int y, int momentx, int momenty )
    {
        super( 5, 0, 4, "bombexplosion", x, y - 21, new noai(), currentroom.getweap3(), currentroom, 100, 140 );
        
        
        buildvil1();
        
        
        name = "bomb";
        
        this.momentx = momentx;
        this.momenty = momenty;
    
    }
    
    
    @Override
    public void dropper()
    {
        super.dropper();
        
        
        weapons.add(new weapons.bombexplosion( getrightx() + 10, getcentery(), 0, -15 ) );
        weapons.add(new weapons.bombexplosion( getcenterx(), getcentery(), 15, -0 ) );
        weapons.add(new weapons.bombexplosion( getleftx(), getcentery(), -15, -0 ) );
        
        weapons.add(new weapons.bombexplosion( getrightx() + 10, getcentery(), 0, -8 ) );
        weapons.add(new weapons.bombexplosion( getcenterx(), getcentery(), 8, -0 ) );
        weapons.add(new weapons.bombexplosion( getleftx(), getcentery(), -8, -0 ) );
        
        weapons.add(new weapons.bombexplosion( getcenterx(), getcentery(), 4, -4 ) );
        weapons.add(new weapons.bombexplosion( getcenterx(), getcentery(), -4, -4 ) );
        
        weapons.add(new weapons.bombexplosion( getcenterx(), getcentery(), 8, -8 ) );
        weapons.add(new weapons.bombexplosion( getcenterx(), getcentery(), -8, -8 ) );
            
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( life <= 0 ) {
            return;
        }
        
        fuse++;
        if ( fuse >= 48 ) {
            setlife( -10 );
            dropper();
        }
        
    }
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(14);
        f.setlength(20);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
Color sa = new Color(204,0,0,200);
Color sb = new Color(23,23,23);
Color sc = new Color(35,35,35);
Color sd = new Color(28,28,28);
Color se = new Color(18,18,18);
Color sf = new Color(42,42,42);
Color sg = new Color(22,22,22);






//<editor-fold defaultstate="collapsed" desc="build figure">





f.setpixel(9, 0, sa);
f.setpixel(11, 0, sa);
f.setpixel(8, 1, sa);
f.setpixel(10, 1, sa);
f.setpixel(9, 2, sa);
f.setpixel(12, 2, sa);
f.setpixel(14, 2, sa);
f.setpixel(9, 3, sb);
f.setpixel(10, 3, sa);
f.setpixel(11, 3, sa);
f.setpixel(8, 4, sb);
f.setpixel(8, 5, sb);
f.setpixel(8, 6, sb);
f.setpixel(7, 7, sb);
f.setpixel(8, 7, sb);
f.setpixel(6, 8, sc);
f.setpixel(7, 8, sd);
f.setpixel(8, 8, sb);
f.setpixel(9, 8, se);
f.setpixel(4, 9, sf);
f.setpixel(5, 9, sc);
f.setpixel(6, 9, sd);
f.setpixel(7, 9, sg);
f.setpixel(8, 9, sg);
f.setpixel(9, 9, sg);
f.setpixel(10, 9, sb);
f.setpixel(11, 9, se);
f.setpixel(3, 10, sf);
f.setpixel(4, 10, sc);
f.setpixel(5, 10, sd);
f.setpixel(6, 10, sg);
f.setpixel(7, 10, sg);
f.setpixel(8, 10, sg);
f.setpixel(9, 10, sg);
f.setpixel(10, 10, sg);
f.setpixel(11, 10, sb);
f.setpixel(12, 10, se);
f.setpixel(2, 11, sf);
f.setpixel(3, 11, sc);
f.setpixel(4, 11, sd);
f.setpixel(5, 11, sg);
f.setpixel(6, 11, sg);
f.setpixel(7, 11, sg);
f.setpixel(8, 11, sg);
f.setpixel(9, 11, sg);
f.setpixel(10, 11, sg);
f.setpixel(11, 11, sg);
f.setpixel(12, 11, sb);
f.setpixel(13, 11, se);
f.setpixel(2, 12, sf);
f.setpixel(3, 12, sc);
f.setpixel(4, 12, sd);
f.setpixel(5, 12, sg);
f.setpixel(6, 12, sg);
f.setpixel(7, 12, sg);
f.setpixel(8, 12, sg);
f.setpixel(9, 12, sg);
f.setpixel(10, 12, sg);
f.setpixel(11, 12, sg);
f.setpixel(12, 12, sb);
f.setpixel(13, 12, se);
f.setpixel(1, 13, sf);
f.setpixel(2, 13, sc);
f.setpixel(3, 13, sd);
f.setpixel(4, 13, sg);
f.setpixel(5, 13, sg);
f.setpixel(6, 13, sg);
f.setpixel(7, 13, sg);
f.setpixel(8, 13, sg);
f.setpixel(9, 13, sg);
f.setpixel(10, 13, sg);
f.setpixel(11, 13, sg);
f.setpixel(12, 13, sg);
f.setpixel(13, 13, sb);
f.setpixel(14, 13, se);
f.setpixel(1, 14, sf);
f.setpixel(2, 14, sc);
f.setpixel(3, 14, sd);
f.setpixel(4, 14, sg);
f.setpixel(5, 14, sg);
f.setpixel(6, 14, sg);
f.setpixel(7, 14, sg);
f.setpixel(8, 14, sg);
f.setpixel(9, 14, sg);
f.setpixel(10, 14, sg);
f.setpixel(11, 14, sg);
f.setpixel(12, 14, sg);
f.setpixel(13, 14, sb);
f.setpixel(14, 14, se);
f.setpixel(0, 15, sa);
f.setpixel(1, 15, sf);
f.setpixel(2, 15, sc);
f.setpixel(3, 15, sd);
f.setpixel(4, 15, sg);
f.setpixel(5, 15, sg);
f.setpixel(6, 15, sg);
f.setpixel(7, 15, sg);
f.setpixel(8, 15, sg);
f.setpixel(9, 15, sg);
f.setpixel(10, 15, sg);
f.setpixel(11, 15, sg);
f.setpixel(12, 15, sg);
f.setpixel(13, 15, sb);
f.setpixel(14, 15, se);
f.setpixel(1, 16, sf);
f.setpixel(2, 16, sc);
f.setpixel(3, 16, sd);
f.setpixel(4, 16, sg);
f.setpixel(5, 16, sg);
f.setpixel(6, 16, sg);
f.setpixel(7, 16, sg);
f.setpixel(8, 16, sg);
f.setpixel(9, 16, sg);
f.setpixel(10, 16, sg);
f.setpixel(11, 16, sg);
f.setpixel(12, 16, sg);
f.setpixel(13, 16, sb);
f.setpixel(14, 16, se);
f.setpixel(2, 17, sf);
f.setpixel(3, 17, sf);
f.setpixel(4, 17, sd);
f.setpixel(5, 17, sg);
f.setpixel(6, 17, sg);
f.setpixel(7, 17, sg);
f.setpixel(8, 17, sg);
f.setpixel(9, 17, sg);
f.setpixel(10, 17, sg);
f.setpixel(11, 17, sg);
f.setpixel(12, 17, sb);
f.setpixel(13, 17, se);
f.setpixel(2, 18, sf);
f.setpixel(3, 18, sf);
f.setpixel(4, 18, sd);
f.setpixel(5, 18, sg);
f.setpixel(6, 18, sg);
f.setpixel(7, 18, sg);
f.setpixel(8, 18, sg);
f.setpixel(9, 18, sg);
f.setpixel(10, 18, sg);
f.setpixel(11, 18, sg);
f.setpixel(12, 18, sb);
f.setpixel(13, 18, se);
f.setpixel(3, 19, sf);
f.setpixel(4, 19, sc);
f.setpixel(5, 19, sd);
f.setpixel(6, 19, sg);
f.setpixel(7, 19, sg);
f.setpixel(8, 19, sg);
f.setpixel(9, 19, sg);
f.setpixel(10, 19, sg);
f.setpixel(11, 19, sb);
f.setpixel(12, 19, se);
f.setpixel(4, 20, sf);
f.setpixel(5, 20, sc);
f.setpixel(6, 20, sd);
f.setpixel(7, 20, sg);
f.setpixel(8, 20, sg);
f.setpixel(9, 20, sg);
f.setpixel(10, 20, sb);
f.setpixel(11, 20, se);


for ( int c = 0; c < 20; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}




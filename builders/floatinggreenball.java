/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class floatinggreenball extends unit {
    
    
    public floatinggreenball( room currentroom, int x, int y, AI ai )
    {
        super( 1, 0, 4, "greenfireball", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
    @Override
    public void attack()
    {
        if ( !ai.canattack() ) {
            return;
        }
        lastweapused = 1;
        
        int targetx = ai.gettarget().getcenterx();
        int targety = ai.gettarget().getcentery();
        
        int thisx = getcenterx();
        int thisy = getcentery();
        
        int topslope = targety - thisy;
        int bottomslope = targetx - thisx;
        
        for ( int c = 2; c < 50; c++ ) {
            
            if ( topslope % c == 0 && bottomslope % c == 0 ) {
                
                topslope /= c;
                bottomslope /= c;
                
                c--;
                
            }
            
            
            
        }
        
        while ( Math.abs(bottomslope) > 10 || Math.abs(topslope) > 10 ) {
            
            bottomslope /= 2;
            topslope /= 2;
            
        }
        
        
        
        if ( mainweapon.equals("greenfireball")) {
            weapons.add(new weapons.greenfireball( getcenterx(), getcentery(), bottomslope, topslope ));
            
            
        }
        
    }
    
    
    @Override
    public void faller()
    {
        
        
        
        
    }
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(22);
        f.setlength(21);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
        
Color sa = new Color(0,0,0);
Color sb = new Color(0,255,0);
Color sc = new Color(51,51,51);
Color sd = new Color(255,255,255);

        
        
        
//<editor-fold defaultstate="collapsed" desc="build figure">






setpixel(10, 0, sa);
setpixel(11, 0, sb);
setpixel(12, 0, sb);
setpixel(13, 0, sa);
setpixel(7, 1, sb);
setpixel(8, 1, sa);
setpixel(9, 1, sa);
setpixel(10, 1, sb);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sb);
setpixel(14, 1, sa);
setpixel(15, 1, sa);
setpixel(16, 1, sb);
setpixel(5, 2, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sb);
setpixel(9, 2, sb);
setpixel(10, 2, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sb);
setpixel(15, 2, sb);
setpixel(16, 2, sa);
setpixel(17, 2, sa);
setpixel(18, 2, sa);
setpixel(4, 3, sb);
setpixel(5, 3, sa);
setpixel(6, 3, sa);
setpixel(7, 3, sa);
setpixel(8, 3, sa);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sb);
setpixel(12, 3, sb);
setpixel(13, 3, sa);
setpixel(14, 3, sa);
setpixel(15, 3, sa);
setpixel(16, 3, sa);
setpixel(17, 3, sa);
setpixel(18, 3, sa);
setpixel(19, 3, sb);
setpixel(3, 4, sa);
setpixel(4, 4, sa);
setpixel(5, 4, sb);
setpixel(6, 4, sa);
setpixel(7, 4, sa);
setpixel(8, 4, sa);
setpixel(9, 4, sa);
setpixel(10, 4, sb);
setpixel(11, 4, sa);
setpixel(12, 4, sa);
setpixel(13, 4, sb);
setpixel(14, 4, sa);
setpixel(15, 4, sa);
setpixel(16, 4, sa);
setpixel(17, 4, sa);
setpixel(18, 4, sb);
setpixel(19, 4, sa);
setpixel(20, 4, sa);
setpixel(3, 5, sc);
setpixel(4, 5, sa);
setpixel(5, 5, sa);
setpixel(6, 5, sb);
setpixel(7, 5, sa);
setpixel(8, 5, sb);
setpixel(9, 5, sb);
setpixel(10, 5, sa);
setpixel(11, 5, sb);
setpixel(12, 5, sb);
setpixel(13, 5, sa);
setpixel(14, 5, sb);
setpixel(15, 5, sb);
setpixel(16, 5, sa);
setpixel(17, 5, sb);
setpixel(18, 5, sa);
setpixel(19, 5, sa);
setpixel(20, 5, sc);
setpixel(2, 6, sc);
setpixel(3, 6, sb);
setpixel(4, 6, sc);
setpixel(5, 6, sa);
setpixel(6, 6, sa);
setpixel(7, 6, sb);
setpixel(8, 6, sa);
setpixel(9, 6, sa);
setpixel(10, 6, sb);
setpixel(11, 6, sa);
setpixel(12, 6, sa);
setpixel(13, 6, sb);
setpixel(14, 6, sa);
setpixel(15, 6, sa);
setpixel(16, 6, sb);
setpixel(17, 6, sa);
setpixel(18, 6, sa);
setpixel(19, 6, sc);
setpixel(20, 6, sb);
setpixel(21, 6, sc);
setpixel(2, 7, sd);
setpixel(3, 7, sc);
setpixel(4, 7, sb);
setpixel(5, 7, sc);
setpixel(6, 7, sa);
setpixel(7, 7, sa);
setpixel(8, 7, sa);
setpixel(9, 7, sa);
setpixel(10, 7, sa);
setpixel(11, 7, sb);
setpixel(12, 7, sb);
setpixel(13, 7, sa);
setpixel(14, 7, sa);
setpixel(15, 7, sa);
setpixel(16, 7, sa);
setpixel(17, 7, sa);
setpixel(18, 7, sc);
setpixel(19, 7, sb);
setpixel(20, 7, sc);
setpixel(21, 7, sd);
setpixel(2, 8, sd);
setpixel(3, 8, sd);
setpixel(4, 8, sc);
setpixel(5, 8, sb);
setpixel(6, 8, sc);
setpixel(7, 8, sa);
setpixel(8, 8, sb);
setpixel(9, 8, sb);
setpixel(10, 8, sa);
setpixel(11, 8, sa);
setpixel(12, 8, sa);
setpixel(13, 8, sa);
setpixel(14, 8, sb);
setpixel(15, 8, sb);
setpixel(16, 8, sa);
setpixel(17, 8, sc);
setpixel(18, 8, sb);
setpixel(19, 8, sc);
setpixel(20, 8, sd);
setpixel(21, 8, sd);
setpixel(1, 9, sb);
setpixel(2, 9, sd);
setpixel(3, 9, sd);
setpixel(4, 9, sc);
setpixel(5, 9, sb);
setpixel(6, 9, sc);
setpixel(7, 9, sb);
setpixel(8, 9, sa);
setpixel(9, 9, sa);
setpixel(10, 9, sa);
setpixel(11, 9, sb);
setpixel(12, 9, sb);
setpixel(13, 9, sa);
setpixel(14, 9, sa);
setpixel(15, 9, sa);
setpixel(16, 9, sb);
setpixel(17, 9, sc);
setpixel(18, 9, sb);
setpixel(19, 9, sc);
setpixel(20, 9, sd);
setpixel(21, 9, sd);
setpixel(22, 9, sb);
setpixel(0, 10, sd);
setpixel(1, 10, sa);
setpixel(2, 10, sb);
setpixel(3, 10, sd);
setpixel(4, 10, sc);
setpixel(5, 10, sb);
setpixel(6, 10, sc);
setpixel(7, 10, sb);
setpixel(8, 10, sa);
setpixel(9, 10, sa);
setpixel(10, 10, sa);
setpixel(11, 10, sa);
setpixel(12, 10, sa);
setpixel(13, 10, sa);
setpixel(14, 10, sa);
setpixel(15, 10, sa);
setpixel(16, 10, sb);
setpixel(17, 10, sc);
setpixel(18, 10, sb);
setpixel(19, 10, sc);
setpixel(20, 10, sd);
setpixel(21, 10, sb);
setpixel(22, 10, sa);
setpixel(1, 11, sa);
setpixel(2, 11, sb);
setpixel(3, 11, sd);
setpixel(4, 11, sc);
setpixel(5, 11, sb);
setpixel(6, 11, sc);
setpixel(7, 11, sa);
setpixel(8, 11, sb);
setpixel(9, 11, sa);
setpixel(10, 11, sb);
setpixel(11, 11, sb);
setpixel(12, 11, sb);
setpixel(13, 11, sb);
setpixel(14, 11, sa);
setpixel(15, 11, sb);
setpixel(16, 11, sa);
setpixel(17, 11, sc);
setpixel(18, 11, sb);
setpixel(19, 11, sc);
setpixel(20, 11, sd);
setpixel(21, 11, sb);
setpixel(22, 11, sa);
setpixel(1, 12, sb);
setpixel(2, 12, sd);
setpixel(3, 12, sd);
setpixel(4, 12, sc);
setpixel(5, 12, sb);
setpixel(6, 12, sc);
setpixel(7, 12, sa);
setpixel(8, 12, sa);
setpixel(9, 12, sb);
setpixel(10, 12, sa);
setpixel(11, 12, sa);
setpixel(12, 12, sa);
setpixel(13, 12, sa);
setpixel(14, 12, sb);
setpixel(15, 12, sa);
setpixel(16, 12, sa);
setpixel(17, 12, sc);
setpixel(18, 12, sb);
setpixel(19, 12, sc);
setpixel(20, 12, sd);
setpixel(21, 12, sd);
setpixel(22, 12, sb);
setpixel(2, 13, sd);
setpixel(3, 13, sc);
setpixel(4, 13, sb);
setpixel(5, 13, sc);
setpixel(6, 13, sa);
setpixel(7, 13, sa);
setpixel(8, 13, sb);
setpixel(9, 13, sa);
setpixel(10, 13, sa);
setpixel(11, 13, sb);
setpixel(12, 13, sb);
setpixel(13, 13, sa);
setpixel(14, 13, sa);
setpixel(15, 13, sb);
setpixel(16, 13, sa);
setpixel(17, 13, sa);
setpixel(18, 13, sc);
setpixel(19, 13, sb);
setpixel(20, 13, sc);
setpixel(21, 13, sd);
setpixel(2, 14, sc);
setpixel(3, 14, sb);
setpixel(4, 14, sc);
setpixel(5, 14, sa);
setpixel(6, 14, sa);
setpixel(7, 14, sb);
setpixel(8, 14, sa);
setpixel(9, 14, sa);
setpixel(10, 14, sb);
setpixel(11, 14, sa);
setpixel(12, 14, sa);
setpixel(13, 14, sb);
setpixel(14, 14, sa);
setpixel(15, 14, sa);
setpixel(16, 14, sb);
setpixel(17, 14, sa);
setpixel(18, 14, sa);
setpixel(19, 14, sc);
setpixel(20, 14, sb);
setpixel(21, 14, sc);
setpixel(2, 15, sb);
setpixel(3, 15, sc);
setpixel(4, 15, sa);
setpixel(5, 15, sa);
setpixel(6, 15, sb);
setpixel(7, 15, sa);
setpixel(8, 15, sa);
setpixel(9, 15, sb);
setpixel(10, 15, sa);
setpixel(11, 15, sb);
setpixel(12, 15, sb);
setpixel(13, 15, sa);
setpixel(14, 15, sb);
setpixel(15, 15, sa);
setpixel(16, 15, sa);
setpixel(17, 15, sb);
setpixel(18, 15, sa);
setpixel(19, 15, sa);
setpixel(20, 15, sc);
setpixel(21, 15, sb);
setpixel(3, 16, sa);
setpixel(4, 16, sa);
setpixel(5, 16, sb);
setpixel(6, 16, sa);
setpixel(7, 16, sa);
setpixel(8, 16, sb);
setpixel(9, 16, sa);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
setpixel(12, 16, sa);
setpixel(13, 16, sa);
setpixel(14, 16, sa);
setpixel(15, 16, sb);
setpixel(16, 16, sa);
setpixel(17, 16, sa);
setpixel(18, 16, sb);
setpixel(19, 16, sa);
setpixel(20, 16, sa);
setpixel(3, 17, sa);
setpixel(4, 17, sb);
setpixel(5, 17, sa);
setpixel(6, 17, sa);
setpixel(7, 17, sb);
setpixel(8, 17, sa);
setpixel(9, 17, sa);
setpixel(10, 17, sb);
setpixel(11, 17, sa);
setpixel(12, 17, sa);
setpixel(13, 17, sb);
setpixel(14, 17, sa);
setpixel(15, 17, sa);
setpixel(16, 17, sb);
setpixel(17, 17, sa);
setpixel(18, 17, sa);
setpixel(19, 17, sb);
setpixel(20, 17, sa);
setpixel(4, 18, sb);
setpixel(5, 18, sa);
setpixel(6, 18, sb);
setpixel(7, 18, sa);
setpixel(8, 18, sa);
setpixel(9, 18, sb);
setpixel(10, 18, sa);
setpixel(11, 18, sb);
setpixel(12, 18, sb);
setpixel(13, 18, sa);
setpixel(14, 18, sb);
setpixel(15, 18, sa);
setpixel(16, 18, sa);
setpixel(17, 18, sb);
setpixel(18, 18, sa);
setpixel(19, 18, sb);
setpixel(5, 19, sb);
setpixel(6, 19, sa);
setpixel(7, 19, sa);
setpixel(8, 19, sa);
setpixel(9, 19, sa);
setpixel(10, 19, sb);
setpixel(11, 19, sa);
setpixel(12, 19, sa);
setpixel(13, 19, sb);
setpixel(14, 19, sa);
setpixel(15, 19, sa);
setpixel(16, 19, sa);
setpixel(17, 19, sa);
setpixel(18, 19, sb);
setpixel(7, 20, sb);
setpixel(8, 20, sb);
setpixel(9, 20, sa);
setpixel(10, 20, sa);
setpixel(11, 20, sb);
setpixel(12, 20, sb);
setpixel(13, 20, sa);
setpixel(14, 20, sa);
setpixel(15, 20, sb);
setpixel(16, 20, sb);
setpixel(10, 21, sb);
setpixel(11, 21, sa);
setpixel(12, 21, sa);
setpixel(13, 21, sb);

for ( int c = 0; c < 21; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class hoverrobot extends unit {
    
    
    public hoverrobot( room currentroom, int x, int y, AI ai )
    {
        super( 20, 0, 4, "electricball", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
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
        
        while ( Math.abs(bottomslope) > 10 ) {
            
            bottomslope /= 2;
            topslope /= 2;
            
        }
        
        
        
        if ( mainweapon.equals("electricball")) {
            weapons.add(new electricball( x, y + 18, bottomslope, topslope ));
            
            
        }
        
    }
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(23);
        f.setlength(67);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
        
        
        
Color sa = new Color(51,51,51);
Color sb = new Color(102,102,102);
Color sc = new Color(51,204,255);
Color sd = new Color(51,205,255,180);

//<editor-fold defaultstate="collapsed" desc="build figure">




setpixel(2, 0, sa);
setpixel(3, 0, sa);
setpixel(4, 0, sa);
setpixel(5, 0, sa);
setpixel(6, 0, sa);
setpixel(7, 0, sa);
setpixel(2, 1, sb);
setpixel(3, 1, sb);
setpixel(4, 1, sb);
setpixel(5, 1, sc);
setpixel(6, 1, sb);
setpixel(7, 1, sb);
setpixel(8, 1, sa);
setpixel(9, 1, sa);
setpixel(10, 1, sa);
setpixel(2, 2, sb);
setpixel(3, 2, sb);
setpixel(4, 2, sb);
setpixel(5, 2, sb);
setpixel(6, 2, sc);
setpixel(7, 2, sb);
setpixel(8, 2, sb);
setpixel(9, 2, sb);
setpixel(10, 2, sb);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(2, 3, sb);
setpixel(3, 3, sb);
setpixel(4, 3, sb);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sc);
setpixel(8, 3, sb);
setpixel(9, 3, sb);
setpixel(10, 3, sb);
setpixel(11, 3, sb);
setpixel(12, 3, sb);
setpixel(13, 3, sa);
setpixel(2, 4, sb);
setpixel(3, 4, sb);
setpixel(4, 4, sb);
setpixel(5, 4, sb);
setpixel(6, 4, sb);
setpixel(7, 4, sb);
setpixel(8, 4, sc);
setpixel(9, 4, sb);
setpixel(10, 4, sb);
setpixel(11, 4, sb);
setpixel(12, 4, sb);
setpixel(13, 4, sb);
setpixel(14, 4, sa);
setpixel(2, 5, sb);
setpixel(3, 5, sb);
setpixel(4, 5, sb);
setpixel(5, 5, sb);
setpixel(6, 5, sb);
setpixel(7, 5, sb);
setpixel(8, 5, sb);
setpixel(9, 5, sc);
setpixel(10, 5, sb);
setpixel(11, 5, sb);
setpixel(12, 5, sb);
setpixel(13, 5, sa);
setpixel(14, 5, sa);
setpixel(15, 5, sa);
setpixel(3, 6, sb);
setpixel(4, 6, sb);
setpixel(5, 6, sb);
setpixel(6, 6, sb);
setpixel(7, 6, sb);
setpixel(8, 6, sb);
setpixel(9, 6, sb);
setpixel(10, 6, sc);
setpixel(11, 6, sb);
setpixel(12, 6, sa);
setpixel(13, 6, sc);
setpixel(14, 6, sa);
setpixel(15, 6, sa);
setpixel(16, 6, sb);
setpixel(4, 7, sb);
setpixel(5, 7, sb);
setpixel(6, 7, sb);
setpixel(7, 7, sb);
setpixel(8, 7, sb);
setpixel(9, 7, sb);
setpixel(10, 7, sb);
setpixel(11, 7, sc);
setpixel(12, 7, sa);
setpixel(13, 7, sc);
setpixel(14, 7, sc);
setpixel(15, 7, sa);
setpixel(16, 7, sb);
setpixel(5, 8, sb);
setpixel(6, 8, sb);
setpixel(7, 8, sb);
setpixel(8, 8, sb);
setpixel(9, 8, sb);
setpixel(10, 8, sb);
setpixel(11, 8, sc);
setpixel(12, 8, sb);
setpixel(13, 8, sa);
setpixel(14, 8, sa);
setpixel(15, 8, sb);
setpixel(16, 8, sb);
setpixel(6, 9, sb);
setpixel(7, 9, sb);
setpixel(8, 9, sb);
setpixel(9, 9, sb);
setpixel(10, 9, sb);
setpixel(11, 9, sc);
setpixel(12, 9, sb);
setpixel(13, 9, sb);
setpixel(14, 9, sb);
setpixel(15, 9, sb);
setpixel(16, 9, sb);
setpixel(7, 10, sb);
setpixel(8, 10, sb);
setpixel(9, 10, sb);
setpixel(10, 10, sb);
setpixel(11, 10, sc);
setpixel(12, 10, sb);
setpixel(13, 10, sb);
setpixel(14, 10, sa);
setpixel(15, 10, sa);
setpixel(16, 10, sa);
setpixel(8, 11, sb);
setpixel(9, 11, sb);
setpixel(10, 11, sb);
setpixel(11, 11, sc);
setpixel(12, 11, sb);
setpixel(13, 11, sb);
setpixel(14, 11, sb);
setpixel(15, 11, sb);
setpixel(16, 11, sb);
setpixel(9, 12, sb);
setpixel(10, 12, sb);
setpixel(11, 12, sc);
setpixel(12, 12, sb);
setpixel(13, 12, sb);
setpixel(14, 12, sb);
setpixel(15, 12, sb);
setpixel(16, 12, sb);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(12, 13, sa);
setpixel(13, 13, sa);
setpixel(14, 13, sa);
setpixel(4, 14, sb);
setpixel(5, 14, sb);
setpixel(6, 14, sb);
setpixel(7, 14, sb);
setpixel(8, 14, sb);
setpixel(9, 14, sb);
setpixel(10, 14, sa);
setpixel(11, 14, sc);
setpixel(12, 14, sa);
setpixel(13, 14, sb);
setpixel(14, 14, sa);
setpixel(15, 14, sb);
setpixel(16, 14, sb);
setpixel(17, 14, sb);
setpixel(18, 14, sb);
setpixel(4, 15, sb);
setpixel(5, 15, sb);
setpixel(6, 15, sb);
setpixel(7, 15, sb);
setpixel(8, 15, sb);
setpixel(9, 15, sa);
setpixel(10, 15, sb);
setpixel(11, 15, sa);
setpixel(12, 15, sa);
setpixel(13, 15, sa);
setpixel(14, 15, sb);
setpixel(15, 15, sa);
setpixel(16, 15, sb);
setpixel(17, 15, sb);
setpixel(18, 15, sb);
setpixel(4, 16, sb);
setpixel(5, 16, sb);
setpixel(6, 16, sb);
setpixel(7, 16, sb);
setpixel(8, 16, sb);
setpixel(9, 16, sb);
setpixel(10, 16, sa);
setpixel(11, 16, sc);
setpixel(12, 16, sc);
setpixel(13, 16, sc);
setpixel(14, 16, sa);
setpixel(15, 16, sb);
setpixel(16, 16, sb);
setpixel(17, 16, sb);
setpixel(18, 16, sb);
setpixel(5, 17, sb);
setpixel(6, 17, sb);
setpixel(7, 17, sb);
setpixel(8, 17, sb);
setpixel(9, 17, sa);
setpixel(10, 17, sa);
setpixel(11, 17, sc);
setpixel(12, 17, sa);
setpixel(13, 17, sa);
setpixel(14, 17, sa);
setpixel(15, 17, sa);
setpixel(16, 17, sb);
setpixel(17, 17, sb);
setpixel(18, 17, sb);
setpixel(5, 18, sb);
setpixel(6, 18, sb);
setpixel(7, 18, sb);
setpixel(8, 18, sb);
setpixel(9, 18, sb);
setpixel(10, 18, sa);
setpixel(11, 18, sc);
setpixel(12, 18, sa);
setpixel(13, 18, sc);
setpixel(14, 18, sa);
setpixel(15, 18, sb);
setpixel(16, 18, sa);
setpixel(17, 18, sb);
setpixel(18, 18, sb);
setpixel(5, 19, sb);
setpixel(6, 19, sb);
setpixel(7, 19, sb);
setpixel(8, 19, sb);
setpixel(9, 19, sa);
setpixel(10, 19, sb);
setpixel(11, 19, sa);
setpixel(12, 19, sa);
setpixel(13, 19, sa);
setpixel(14, 19, sc);
setpixel(15, 19, sa);
setpixel(16, 19, sb);
setpixel(17, 19, sa);
setpixel(18, 19, sb);
setpixel(6, 20, sb);
setpixel(7, 20, sb);
setpixel(8, 20, sb);
setpixel(9, 20, sb);
setpixel(10, 20, sa);
setpixel(11, 20, sc);
setpixel(12, 20, sa);
setpixel(13, 20, sa);
setpixel(14, 20, sa);
setpixel(15, 20, sc);
setpixel(16, 20, sb);
setpixel(17, 20, sb);
setpixel(18, 20, sa);
setpixel(6, 21, sb);
setpixel(7, 21, sb);
setpixel(8, 21, sb);
setpixel(9, 21, sb);
setpixel(10, 21, sb);
setpixel(11, 21, sc);
setpixel(12, 21, sb);
setpixel(13, 21, sb);
setpixel(14, 21, sa);
setpixel(15, 21, sb);
setpixel(16, 21, sc);
setpixel(17, 21, sb);
setpixel(18, 21, sb);
setpixel(19, 21, sa);
setpixel(23, 21, sa);
setpixel(6, 22, sb);
setpixel(7, 22, sb);
setpixel(8, 22, sb);
setpixel(9, 22, sb);
setpixel(10, 22, sb);
setpixel(11, 22, sc);
setpixel(12, 22, sb);
setpixel(13, 22, sb);
setpixel(14, 22, sb);
setpixel(15, 22, sa);
setpixel(16, 22, sb);
setpixel(17, 22, sc);
setpixel(18, 22, sb);
setpixel(19, 22, sb);
setpixel(20, 22, sa);
setpixel(21, 22, sa);
setpixel(22, 22, sa);
setpixel(6, 23, sb);
setpixel(7, 23, sb);
setpixel(8, 23, sb);
setpixel(9, 23, sb);
setpixel(10, 23, sb);
setpixel(11, 23, sc);
setpixel(12, 23, sb);
setpixel(13, 23, sb);
setpixel(14, 23, sb);
setpixel(15, 23, sb);
setpixel(16, 23, sa);
setpixel(17, 23, sb);
setpixel(18, 23, sc);
setpixel(19, 23, sc);
setpixel(20, 23, sc);
setpixel(21, 23, sc);
setpixel(22, 23, sc);
setpixel(23, 23, sa);
setpixel(6, 24, sa);
setpixel(7, 24, sa);
setpixel(8, 24, sa);
setpixel(9, 24, sa);
setpixel(10, 24, sa);
setpixel(11, 24, sa);
setpixel(12, 24, sa);
setpixel(13, 24, sa);
setpixel(14, 24, sa);
setpixel(15, 24, sa);
setpixel(16, 24, sa);
setpixel(17, 24, sa);
setpixel(18, 24, sb);
setpixel(19, 24, sb);
setpixel(20, 24, sa);
setpixel(21, 24, sa);
setpixel(22, 24, sa);
setpixel(8, 25, sb);
setpixel(9, 25, sb);
setpixel(10, 25, sb);
setpixel(11, 25, sc);
setpixel(12, 25, sb);
setpixel(13, 25, sb);
setpixel(14, 25, sb);
setpixel(15, 25, sb);
setpixel(18, 25, sa);
setpixel(19, 25, sa);
setpixel(23, 25, sa);
setpixel(7, 26, sa);
setpixel(8, 26, sa);
setpixel(9, 26, sa);
setpixel(10, 26, sa);
setpixel(11, 26, sa);
setpixel(12, 26, sa);
setpixel(13, 26, sa);
setpixel(14, 26, sa);
setpixel(15, 26, sa);
setpixel(16, 26, sa);
setpixel(8, 27, sb);
setpixel(9, 27, sb);
setpixel(10, 27, sb);
setpixel(11, 27, sc);
setpixel(12, 27, sb);
setpixel(13, 27, sb);
setpixel(14, 27, sb);
setpixel(15, 27, sb);
setpixel(7, 28, sa);
setpixel(8, 28, sa);
setpixel(9, 28, sa);
setpixel(10, 28, sa);
setpixel(11, 28, sa);
setpixel(12, 28, sa);
setpixel(13, 28, sa);
setpixel(14, 28, sa);
setpixel(15, 28, sa);
setpixel(16, 28, sa);
setpixel(4, 29, sb);
setpixel(5, 29, sb);
setpixel(6, 29, sb);
setpixel(7, 29, sb);
setpixel(8, 29, sb);
setpixel(9, 29, sb);
setpixel(10, 29, sb);
setpixel(11, 29, sc);
setpixel(12, 29, sb);
setpixel(13, 29, sb);
setpixel(14, 29, sb);
setpixel(15, 29, sb);
setpixel(16, 29, sb);
setpixel(17, 29, sb);
setpixel(18, 29, sb);
setpixel(19, 29, sb);
setpixel(4, 30, sb);
setpixel(5, 30, sb);
setpixel(6, 30, sb);
setpixel(7, 30, sb);
setpixel(8, 30, sb);
setpixel(9, 30, sb);
setpixel(10, 30, sb);
setpixel(11, 30, sc);
setpixel(12, 30, sb);
setpixel(13, 30, sb);
setpixel(14, 30, sb);
setpixel(15, 30, sb);
setpixel(16, 30, sb);
setpixel(17, 30, sb);
setpixel(18, 30, sb);
setpixel(19, 30, sb);
setpixel(3, 31, sb);
setpixel(4, 31, sb);
setpixel(5, 31, sb);
setpixel(6, 31, sb);
setpixel(7, 31, sb);
setpixel(8, 31, sb);
setpixel(9, 31, sb);
setpixel(10, 31, sc);
setpixel(11, 31, sb);
setpixel(12, 31, sc);
setpixel(13, 31, sb);
setpixel(14, 31, sb);
setpixel(15, 31, sb);
setpixel(16, 31, sb);
setpixel(17, 31, sb);
setpixel(18, 31, sb);
setpixel(19, 31, sb);
setpixel(20, 31, sb);
setpixel(3, 32, sb);
setpixel(4, 32, sb);
setpixel(5, 32, sb);
setpixel(6, 32, sb);
setpixel(7, 32, sb);
setpixel(8, 32, sb);
setpixel(9, 32, sc);
setpixel(10, 32, sb);
setpixel(11, 32, sc);
setpixel(12, 32, sb);
setpixel(13, 32, sc);
setpixel(14, 32, sb);
setpixel(15, 32, sb);
setpixel(16, 32, sb);
setpixel(17, 32, sb);
setpixel(18, 32, sb);
setpixel(19, 32, sb);
setpixel(20, 32, sb);
setpixel(2, 33, sb);
setpixel(3, 33, sb);
setpixel(4, 33, sb);
setpixel(5, 33, sb);
setpixel(6, 33, sb);
setpixel(7, 33, sb);
setpixel(8, 33, sc);
setpixel(9, 33, sb);
setpixel(10, 33, sc);
setpixel(11, 33, sb);
setpixel(12, 33, sc);
setpixel(13, 33, sb);
setpixel(14, 33, sc);
setpixel(15, 33, sb);
setpixel(16, 33, sb);
setpixel(17, 33, sb);
setpixel(18, 33, sb);
setpixel(19, 33, sb);
setpixel(20, 33, sb);
setpixel(21, 33, sb);
setpixel(2, 34, sb);
setpixel(3, 34, sb);
setpixel(4, 34, sb);
setpixel(5, 34, sc);
setpixel(6, 34, sc);
setpixel(7, 34, sc);
setpixel(8, 34, sb);
setpixel(9, 34, sb);
setpixel(10, 34, sc);
setpixel(11, 34, sb);
setpixel(12, 34, sc);
setpixel(13, 34, sb);
setpixel(14, 34, sb);
setpixel(15, 34, sc);
setpixel(16, 34, sc);
setpixel(17, 34, sc);
setpixel(18, 34, sb);
setpixel(19, 34, sb);
setpixel(20, 34, sb);
setpixel(21, 34, sb);
setpixel(1, 35, sb);
setpixel(2, 35, sb);
setpixel(3, 35, sb);
setpixel(4, 35, sc);
setpixel(5, 35, sb);
setpixel(6, 35, sb);
setpixel(7, 35, sb);
setpixel(8, 35, sb);
setpixel(9, 35, sc);
setpixel(10, 35, sb);
setpixel(11, 35, sc);
setpixel(12, 35, sb);
setpixel(13, 35, sc);
setpixel(14, 35, sb);
setpixel(15, 35, sb);
setpixel(16, 35, sb);
setpixel(17, 35, sb);
setpixel(18, 35, sc);
setpixel(19, 35, sb);
setpixel(20, 35, sb);
setpixel(21, 35, sb);
setpixel(22, 35, sb);
setpixel(1, 36, sb);
setpixel(2, 36, sc);
setpixel(3, 36, sc);
setpixel(4, 36, sb);
setpixel(5, 36, sb);
setpixel(6, 36, sb);
setpixel(7, 36, sb);
setpixel(8, 36, sc);
setpixel(9, 36, sb);
setpixel(10, 36, sb);
setpixel(11, 36, sc);
setpixel(12, 36, sb);
setpixel(13, 36, sb);
setpixel(14, 36, sc);
setpixel(15, 36, sb);
setpixel(16, 36, sb);
setpixel(17, 36, sb);
setpixel(18, 36, sb);
setpixel(19, 36, sc);
setpixel(20, 36, sc);
setpixel(21, 36, sb);
setpixel(22, 36, sb);
setpixel(1, 37, sa);
setpixel(2, 37, sa);
setpixel(3, 37, sa);
setpixel(4, 37, sa);
setpixel(5, 37, sa);
setpixel(6, 37, sa);
setpixel(7, 37, sa);
setpixel(8, 37, sa);
setpixel(9, 37, sa);
setpixel(10, 37, sa);
setpixel(11, 37, sa);
setpixel(12, 37, sa);
setpixel(13, 37, sa);
setpixel(14, 37, sa);
setpixel(15, 37, sa);
setpixel(16, 37, sa);
setpixel(17, 37, sa);
setpixel(18, 37, sa);
setpixel(19, 37, sa);
setpixel(20, 37, sa);
setpixel(21, 37, sa);
setpixel(22, 37, sa);
setpixel(1, 38, sa);
setpixel(2, 38, sd);
setpixel(3, 38, sd);
setpixel(4, 38, sd);
setpixel(5, 38, sd);
setpixel(6, 38, sd);
setpixel(7, 38, sd);
setpixel(8, 38, sd);
setpixel(9, 38, sd);
setpixel(10, 38, sd);
setpixel(11, 38, sd);
setpixel(12, 38, sd);
setpixel(13, 38, sd);
setpixel(14, 38, sd);
setpixel(15, 38, sd);
setpixel(16, 38, sd);
setpixel(17, 38, sd);
setpixel(18, 38, sd);
setpixel(19, 38, sd);
setpixel(20, 38, sd);
setpixel(21, 38, sd);
setpixel(22, 38, sa);
setpixel(2, 39, sd);
setpixel(3, 39, sd);
setpixel(4, 39, sd);
setpixel(5, 39, sd);
setpixel(6, 39, sd);
setpixel(7, 39, sd);
setpixel(8, 39, sd);
setpixel(9, 39, sd);
setpixel(10, 39, sd);
setpixel(11, 39, sd);
setpixel(12, 39, sd);
setpixel(13, 39, sd);
setpixel(14, 39, sd);
setpixel(15, 39, sd);
setpixel(16, 39, sd);
setpixel(17, 39, sd);
setpixel(18, 39, sd);
setpixel(19, 39, sd);
setpixel(20, 39, sd);
setpixel(21, 39, sd);
setpixel(2, 40, sd);
setpixel(3, 40, sd);
setpixel(4, 40, sd);
setpixel(5, 40, sd);
setpixel(6, 40, sd);
setpixel(7, 40, sd);
setpixel(8, 40, sd);
setpixel(9, 40, sd);
setpixel(10, 40, sd);
setpixel(11, 40, sd);
setpixel(12, 40, sd);
setpixel(13, 40, sd);
setpixel(14, 40, sd);
setpixel(15, 40, sd);
setpixel(16, 40, sd);
setpixel(17, 40, sd);
setpixel(18, 40, sd);
setpixel(19, 40, sd);
setpixel(20, 40, sd);
setpixel(21, 40, sd);
setpixel(2, 41, sd);
setpixel(3, 41, sd);
setpixel(4, 41, sd);
setpixel(5, 41, sd);
setpixel(6, 41, sd);
setpixel(7, 41, sd);
setpixel(8, 41, sd);
setpixel(9, 41, sd);
setpixel(10, 41, sd);
setpixel(11, 41, sd);
setpixel(12, 41, sd);
setpixel(13, 41, sd);
setpixel(14, 41, sd);
setpixel(15, 41, sd);
setpixel(16, 41, sd);
setpixel(17, 41, sd);
setpixel(18, 41, sd);
setpixel(19, 41, sd);
setpixel(20, 41, sd);
setpixel(21, 41, sd);
setpixel(3, 43, sd);
setpixel(4, 43, sd);
setpixel(5, 43, sd);
setpixel(6, 43, sd);
setpixel(7, 43, sd);
setpixel(8, 43, sd);
setpixel(9, 43, sd);
setpixel(10, 43, sd);
setpixel(11, 43, sd);
setpixel(12, 43, sd);
setpixel(13, 43, sd);
setpixel(14, 43, sd);
setpixel(15, 43, sd);
setpixel(16, 43, sd);
setpixel(17, 43, sd);
setpixel(18, 43, sd);
setpixel(19, 43, sd);
setpixel(20, 43, sd);
setpixel(3, 44, sd);
setpixel(4, 44, sd);
setpixel(5, 44, sd);
setpixel(6, 44, sd);
setpixel(7, 44, sd);
setpixel(8, 44, sd);
setpixel(9, 44, sd);
setpixel(10, 44, sd);
setpixel(11, 44, sd);
setpixel(12, 44, sd);
setpixel(13, 44, sd);
setpixel(14, 44, sd);
setpixel(15, 44, sd);
setpixel(16, 44, sd);
setpixel(17, 44, sd);
setpixel(18, 44, sd);
setpixel(19, 44, sd);
setpixel(20, 44, sd);
setpixel(3, 45, sd);
setpixel(4, 45, sd);
setpixel(5, 45, sd);
setpixel(6, 45, sd);
setpixel(7, 45, sd);
setpixel(8, 45, sd);
setpixel(9, 45, sd);
setpixel(10, 45, sd);
setpixel(11, 45, sd);
setpixel(12, 45, sd);
setpixel(13, 45, sd);
setpixel(14, 45, sd);
setpixel(15, 45, sd);
setpixel(16, 45, sd);
setpixel(17, 45, sd);
setpixel(18, 45, sd);
setpixel(19, 45, sd);
setpixel(20, 45, sd);
setpixel(4, 48, sd);
setpixel(5, 48, sd);
setpixel(6, 48, sd);
setpixel(7, 48, sd);
setpixel(8, 48, sd);
setpixel(9, 48, sd);
setpixel(10, 48, sd);
setpixel(11, 48, sd);
setpixel(12, 48, sd);
setpixel(13, 48, sd);
setpixel(14, 48, sd);
setpixel(15, 48, sd);
setpixel(16, 48, sd);
setpixel(17, 48, sd);
setpixel(18, 48, sd);
setpixel(19, 48, sd);
setpixel(4, 49, sd);
setpixel(5, 49, sd);
setpixel(6, 49, sd);
setpixel(7, 49, sd);
setpixel(8, 49, sd);
setpixel(9, 49, sd);
setpixel(10, 49, sd);
setpixel(11, 49, sd);
setpixel(12, 49, sd);
setpixel(13, 49, sd);
setpixel(14, 49, sd);
setpixel(15, 49, sd);
setpixel(16, 49, sd);
setpixel(17, 49, sd);
setpixel(18, 49, sd);
setpixel(19, 49, sd);
setpixel(5, 53, sd);
setpixel(6, 53, sd);
setpixel(7, 53, sd);
setpixel(8, 53, sd);
setpixel(9, 53, sd);
setpixel(10, 53, sd);
setpixel(11, 53, sd);
setpixel(12, 53, sd);
setpixel(13, 53, sd);
setpixel(14, 53, sd);
setpixel(15, 53, sd);
setpixel(16, 53, sd);
setpixel(17, 53, sd);
setpixel(18, 53, sd);
setpixel(0, 67, sd);



for ( int c = 0; c < 67; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}




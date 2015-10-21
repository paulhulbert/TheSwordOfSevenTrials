/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Dad
 */
public class heavygob extends unit {
    
    private int safecounter;
    
    public heavygob( room currentroom, int x, int y, AI ai )
    {
        super( 16, 0, 4, "heavygobspear", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
    
        safecounter = 0;
    }
    
    
    @Override
   public void hit( weapon w )
   {
       if ( safecounter < 85 ) {
           return;
       }
       
       if ( w.getatt() > 0 ) {
            getfig().redit();
        }
       
       life -= 1;
       if ( w.checkweap("sost") ) {
           life -= 7;
       }
        w.hitit();
        w.onhittrigger();
        if ( life > 100 ) {
            life = 100;
        }
   }
    
    
    @Override
    public void step(Graphics g) 
    {
        super.step(g);
        
        if ( safecounter < 85 ) {
            safecounter++;
        }
        
    }
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(32);
        f.setlength(91);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
Color sa = new Color(51,51,51);
Color sb = new Color(0,0,0);
Color sc = new Color(102,102,102);
Color sd = new Color(204,0,0);
Color se = new Color(255,0,0);
Color sf = new Color(0,102,102);
Color sg = new Color(255,255,255);
Color sh = new Color(19,10,10);






//<editor-fold defaultstate="collapsed" desc="build figure">




setpixel(23, 0, sa);
setpixel(23, 1, sa);
setpixel(24, 1, sa);
setpixel(22, 2, sb);
setpixel(23, 2, sa);
setpixel(24, 2, sc);
setpixel(14, 3, sb);
setpixel(15, 3, sb);
setpixel(16, 3, sb);
setpixel(17, 3, sb);
setpixel(18, 3, sb);
setpixel(19, 3, sb);
setpixel(20, 3, sb);
setpixel(21, 3, sb);
setpixel(22, 3, sa);
setpixel(23, 3, sc);
setpixel(24, 3, sd);
setpixel(11, 4, sb);
setpixel(12, 4, sb);
setpixel(13, 4, sb);
setpixel(14, 4, sa);
setpixel(15, 4, sa);
setpixel(16, 4, sa);
setpixel(17, 4, sa);
setpixel(18, 4, sa);
setpixel(19, 4, sa);
setpixel(20, 4, sa);
setpixel(21, 4, sa);
setpixel(22, 4, sc);
setpixel(24, 4, se);
setpixel(25, 4, sd);
setpixel(11, 5, sb);
setpixel(12, 5, sa);
setpixel(13, 5, sa);
setpixel(14, 5, sa);
setpixel(15, 5, sc);
setpixel(16, 5, sc);
setpixel(17, 5, sc);
setpixel(18, 5, sc);
setpixel(19, 5, sc);
setpixel(20, 5, sc);
setpixel(21, 5, sc);
setpixel(22, 5, sc);
setpixel(23, 5, sd);
setpixel(24, 5, se);
setpixel(25, 5, sd);
setpixel(10, 6, sb);
setpixel(11, 6, sb);
setpixel(12, 6, sa);
setpixel(13, 6, sc);
setpixel(14, 6, sc);
setpixel(15, 6, sc);
setpixel(16, 6, sa);
setpixel(17, 6, sa);
setpixel(18, 6, sa);
setpixel(19, 6, sa);
setpixel(20, 6, sa);
setpixel(21, 6, sa);
setpixel(22, 6, sc);
setpixel(23, 6, sd);
setpixel(24, 6, se);
setpixel(25, 6, sd);
setpixel(10, 7, sb);
setpixel(11, 7, sa);
setpixel(12, 7, sc);
setpixel(13, 7, sc);
setpixel(14, 7, sa);
setpixel(15, 7, sa);
setpixel(16, 7, sa);
setpixel(17, 7, sa);
setpixel(18, 7, sa);
setpixel(19, 7, sa);
setpixel(20, 7, sa);
setpixel(21, 7, sa);
setpixel(22, 7, sa);
setpixel(23, 7, sc);
setpixel(24, 7, sd);
setpixel(10, 8, sb);
setpixel(11, 8, sa);
setpixel(12, 8, sc);
setpixel(13, 8, sa);
setpixel(14, 8, sa);
setpixel(15, 8, sa);
setpixel(16, 8, sa);
setpixel(17, 8, sf);
setpixel(18, 8, sf);
setpixel(19, 8, sf);
setpixel(20, 8, sf);
setpixel(21, 8, sa);
setpixel(22, 8, sa);
setpixel(23, 8, sa);
setpixel(9, 9, sb);
setpixel(10, 9, sb);
setpixel(11, 9, sc);
setpixel(12, 9, sa);
setpixel(13, 9, sa);
setpixel(14, 9, sa);
setpixel(15, 9, sf);
setpixel(16, 9, sf);
setpixel(17, 9, sf);
setpixel(18, 9, sf);
setpixel(19, 9, sf);
setpixel(20, 9, sf);
setpixel(21, 9, sf);
setpixel(22, 9, sf);
setpixel(23, 9, sa);
setpixel(8, 10, sb);
setpixel(9, 10, sb);
setpixel(10, 10, sa);
setpixel(11, 10, sc);
setpixel(12, 10, sa);
setpixel(13, 10, sa);
setpixel(14, 10, sf);
setpixel(15, 10, sf);
setpixel(16, 10, sf);
setpixel(17, 10, sf);
setpixel(18, 10, sf);
setpixel(19, 10, sf);
setpixel(20, 10, sf);
setpixel(21, 10, sf);
setpixel(22, 10, sf);
setpixel(23, 10, sf);
setpixel(8, 11, sb);
setpixel(9, 11, sa);
setpixel(10, 11, sc);
setpixel(11, 11, sc);
setpixel(12, 11, sc);
setpixel(13, 11, sc);
setpixel(14, 11, sf);
setpixel(15, 11, sf);
setpixel(16, 11, sf);
setpixel(17, 11, sf);
setpixel(18, 11, sf);
setpixel(19, 11, sf);
setpixel(20, 11, sb);
setpixel(21, 11, sb);
setpixel(22, 11, sg);
setpixel(23, 11, sf);
setpixel(8, 12, sb);
setpixel(9, 12, sa);
setpixel(10, 12, sc);
setpixel(11, 12, sf);
setpixel(12, 12, sf);
setpixel(13, 12, sf);
setpixel(14, 12, sc);
setpixel(15, 12, sf);
setpixel(16, 12, sf);
setpixel(17, 12, sf);
setpixel(18, 12, sf);
setpixel(19, 12, sf);
setpixel(20, 12, sb);
setpixel(21, 12, sb);
setpixel(22, 12, sb);
setpixel(23, 12, sf);
setpixel(7, 13, sb);
setpixel(8, 13, sb);
setpixel(9, 13, sa);
setpixel(10, 13, sc);
setpixel(11, 13, sc);
setpixel(12, 13, sf);
setpixel(13, 13, sf);
setpixel(14, 13, sf);
setpixel(15, 13, sc);
setpixel(16, 13, sf);
setpixel(17, 13, sf);
setpixel(18, 13, sf);
setpixel(19, 13, sf);
setpixel(20, 13, sb);
setpixel(21, 13, sb);
setpixel(22, 13, sb);
setpixel(23, 13, sf);
setpixel(24, 13, sf);
setpixel(7, 14, sb);
setpixel(8, 14, sa);
setpixel(9, 14, sa);
setpixel(10, 14, sc);
setpixel(11, 14, sa);
setpixel(12, 14, sc);
setpixel(13, 14, sf);
setpixel(14, 14, sf);
setpixel(15, 14, sf);
setpixel(16, 14, sc);
setpixel(17, 14, sf);
setpixel(18, 14, sf);
setpixel(19, 14, sf);
setpixel(20, 14, sf);
setpixel(21, 14, sf);
setpixel(22, 14, sf);
setpixel(23, 14, sf);
setpixel(24, 14, sf);
setpixel(6, 15, sb);
setpixel(7, 15, sa);
setpixel(8, 15, sa);
setpixel(9, 15, sc);
setpixel(10, 15, sa);
setpixel(11, 15, sa);
setpixel(12, 15, sa);
setpixel(13, 15, sc);
setpixel(14, 15, sf);
setpixel(15, 15, sf);
setpixel(16, 15, sf);
setpixel(17, 15, sf);
setpixel(18, 15, sf);
setpixel(19, 15, sf);
setpixel(20, 15, sf);
setpixel(21, 15, sf);
setpixel(22, 15, sf);
setpixel(23, 15, sf);
setpixel(24, 15, sf);
setpixel(25, 15, sf);
setpixel(4, 16, sb);
setpixel(5, 16, sb);
setpixel(6, 16, sa);
setpixel(7, 16, sa);
setpixel(8, 16, sc);
setpixel(9, 16, sc);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
setpixel(12, 16, sf);
setpixel(13, 16, sc);
setpixel(14, 16, sf);
setpixel(15, 16, sf);
setpixel(16, 16, sf);
setpixel(17, 16, sf);
setpixel(18, 16, sf);
setpixel(19, 16, sf);
setpixel(20, 16, sf);
setpixel(21, 16, sf);
setpixel(22, 16, sf);
setpixel(23, 16, sf);
setpixel(24, 16, sf);
setpixel(25, 16, sf);
setpixel(26, 16, sf);
setpixel(4, 17, sc);
setpixel(5, 17, sc);
setpixel(6, 17, sc);
setpixel(7, 17, sc);
setpixel(8, 17, sa);
setpixel(9, 17, sa);
setpixel(10, 17, sa);
setpixel(11, 17, sf);
setpixel(12, 17, sf);
setpixel(13, 17, sf);
setpixel(14, 17, sc);
setpixel(15, 17, sc);
setpixel(16, 17, sf);
setpixel(17, 17, sf);
setpixel(18, 17, sf);
setpixel(19, 17, sf);
setpixel(20, 17, sf);
setpixel(21, 17, sf);
setpixel(22, 17, sf);
setpixel(23, 17, sf);
setpixel(24, 17, sf);
setpixel(4, 18, sa);
setpixel(5, 18, sa);
setpixel(6, 18, sa);
setpixel(7, 18, sa);
setpixel(8, 18, sa);
setpixel(9, 18, sa);
setpixel(11, 18, sf);
setpixel(12, 18, sf);
setpixel(13, 18, sf);
setpixel(14, 18, sf);
setpixel(15, 18, sf);
setpixel(16, 18, sf);
setpixel(17, 18, sf);
setpixel(18, 18, sf);
setpixel(19, 18, sf);
setpixel(20, 18, sb);
setpixel(21, 18, sb);
setpixel(22, 18, sb);
setpixel(23, 18, sb);
setpixel(11, 19, sf);
setpixel(12, 19, sf);
setpixel(13, 19, sf);
setpixel(14, 19, sf);
setpixel(15, 19, sf);
setpixel(16, 19, sf);
setpixel(17, 19, sf);
setpixel(18, 19, sf);
setpixel(19, 19, sf);
setpixel(20, 19, sf);
setpixel(21, 19, sf);
setpixel(22, 19, sf);
setpixel(23, 19, sf);
setpixel(12, 20, sf);
setpixel(13, 20, sf);
setpixel(14, 20, sf);
setpixel(15, 20, sf);
setpixel(16, 20, sf);
setpixel(17, 20, sf);
setpixel(18, 20, sf);
setpixel(19, 20, sf);
setpixel(20, 20, sf);
setpixel(21, 20, sf);
setpixel(22, 20, sf);
setpixel(23, 20, sf);
setpixel(6, 21, sa);
setpixel(7, 21, sa);
setpixel(8, 21, sa);
setpixel(9, 21, sa);
setpixel(10, 21, sa);
setpixel(11, 21, sa);
setpixel(12, 21, sb);
setpixel(13, 21, sb);
setpixel(14, 21, sb);
setpixel(15, 21, sb);
setpixel(16, 21, sf);
setpixel(17, 21, sf);
setpixel(18, 21, sf);
setpixel(19, 21, sf);
setpixel(20, 21, sf);
setpixel(21, 21, sf);
setpixel(22, 21, sf);
setpixel(6, 22, sa);
setpixel(7, 22, sa);
setpixel(8, 22, sa);
setpixel(9, 22, sa);
setpixel(10, 22, sa);
setpixel(11, 22, sa);
setpixel(12, 22, sa);
setpixel(13, 22, sa);
setpixel(14, 22, sa);
setpixel(15, 22, sa);
setpixel(16, 22, sb);
setpixel(17, 22, sb);
setpixel(18, 22, sb);
setpixel(19, 22, sb);
setpixel(20, 22, sb);
setpixel(21, 22, sb);
setpixel(5, 23, sa);
setpixel(6, 23, sa);
setpixel(7, 23, sc);
setpixel(8, 23, sc);
setpixel(9, 23, sa);
setpixel(10, 23, sa);
setpixel(11, 23, sa);
setpixel(12, 23, sa);
setpixel(13, 23, sa);
setpixel(14, 23, sa);
setpixel(15, 23, sa);
setpixel(16, 23, sa);
setpixel(17, 23, sb);
setpixel(18, 23, sh);
setpixel(19, 23, sh);
setpixel(20, 23, sh);
setpixel(21, 23, sa);
setpixel(22, 23, sb);
setpixel(23, 23, sb);
setpixel(4, 24, sa);
setpixel(5, 24, sc);
setpixel(6, 24, sc);
setpixel(7, 24, sc);
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
setpixel(19, 24, sh);
setpixel(20, 24, sh);
setpixel(21, 24, sa);
setpixel(22, 24, sa);
setpixel(23, 24, sa);
setpixel(24, 24, sa);
setpixel(4, 25, sa);
setpixel(5, 25, sc);
setpixel(6, 25, sa);
setpixel(7, 25, sa);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(10, 25, sa);
setpixel(11, 25, sc);
setpixel(12, 25, sc);
setpixel(13, 25, sc);
setpixel(14, 25, sa);
setpixel(15, 25, sa);
setpixel(16, 25, sa);
setpixel(17, 25, sb);
setpixel(18, 25, sh);
setpixel(19, 25, sh);
setpixel(20, 25, sh);
setpixel(21, 25, sa);
setpixel(22, 25, sc);
setpixel(23, 25, sa);
setpixel(24, 25, sa);
setpixel(3, 26, sa);
setpixel(4, 26, sc);
setpixel(5, 26, sc);
setpixel(6, 26, sa);
setpixel(7, 26, sa);
setpixel(8, 26, sa);
setpixel(9, 26, sc);
setpixel(10, 26, sc);
setpixel(11, 26, sa);
setpixel(12, 26, sa);
setpixel(13, 26, sa);
setpixel(14, 26, sa);
setpixel(15, 26, sa);
setpixel(16, 26, sb);
setpixel(17, 26, sh);
setpixel(18, 26, sh);
setpixel(19, 26, sh);
setpixel(20, 26, sh);
setpixel(21, 26, sa);
setpixel(22, 26, sc);
setpixel(23, 26, sa);
setpixel(24, 26, sa);
setpixel(3, 27, sa);
setpixel(4, 27, sa);
setpixel(5, 27, sa);
setpixel(6, 27, sa);
setpixel(7, 27, sa);
setpixel(8, 27, sc);
setpixel(9, 27, sc);
setpixel(10, 27, sa);
setpixel(11, 27, sa);
setpixel(12, 27, sa);
setpixel(13, 27, sa);
setpixel(14, 27, sa);
setpixel(15, 27, sb);
setpixel(16, 27, sh);
setpixel(17, 27, sh);
setpixel(18, 27, sh);
setpixel(19, 27, sh);
setpixel(20, 27, sa);
setpixel(21, 27, sa);
setpixel(22, 27, sc);
setpixel(23, 27, sa);
setpixel(24, 27, sa);
setpixel(3, 28, sa);
setpixel(4, 28, sa);
setpixel(5, 28, sc);
setpixel(6, 28, sc);
setpixel(7, 28, sc);
setpixel(8, 28, sa);
setpixel(9, 28, sa);
setpixel(10, 28, sa);
setpixel(11, 28, sa);
setpixel(12, 28, sa);
setpixel(13, 28, sa);
setpixel(14, 28, sb);
setpixel(15, 28, sh);
setpixel(16, 28, sh);
setpixel(17, 28, sh);
setpixel(18, 28, sh);
setpixel(19, 28, sh);
setpixel(20, 28, sa);
setpixel(21, 28, sa);
setpixel(22, 28, sc);
setpixel(23, 28, sa);
setpixel(24, 28, sa);
setpixel(2, 29, sa);
setpixel(3, 29, sa);
setpixel(4, 29, sc);
setpixel(5, 29, sc);
setpixel(6, 29, sa);
setpixel(7, 29, sa);
setpixel(8, 29, sa);
setpixel(9, 29, sa);
setpixel(10, 29, sa);
setpixel(11, 29, sa);
setpixel(12, 29, sb);
setpixel(13, 29, sb);
setpixel(14, 29, sb);
setpixel(15, 29, sh);
setpixel(16, 29, sh);
setpixel(17, 29, sh);
setpixel(18, 29, sh);
setpixel(19, 29, sh);
setpixel(20, 29, sa);
setpixel(21, 29, sc);
setpixel(22, 29, sc);
setpixel(23, 29, sa);
setpixel(24, 29, sa);
setpixel(2, 30, sa);
setpixel(3, 30, sc);
setpixel(4, 30, sa);
setpixel(5, 30, sa);
setpixel(6, 30, sa);
setpixel(7, 30, sa);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(10, 30, sb);
setpixel(11, 30, sb);
setpixel(12, 30, sa);
setpixel(13, 30, sa);
setpixel(14, 30, sb);
setpixel(15, 30, sh);
setpixel(16, 30, sh);
setpixel(17, 30, sh);
setpixel(18, 30, sh);
setpixel(19, 30, sa);
setpixel(20, 30, sa);
setpixel(21, 30, sc);
setpixel(22, 30, sa);
setpixel(23, 30, sa);
setpixel(24, 30, sa);
setpixel(2, 31, sa);
setpixel(3, 31, sc);
setpixel(4, 31, sa);
setpixel(5, 31, sa);
setpixel(6, 31, sa);
setpixel(7, 31, sb);
setpixel(8, 31, sb);
setpixel(9, 31, sb);
setpixel(10, 31, sa);
setpixel(11, 31, sa);
setpixel(12, 31, sa);
setpixel(13, 31, sa);
setpixel(14, 31, sb);
setpixel(15, 31, sh);
setpixel(16, 31, sh);
setpixel(17, 31, sh);
setpixel(18, 31, sh);
setpixel(19, 31, sa);
setpixel(20, 31, sa);
setpixel(21, 31, sc);
setpixel(22, 31, sa);
setpixel(23, 31, sa);
setpixel(24, 31, sa);
setpixel(0, 32, sf);
setpixel(2, 32, sa);
setpixel(3, 32, sa);
setpixel(4, 32, sa);
setpixel(5, 32, sa);
setpixel(6, 32, sb);
setpixel(7, 32, sb);
setpixel(8, 32, sa);
setpixel(9, 32, sa);
setpixel(10, 32, sa);
setpixel(11, 32, sa);
setpixel(12, 32, sa);
setpixel(13, 32, sa);
setpixel(14, 32, sb);
setpixel(15, 32, sh);
setpixel(16, 32, sh);
setpixel(17, 32, sh);
setpixel(18, 32, sa);
setpixel(19, 32, sa);
setpixel(20, 32, sc);
setpixel(21, 32, sc);
setpixel(22, 32, sa);
setpixel(23, 32, sa);
setpixel(2, 33, sa);
setpixel(3, 33, sa);
setpixel(4, 33, sb);
setpixel(5, 33, sb);
setpixel(6, 33, sb);
setpixel(7, 33, sa);
setpixel(8, 33, sa);
setpixel(9, 33, sa);
setpixel(10, 33, sc);
setpixel(11, 33, sa);
setpixel(12, 33, sa);
setpixel(13, 33, sa);
setpixel(14, 33, sa);
setpixel(15, 33, sb);
setpixel(16, 33, sh);
setpixel(17, 33, sh);
setpixel(18, 33, sa);
setpixel(19, 33, sa);
setpixel(20, 33, sc);
setpixel(21, 33, sa);
setpixel(22, 33, sa);
setpixel(23, 33, sa);
setpixel(2, 34, sa);
setpixel(3, 34, sb);
setpixel(4, 34, sb);
setpixel(5, 34, sh);
setpixel(6, 34, sb);
setpixel(7, 34, sa);
setpixel(8, 34, sa);
setpixel(9, 34, sc);
setpixel(10, 34, sc);
setpixel(11, 34, sa);
setpixel(12, 34, sa);
setpixel(13, 34, sa);
setpixel(14, 34, sa);
setpixel(15, 34, sb);
setpixel(16, 34, sh);
setpixel(17, 34, sa);
setpixel(18, 34, sa);
setpixel(19, 34, sc);
setpixel(20, 34, sc);
setpixel(21, 34, sa);
setpixel(22, 34, sa);
setpixel(2, 35, sa);
setpixel(3, 35, sb);
setpixel(4, 35, sh);
setpixel(5, 35, sh);
setpixel(6, 35, sb);
setpixel(7, 35, sa);
setpixel(8, 35, sa);
setpixel(9, 35, sc);
setpixel(10, 35, sa);
setpixel(11, 35, sa);
setpixel(12, 35, sa);
setpixel(13, 35, sa);
setpixel(14, 35, sa);
setpixel(15, 35, sb);
setpixel(16, 35, sb);
setpixel(17, 35, sa);
setpixel(18, 35, sa);
setpixel(19, 35, sc);
setpixel(20, 35, sa);
setpixel(21, 35, sa);
setpixel(22, 35, sa);
setpixel(2, 36, sa);
setpixel(3, 36, sb);
setpixel(4, 36, sh);
setpixel(5, 36, sh);
setpixel(6, 36, sb);
setpixel(7, 36, sa);
setpixel(8, 36, sa);
setpixel(9, 36, sc);
setpixel(10, 36, sc);
setpixel(11, 36, sc);
setpixel(12, 36, sa);
setpixel(13, 36, sa);
setpixel(14, 36, sa);
setpixel(15, 36, sb);
setpixel(16, 36, sb);
setpixel(17, 36, sb);
setpixel(18, 36, sc);
setpixel(19, 36, sc);
setpixel(20, 36, sa);
setpixel(21, 36, sa);
setpixel(3, 37, sb);
setpixel(4, 37, sh);
setpixel(5, 37, sh);
setpixel(6, 37, sb);
setpixel(7, 37, sa);
setpixel(8, 37, sa);
setpixel(9, 37, sa);
setpixel(10, 37, sa);
setpixel(11, 37, sc);
setpixel(12, 37, sc);
setpixel(13, 37, sa);
setpixel(14, 37, sa);
setpixel(15, 37, sb);
setpixel(16, 37, sh);
setpixel(17, 37, sb);
setpixel(18, 37, sb);
setpixel(19, 37, sb);
setpixel(20, 37, sb);
setpixel(21, 37, sa);
setpixel(4, 38, sh);
setpixel(5, 38, sh);
setpixel(6, 38, sb);
setpixel(7, 38, sa);
setpixel(8, 38, sa);
setpixel(9, 38, sa);
setpixel(10, 38, sa);
setpixel(11, 38, sa);
setpixel(12, 38, sc);
setpixel(13, 38, sc);
setpixel(14, 38, sa);
setpixel(15, 38, sb);
setpixel(16, 38, sh);
setpixel(17, 38, sh);
setpixel(18, 38, sb);
setpixel(19, 38, sb);
setpixel(20, 38, sb);
setpixel(21, 38, sb);
setpixel(22, 38, sb);
setpixel(23, 38, sb);
setpixel(4, 39, sh);
setpixel(5, 39, sh);
setpixel(6, 39, sb);
setpixel(7, 39, sb);
setpixel(8, 39, sa);
setpixel(9, 39, sa);
setpixel(10, 39, sa);
setpixel(11, 39, sa);
setpixel(12, 39, sa);
setpixel(13, 39, sb);
setpixel(14, 39, sb);
setpixel(15, 39, sb);
setpixel(16, 39, sh);
setpixel(17, 39, sb);
setpixel(18, 39, sb);
setpixel(19, 39, sa);
setpixel(20, 39, sa);
setpixel(21, 39, sa);
setpixel(22, 39, sa);
setpixel(23, 39, sb);
setpixel(24, 39, sb);
setpixel(25, 39, sb);
setpixel(4, 40, sh);
setpixel(5, 40, sh);
setpixel(6, 40, sh);
setpixel(7, 40, sb);
setpixel(8, 40, sb);
setpixel(9, 40, sb);
setpixel(10, 40, sa);
setpixel(11, 40, sa);
setpixel(12, 40, sb);
setpixel(13, 40, sb);
setpixel(14, 40, sh);
setpixel(15, 40, sh);
setpixel(16, 40, sh);
setpixel(17, 40, sb);
setpixel(18, 40, sc);
setpixel(19, 40, sc);
setpixel(20, 40, sa);
setpixel(21, 40, sa);
setpixel(22, 40, sa);
setpixel(23, 40, sa);
setpixel(24, 40, sa);
setpixel(25, 40, sa);
setpixel(26, 40, sb);
setpixel(28, 40, sf);
setpixel(29, 40, sf);
setpixel(30, 40, sf);
setpixel(31, 40, sf);
setpixel(4, 41, sh);
setpixel(5, 41, sh);
setpixel(6, 41, sh);
setpixel(7, 41, sh);
setpixel(8, 41, sh);
setpixel(9, 41, sb);
setpixel(10, 41, sb);
setpixel(11, 41, sb);
setpixel(12, 41, sb);
setpixel(13, 41, sh);
setpixel(14, 41, sh);
setpixel(15, 41, sh);
setpixel(16, 41, sh);
setpixel(17, 41, sb);
setpixel(18, 41, sa);
setpixel(19, 41, sc);
setpixel(20, 41, sc);
setpixel(21, 41, sc);
setpixel(22, 41, sc);
setpixel(23, 41, sa);
setpixel(24, 41, sa);
setpixel(25, 41, sb);
setpixel(26, 41, sf);
setpixel(27, 41, sf);
setpixel(28, 41, sf);
setpixel(29, 41, sf);
setpixel(30, 41, sf);
setpixel(31, 41, sf);
setpixel(32, 41, sf);
setpixel(4, 42, sh);
setpixel(5, 42, sh);
setpixel(6, 42, sh);
setpixel(7, 42, sh);
setpixel(8, 42, sh);
setpixel(9, 42, sh);
setpixel(10, 42, sh);
setpixel(11, 42, sh);
setpixel(12, 42, sb);
setpixel(13, 42, sb);
setpixel(14, 42, sb);
setpixel(15, 42, sh);
setpixel(16, 42, sh);
setpixel(17, 42, sb);
setpixel(18, 42, sa);
setpixel(19, 42, sa);
setpixel(20, 42, sa);
setpixel(21, 42, sa);
setpixel(22, 42, sc);
setpixel(23, 42, sc);
setpixel(24, 42, sc);
setpixel(25, 42, sb);
setpixel(26, 42, sf);
setpixel(27, 42, sf);
setpixel(28, 42, sf);
setpixel(29, 42, sf);
setpixel(30, 42, sf);
setpixel(31, 42, sf);
setpixel(32, 42, sf);
setpixel(4, 43, sh);
setpixel(5, 43, sh);
setpixel(6, 43, sh);
setpixel(7, 43, sh);
setpixel(8, 43, sh);
setpixel(9, 43, sh);
setpixel(10, 43, sh);
setpixel(11, 43, sh);
setpixel(12, 43, sh);
setpixel(13, 43, sa);
setpixel(14, 43, sa);
setpixel(15, 43, sb);
setpixel(16, 43, sb);
setpixel(17, 43, sb);
setpixel(18, 43, sb);
setpixel(19, 43, sb);
setpixel(20, 43, sb);
setpixel(21, 43, sa);
setpixel(22, 43, sa);
setpixel(23, 43, sa);
setpixel(24, 43, sa);
setpixel(25, 43, sb);
setpixel(26, 43, sf);
setpixel(27, 43, sf);
setpixel(28, 43, sf);
setpixel(29, 43, sf);
setpixel(30, 43, sf);
setpixel(31, 43, sf);
setpixel(32, 43, sf);
setpixel(4, 44, sh);
setpixel(5, 44, sh);
setpixel(6, 44, sh);
setpixel(7, 44, sh);
setpixel(8, 44, sh);
setpixel(9, 44, sh);
setpixel(10, 44, sh);
setpixel(11, 44, sh);
setpixel(12, 44, sh);
setpixel(13, 44, sa);
setpixel(14, 44, sa);
setpixel(15, 44, sc);
setpixel(16, 44, sa);
setpixel(18, 44, sb);
setpixel(19, 44, sb);
setpixel(20, 44, sb);
setpixel(21, 44, sb);
setpixel(22, 44, sb);
setpixel(23, 44, sa);
setpixel(24, 44, sa);
setpixel(25, 44, sb);
setpixel(26, 44, sf);
setpixel(27, 44, sf);
setpixel(28, 44, sf);
setpixel(29, 44, sf);
setpixel(30, 44, sf);
setpixel(31, 44, sf);
setpixel(32, 44, sf);
setpixel(4, 45, sh);
setpixel(5, 45, sh);
setpixel(6, 45, sh);
setpixel(7, 45, sh);
setpixel(8, 45, sh);
setpixel(9, 45, sh);
setpixel(10, 45, sh);
setpixel(11, 45, sh);
setpixel(12, 45, sh);
setpixel(13, 45, sa);
setpixel(14, 45, sa);
setpixel(15, 45, sa);
setpixel(22, 45, sb);
setpixel(23, 45, sb);
setpixel(24, 45, sb);
setpixel(25, 45, sb);
setpixel(27, 45, sf);
setpixel(28, 45, sf);
setpixel(29, 45, sf);
setpixel(30, 45, sf);
setpixel(31, 45, sf);
setpixel(32, 45, sf);
setpixel(3, 46, sb);
setpixel(4, 46, sb);
setpixel(5, 46, sb);
setpixel(6, 46, sb);
setpixel(7, 46, sb);
setpixel(8, 46, sb);
setpixel(9, 46, sb);
setpixel(10, 46, sb);
setpixel(11, 46, sb);
setpixel(12, 46, sb);
setpixel(13, 46, sb);
setpixel(14, 46, sb);
setpixel(15, 46, sb);
setpixel(16, 46, sb);
setpixel(28, 46, sf);
setpixel(29, 46, sf);
setpixel(30, 46, sf);
setpixel(31, 46, sf);
setpixel(3, 47, sb);
setpixel(4, 47, sb);
setpixel(5, 47, sb);
setpixel(6, 47, sb);
setpixel(7, 47, sb);
setpixel(8, 47, sb);
setpixel(9, 47, sb);
setpixel(10, 47, sb);
setpixel(11, 47, sb);
setpixel(12, 47, sb);
setpixel(13, 47, sb);
setpixel(14, 47, sb);
setpixel(15, 47, sb);
setpixel(16, 47, sb);
setpixel(3, 48, sb);
setpixel(4, 48, sb);
setpixel(5, 48, sb);
setpixel(6, 48, sb);
setpixel(7, 48, sb);
setpixel(8, 48, sb);
setpixel(9, 48, sb);
setpixel(10, 48, sb);
setpixel(11, 48, sb);
setpixel(12, 48, sb);
setpixel(13, 48, sb);
setpixel(14, 48, sb);
setpixel(15, 48, sb);
setpixel(16, 48, sb);
setpixel(4, 49, sa);
setpixel(5, 49, sa);
setpixel(6, 49, sa);
setpixel(7, 49, sa);
setpixel(8, 49, sa);
setpixel(9, 49, sa);
setpixel(10, 49, sa);
setpixel(11, 49, sa);
setpixel(12, 49, sa);
setpixel(13, 49, sa);
setpixel(14, 49, sa);
setpixel(15, 49, sa);
setpixel(4, 50, sb);
setpixel(5, 50, sa);
setpixel(6, 50, sa);
setpixel(7, 50, sc);
setpixel(8, 50, sa);
setpixel(9, 50, sa);
setpixel(10, 50, sa);
setpixel(11, 50, sa);
setpixel(12, 50, sa);
setpixel(13, 50, sa);
setpixel(14, 50, sa);
setpixel(15, 50, sa);
setpixel(4, 51, sb);
setpixel(5, 51, sa);
setpixel(6, 51, sa);
setpixel(7, 51, sc);
setpixel(8, 51, sc);
setpixel(9, 51, sa);
setpixel(10, 51, sa);
setpixel(11, 51, sa);
setpixel(12, 51, sa);
setpixel(13, 51, sa);
setpixel(14, 51, sa);
setpixel(15, 51, sa);
setpixel(16, 51, sa);
setpixel(4, 52, sb);
setpixel(5, 52, sa);
setpixel(6, 52, sa);
setpixel(7, 52, sa);
setpixel(8, 52, sa);
setpixel(9, 52, sc);
setpixel(10, 52, sa);
setpixel(11, 52, sa);
setpixel(12, 52, sa);
setpixel(13, 52, sa);
setpixel(14, 52, sa);
setpixel(15, 52, sa);
setpixel(16, 52, sa);
setpixel(4, 53, sb);
setpixel(5, 53, sa);
setpixel(6, 53, sa);
setpixel(7, 53, sa);
setpixel(8, 53, sa);
setpixel(9, 53, sc);
setpixel(10, 53, sc);
setpixel(11, 53, sa);
setpixel(12, 53, sa);
setpixel(13, 53, sa);
setpixel(14, 53, sa);
setpixel(15, 53, sa);
setpixel(16, 53, sa);
setpixel(4, 54, sb);
setpixel(5, 54, sa);
setpixel(6, 54, sa);
setpixel(7, 54, sa);
setpixel(8, 54, sa);
setpixel(9, 54, sa);
setpixel(10, 54, sc);
setpixel(11, 54, sc);
setpixel(12, 54, sa);
setpixel(13, 54, sa);
setpixel(14, 54, sa);
setpixel(15, 54, sa);
setpixel(16, 54, sa);
setpixel(17, 54, sa);
setpixel(4, 55, sh);
setpixel(5, 55, sb);
setpixel(6, 55, sa);
setpixel(7, 55, sa);
setpixel(8, 55, sa);
setpixel(9, 55, sa);
setpixel(10, 55, sa);
setpixel(11, 55, sc);
setpixel(12, 55, sa);
setpixel(13, 55, sa);
setpixel(14, 55, sa);
setpixel(15, 55, sa);
setpixel(16, 55, sa);
setpixel(17, 55, sa);
setpixel(4, 56, sh);
setpixel(5, 56, sb);
setpixel(6, 56, sb);
setpixel(7, 56, sa);
setpixel(8, 56, sa);
setpixel(9, 56, sa);
setpixel(10, 56, sa);
setpixel(11, 56, sc);
setpixel(12, 56, sc);
setpixel(13, 56, sa);
setpixel(14, 56, sa);
setpixel(15, 56, sa);
setpixel(16, 56, sa);
setpixel(17, 56, sa);
setpixel(4, 57, sh);
setpixel(5, 57, sh);
setpixel(6, 57, sb);
setpixel(7, 57, sa);
setpixel(8, 57, sa);
setpixel(9, 57, sa);
setpixel(10, 57, sa);
setpixel(11, 57, sa);
setpixel(12, 57, sc);
setpixel(13, 57, sa);
setpixel(14, 57, sa);
setpixel(15, 57, sa);
setpixel(16, 57, sa);
setpixel(17, 57, sa);
setpixel(18, 57, sa);
setpixel(5, 58, sh);
setpixel(6, 58, sb);
setpixel(7, 58, sa);
setpixel(8, 58, sa);
setpixel(9, 58, sa);
setpixel(10, 58, sa);
setpixel(11, 58, sa);
setpixel(12, 58, sc);
setpixel(13, 58, sa);
setpixel(14, 58, sa);
setpixel(15, 58, sa);
setpixel(16, 58, sa);
setpixel(17, 58, sa);
setpixel(18, 58, sa);
setpixel(5, 59, sh);
setpixel(6, 59, sh);
setpixel(7, 59, sa);
setpixel(8, 59, sa);
setpixel(9, 59, sa);
setpixel(10, 59, sa);
setpixel(11, 59, sa);
setpixel(12, 59, sc);
setpixel(13, 59, sa);
setpixel(14, 59, sa);
setpixel(15, 59, sa);
setpixel(16, 59, sa);
setpixel(17, 59, sa);
setpixel(18, 59, sa);
setpixel(6, 60, sh);
setpixel(7, 60, sh);
setpixel(8, 60, sa);
setpixel(9, 60, sa);
setpixel(10, 60, sa);
setpixel(11, 60, sa);
setpixel(12, 60, sa);
setpixel(13, 60, sc);
setpixel(14, 60, sa);
setpixel(15, 60, sa);
setpixel(16, 60, sa);
setpixel(17, 60, sa);
setpixel(18, 60, sa);
setpixel(6, 61, sh);
setpixel(7, 61, sh);
setpixel(8, 61, sh);
setpixel(9, 61, sh);
setpixel(10, 61, sa);
setpixel(11, 61, sa);
setpixel(12, 61, sa);
setpixel(13, 61, sc);
setpixel(14, 61, sa);
setpixel(15, 61, sa);
setpixel(16, 61, sa);
setpixel(17, 61, sa);
setpixel(18, 61, sa);
setpixel(7, 62, sh);
setpixel(8, 62, sh);
setpixel(9, 62, sh);
setpixel(10, 62, sh);
setpixel(11, 62, sa);
setpixel(12, 62, sa);
setpixel(13, 62, sc);
setpixel(14, 62, sa);
setpixel(15, 62, sa);
setpixel(16, 62, sa);
setpixel(17, 62, sa);
setpixel(18, 62, sa);
setpixel(8, 63, sh);
setpixel(9, 63, sh);
setpixel(10, 63, sh);
setpixel(11, 63, sh);
setpixel(12, 63, sa);
setpixel(13, 63, sa);
setpixel(14, 63, sa);
setpixel(15, 63, sa);
setpixel(16, 63, sa);
setpixel(17, 63, sa);
setpixel(18, 63, sa);
setpixel(9, 64, sh);
setpixel(10, 64, sh);
setpixel(11, 64, sh);
setpixel(12, 64, sh);
setpixel(13, 64, sh);
setpixel(14, 64, sh);
setpixel(15, 64, sh);
setpixel(16, 64, sh);
setpixel(17, 64, sh);
setpixel(10, 65, sh);
setpixel(11, 65, sh);
setpixel(12, 65, sh);
setpixel(13, 65, sh);
setpixel(14, 65, sh);
setpixel(15, 65, sh);
setpixel(16, 65, sh);
setpixel(17, 65, sh);
setpixel(10, 66, sh);
setpixel(11, 66, sh);
setpixel(12, 66, sh);
setpixel(13, 66, sh);
setpixel(14, 66, sa);
setpixel(15, 66, sa);
setpixel(16, 66, sa);
setpixel(17, 66, sa);
setpixel(18, 66, sa);
setpixel(10, 67, sh);
setpixel(11, 67, sh);
setpixel(12, 67, sa);
setpixel(13, 67, sa);
setpixel(14, 67, sa);
setpixel(15, 67, sa);
setpixel(16, 67, sa);
setpixel(17, 67, sa);
setpixel(18, 67, sa);
setpixel(9, 68, sh);
setpixel(10, 68, sh);
setpixel(11, 68, sa);
setpixel(12, 68, sa);
setpixel(13, 68, sa);
setpixel(14, 68, sa);
setpixel(15, 68, sa);
setpixel(16, 68, sa);
setpixel(17, 68, sa);
setpixel(18, 68, sa);
setpixel(9, 69, sh);
setpixel(10, 69, sa);
setpixel(11, 69, sa);
setpixel(12, 69, sa);
setpixel(13, 69, sa);
setpixel(14, 69, sc);
setpixel(15, 69, sa);
setpixel(16, 69, sa);
setpixel(17, 69, sa);
setpixel(18, 69, sa);
setpixel(8, 70, sh);
setpixel(9, 70, sh);
setpixel(10, 70, sa);
setpixel(11, 70, sa);
setpixel(12, 70, sa);
setpixel(13, 70, sa);
setpixel(14, 70, sc);
setpixel(15, 70, sa);
setpixel(16, 70, sa);
setpixel(17, 70, sa);
setpixel(18, 70, sa);
setpixel(7, 71, sh);
setpixel(8, 71, sh);
setpixel(9, 71, sa);
setpixel(10, 71, sa);
setpixel(11, 71, sa);
setpixel(12, 71, sa);
setpixel(13, 71, sc);
setpixel(14, 71, sc);
setpixel(15, 71, sa);
setpixel(16, 71, sa);
setpixel(17, 71, sa);
setpixel(18, 71, sa);
setpixel(7, 72, sh);
setpixel(8, 72, sh);
setpixel(9, 72, sa);
setpixel(10, 72, sa);
setpixel(11, 72, sa);
setpixel(12, 72, sa);
setpixel(13, 72, sc);
setpixel(14, 72, sa);
setpixel(15, 72, sa);
setpixel(16, 72, sa);
setpixel(17, 72, sa);
setpixel(6, 73, sh);
setpixel(7, 73, sh);
setpixel(8, 73, sh);
setpixel(9, 73, sa);
setpixel(10, 73, sa);
setpixel(11, 73, sa);
setpixel(12, 73, sc);
setpixel(13, 73, sc);
setpixel(14, 73, sa);
setpixel(15, 73, sa);
setpixel(16, 73, sa);
setpixel(17, 73, sa);
setpixel(6, 74, sh);
setpixel(7, 74, sh);
setpixel(8, 74, sa);
setpixel(9, 74, sa);
setpixel(10, 74, sc);
setpixel(11, 74, sc);
setpixel(12, 74, sc);
setpixel(13, 74, sa);
setpixel(14, 74, sa);
setpixel(15, 74, sa);
setpixel(16, 74, sa);
setpixel(6, 75, sh);
setpixel(7, 75, sh);
setpixel(8, 75, sa);
setpixel(9, 75, sa);
setpixel(10, 75, sa);
setpixel(11, 75, sa);
setpixel(12, 75, sa);
setpixel(13, 75, sa);
setpixel(14, 75, sa);
setpixel(15, 75, sa);
setpixel(6, 76, sh);
setpixel(7, 76, sh);
setpixel(8, 76, sa);
setpixel(9, 76, sa);
setpixel(10, 76, sa);
setpixel(11, 76, sa);
setpixel(12, 76, sa);
setpixel(13, 76, sa);
setpixel(5, 77, sb);
setpixel(6, 77, sb);
setpixel(7, 77, sb);
setpixel(8, 77, sb);
setpixel(9, 77, sb);
setpixel(10, 77, sb);
setpixel(11, 77, sb);
setpixel(12, 77, sb);
setpixel(13, 77, sb);
setpixel(14, 77, sb);
setpixel(5, 78, sb);
setpixel(6, 78, sa);
setpixel(7, 78, sa);
setpixel(8, 78, sa);
setpixel(9, 78, sa);
setpixel(10, 78, sa);
setpixel(11, 78, sa);
setpixel(12, 78, sa);
setpixel(13, 78, sa);
setpixel(14, 78, sb);
setpixel(5, 79, sb);
setpixel(6, 79, sa);
setpixel(7, 79, sa);
setpixel(8, 79, sa);
setpixel(9, 79, sa);
setpixel(10, 79, sa);
setpixel(11, 79, sa);
setpixel(12, 79, sa);
setpixel(13, 79, sb);
setpixel(6, 80, sb);
setpixel(7, 80, sb);
setpixel(8, 80, sb);
setpixel(9, 80, sb);
setpixel(10, 80, sb);
setpixel(11, 80, sb);
setpixel(12, 80, sb);
setpixel(13, 80, sb);
setpixel(6, 81, sb);
setpixel(7, 81, sa);
setpixel(8, 81, sa);
setpixel(9, 81, sa);
setpixel(10, 81, sa);
setpixel(11, 81, sa);
setpixel(12, 81, sa);
setpixel(13, 81, sa);
setpixel(14, 81, sb);
setpixel(6, 82, sb);
setpixel(7, 82, sa);
setpixel(8, 82, sa);
setpixel(9, 82, sa);
setpixel(10, 82, sa);
setpixel(11, 82, sa);
setpixel(12, 82, sa);
setpixel(13, 82, sa);
setpixel(14, 82, sb);
setpixel(6, 83, sb);
setpixel(7, 83, sa);
setpixel(8, 83, sa);
setpixel(9, 83, sa);
setpixel(10, 83, sa);
setpixel(11, 83, sa);
setpixel(12, 83, sa);
setpixel(13, 83, sa);
setpixel(14, 83, sb);
setpixel(6, 84, sb);
setpixel(7, 84, sa);
setpixel(8, 84, sa);
setpixel(9, 84, sa);
setpixel(10, 84, sa);
setpixel(11, 84, sa);
setpixel(12, 84, sa);
setpixel(13, 84, sa);
setpixel(14, 84, sb);
setpixel(6, 85, sb);
setpixel(7, 85, sa);
setpixel(8, 85, sa);
setpixel(9, 85, sa);
setpixel(10, 85, sa);
setpixel(11, 85, sa);
setpixel(12, 85, sa);
setpixel(13, 85, sa);
setpixel(14, 85, sb);
setpixel(5, 86, sb);
setpixel(6, 86, sb);
setpixel(7, 86, sa);
setpixel(8, 86, sa);
setpixel(9, 86, sa);
setpixel(10, 86, sa);
setpixel(11, 86, sb);
setpixel(12, 86, sb);
setpixel(13, 86, sb);
setpixel(14, 86, sb);
setpixel(5, 87, sb);
setpixel(6, 87, sa);
setpixel(7, 87, sa);
setpixel(8, 87, sb);
setpixel(9, 87, sb);
setpixel(10, 87, sb);
setpixel(11, 87, sa);
setpixel(12, 87, sa);
setpixel(13, 87, sa);
setpixel(14, 87, sa);
setpixel(15, 87, sb);
setpixel(5, 88, sb);
setpixel(6, 88, sa);
setpixel(7, 88, sb);
setpixel(8, 88, sb);
setpixel(9, 88, sa);
setpixel(10, 88, sa);
setpixel(11, 88, sa);
setpixel(12, 88, sa);
setpixel(13, 88, sa);
setpixel(14, 88, sb);
setpixel(15, 88, sb);
setpixel(16, 88, sb);
setpixel(17, 88, sb);
setpixel(18, 88, sb);
setpixel(19, 88, sb);
setpixel(20, 88, sb);
setpixel(5, 89, sb);
setpixel(6, 89, sa);
setpixel(7, 89, sb);
setpixel(8, 89, sa);
setpixel(9, 89, sa);
setpixel(10, 89, sa);
setpixel(11, 89, sa);
setpixel(12, 89, sa);
setpixel(13, 89, sb);
setpixel(14, 89, sb);
setpixel(15, 89, sa);
setpixel(16, 89, sa);
setpixel(17, 89, sa);
setpixel(18, 89, sb);
setpixel(19, 89, sa);
setpixel(20, 89, sa);
setpixel(21, 89, sb);
setpixel(22, 89, sb);
setpixel(5, 90, sb);
setpixel(6, 90, sa);
setpixel(7, 90, sb);
setpixel(8, 90, sa);
setpixel(9, 90, sa);
setpixel(10, 90, sa);
setpixel(11, 90, sa);
setpixel(12, 90, sb);
setpixel(13, 90, sa);
setpixel(14, 90, sa);
setpixel(15, 90, sa);
setpixel(16, 90, sa);
setpixel(17, 90, sb);
setpixel(18, 90, sa);
setpixel(19, 90, sa);
setpixel(20, 90, sa);
setpixel(21, 90, sa);
setpixel(22, 90, sb);
setpixel(5, 91, sb);
setpixel(6, 91, sb);
setpixel(7, 91, sb);
setpixel(8, 91, sb);
setpixel(9, 91, sb);
setpixel(10, 91, sb);
setpixel(11, 91, sb);
setpixel(12, 91, sb);
setpixel(13, 91, sb);
setpixel(14, 91, sb);
setpixel(15, 91, sb);
setpixel(16, 91, sb);
setpixel(17, 91, sb);
setpixel(18, 91, sb);
setpixel(19, 91, sb);
setpixel(20, 91, sb);
setpixel(21, 91, sb);
setpixel(22, 91, sb);


for ( int c = 0; c < 91; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}




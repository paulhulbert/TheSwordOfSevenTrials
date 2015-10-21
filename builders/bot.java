/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
//import weapons.pointattack;
/**
 *
 * @author Dad
 */
public class bot extends unit {
    
    private int counterjump;
    
    public bot( room currentroom, int x, int y, AI ai )
    {
        super( 30, 0, 4, "pointattackblue", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        counterjump = 0;
        
        buildvil1();
        
    
    }
    
    @Override
    public void respawn()
    {
        super.respawn();
        
        y = 450;
        
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( life > 0 ) {
            current.addhurtpoint( new hurtpoint( x, y, 2, this ) );
        }
        
        this.jump();
        
        if ( this.gety() + this.getfig().getlength() > 480 ) {
            counterjump++;
        } else {
            counterjump = 0;
        }
    }
       
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(38);
        f.setlength(18);
        
        this.sety( this.gety() - f.getlength());
        

Color sa = new Color(0,0,0);
Color sb = new Color(0,51,255);
Color sc = new Color(255,255,255);









//<editor-fold defaultstate="collapsed" desc="build figure">

f.setpixel(16, 0, sa);
f.setpixel(17, 0, sa);
f.setpixel(18, 0, sa);
f.setpixel(19, 0, sa);
f.setpixel(20, 0, sa);
f.setpixel(21, 0, sa);
f.setpixel(22, 0, sa);
f.setpixel(23, 0, sa);
f.setpixel(13, 1, sa);
f.setpixel(14, 1, sa);
f.setpixel(15, 1, sa);
f.setpixel(16, 1, sb);
f.setpixel(17, 1, sb);
f.setpixel(18, 1, sb);
f.setpixel(19, 1, sb);
f.setpixel(20, 1, sb);
f.setpixel(21, 1, sb);
f.setpixel(22, 1, sb);
f.setpixel(23, 1, sb);
f.setpixel(24, 1, sa);
f.setpixel(25, 1, sa);
f.setpixel(26, 1, sa);
f.setpixel(10, 2, sa);
f.setpixel(11, 2, sa);
f.setpixel(12, 2, sa);
f.setpixel(13, 2, sb);
f.setpixel(14, 2, sb);
f.setpixel(15, 2, sb);
f.setpixel(16, 2, sb);
f.setpixel(17, 2, sb);
f.setpixel(18, 2, sb);
f.setpixel(19, 2, sb);
f.setpixel(20, 2, sb);
f.setpixel(21, 2, sb);
f.setpixel(22, 2, sb);
f.setpixel(23, 2, sb);
f.setpixel(24, 2, sb);
f.setpixel(25, 2, sb);
f.setpixel(26, 2, sb);
f.setpixel(27, 2, sa);
f.setpixel(28, 2, sa);
f.setpixel(29, 2, sa);
f.setpixel(8, 3, sa);
f.setpixel(9, 3, sa);
f.setpixel(10, 3, sb);
f.setpixel(11, 3, sb);
f.setpixel(12, 3, sb);
f.setpixel(13, 3, sb);
f.setpixel(14, 3, sb);
f.setpixel(15, 3, sb);
f.setpixel(16, 3, sb);
f.setpixel(17, 3, sb);
f.setpixel(18, 3, sb);
f.setpixel(19, 3, sb);
f.setpixel(20, 3, sb);
f.setpixel(21, 3, sb);
f.setpixel(22, 3, sb);
f.setpixel(23, 3, sb);
f.setpixel(24, 3, sb);
f.setpixel(25, 3, sb);
f.setpixel(26, 3, sb);
f.setpixel(27, 3, sb);
f.setpixel(28, 3, sb);
f.setpixel(29, 3, sb);
f.setpixel(30, 3, sa);
f.setpixel(31, 3, sa);
f.setpixel(6, 4, sa);
f.setpixel(7, 4, sa);
f.setpixel(8, 4, sb);
f.setpixel(9, 4, sb);
f.setpixel(10, 4, sb);
f.setpixel(11, 4, sb);
f.setpixel(12, 4, sb);
f.setpixel(13, 4, sb);
f.setpixel(14, 4, sb);
f.setpixel(15, 4, sb);
f.setpixel(16, 4, sb);
f.setpixel(17, 4, sb);
f.setpixel(18, 4, sb);
f.setpixel(19, 4, sb);
f.setpixel(20, 4, sb);
f.setpixel(21, 4, sb);
f.setpixel(22, 4, sb);
f.setpixel(23, 4, sb);
f.setpixel(24, 4, sb);
f.setpixel(25, 4, sb);
f.setpixel(26, 4, sb);
f.setpixel(27, 4, sb);
f.setpixel(28, 4, sb);
f.setpixel(29, 4, sb);
f.setpixel(30, 4, sb);
f.setpixel(31, 4, sb);
f.setpixel(32, 4, sa);
f.setpixel(33, 4, sa);
f.setpixel(5, 5, sa);
f.setpixel(6, 5, sb);
f.setpixel(7, 5, sb);
f.setpixel(8, 5, sb);
f.setpixel(9, 5, sb);
f.setpixel(10, 5, sb);
f.setpixel(11, 5, sb);
f.setpixel(12, 5, sb);
f.setpixel(13, 5, sc);
f.setpixel(14, 5, sc);
f.setpixel(15, 5, sb);
f.setpixel(16, 5, sb);
f.setpixel(17, 5, sb);
f.setpixel(18, 5, sb);
f.setpixel(19, 5, sb);
f.setpixel(20, 5, sb);
f.setpixel(21, 5, sb);
f.setpixel(22, 5, sb);
f.setpixel(23, 5, sb);
f.setpixel(24, 5, sb);
f.setpixel(25, 5, sc);
f.setpixel(26, 5, sc);
f.setpixel(27, 5, sb);
f.setpixel(28, 5, sb);
f.setpixel(29, 5, sb);
f.setpixel(30, 5, sb);
f.setpixel(31, 5, sb);
f.setpixel(32, 5, sb);
f.setpixel(33, 5, sb);
f.setpixel(34, 5, sa);
f.setpixel(4, 6, sa);
f.setpixel(5, 6, sb);
f.setpixel(6, 6, sb);
f.setpixel(7, 6, sb);
f.setpixel(8, 6, sb);
f.setpixel(9, 6, sb);
f.setpixel(10, 6, sb);
f.setpixel(11, 6, sb);
f.setpixel(12, 6, sc);
f.setpixel(13, 6, sa);
f.setpixel(14, 6, sa);
f.setpixel(15, 6, sc);
f.setpixel(16, 6, sb);
f.setpixel(17, 6, sb);
f.setpixel(18, 6, sb);
f.setpixel(19, 6, sb);
f.setpixel(20, 6, sb);
f.setpixel(21, 6, sb);
f.setpixel(22, 6, sb);
f.setpixel(23, 6, sb);
f.setpixel(24, 6, sc);
f.setpixel(25, 6, sa);
f.setpixel(26, 6, sa);
f.setpixel(27, 6, sc);
f.setpixel(28, 6, sb);
f.setpixel(29, 6, sb);
f.setpixel(30, 6, sb);
f.setpixel(31, 6, sb);
f.setpixel(32, 6, sb);
f.setpixel(33, 6, sb);
f.setpixel(34, 6, sb);
f.setpixel(35, 6, sa);
f.setpixel(4, 7, sa);
f.setpixel(5, 7, sb);
f.setpixel(6, 7, sb);
f.setpixel(7, 7, sb);
f.setpixel(8, 7, sb);
f.setpixel(9, 7, sb);
f.setpixel(10, 7, sb);
f.setpixel(11, 7, sb);
f.setpixel(12, 7, sc);
f.setpixel(13, 7, sa);
f.setpixel(14, 7, sa);
f.setpixel(15, 7, sc);
f.setpixel(16, 7, sb);
f.setpixel(17, 7, sb);
f.setpixel(18, 7, sb);
f.setpixel(19, 7, sb);
f.setpixel(20, 7, sb);
f.setpixel(21, 7, sb);
f.setpixel(22, 7, sb);
f.setpixel(23, 7, sb);
f.setpixel(24, 7, sc);
f.setpixel(25, 7, sa);
f.setpixel(26, 7, sa);
f.setpixel(27, 7, sc);
f.setpixel(28, 7, sb);
f.setpixel(29, 7, sb);
f.setpixel(30, 7, sb);
f.setpixel(31, 7, sb);
f.setpixel(32, 7, sb);
f.setpixel(33, 7, sb);
f.setpixel(34, 7, sb);
f.setpixel(35, 7, sa);
f.setpixel(3, 8, sa);
f.setpixel(4, 8, sb);
f.setpixel(5, 8, sb);
f.setpixel(6, 8, sb);
f.setpixel(7, 8, sb);
f.setpixel(8, 8, sb);
f.setpixel(9, 8, sb);
f.setpixel(10, 8, sb);
f.setpixel(11, 8, sb);
f.setpixel(12, 8, sb);
f.setpixel(13, 8, sc);
f.setpixel(14, 8, sc);
f.setpixel(15, 8, sb);
f.setpixel(16, 8, sb);
f.setpixel(17, 8, sb);
f.setpixel(18, 8, sb);
f.setpixel(19, 8, sb);
f.setpixel(20, 8, sb);
f.setpixel(21, 8, sb);
f.setpixel(22, 8, sb);
f.setpixel(23, 8, sb);
f.setpixel(24, 8, sb);
f.setpixel(25, 8, sc);
f.setpixel(26, 8, sc);
f.setpixel(27, 8, sb);
f.setpixel(28, 8, sb);
f.setpixel(29, 8, sb);
f.setpixel(30, 8, sb);
f.setpixel(31, 8, sb);
f.setpixel(32, 8, sb);
f.setpixel(33, 8, sb);
f.setpixel(34, 8, sb);
f.setpixel(35, 8, sb);
f.setpixel(36, 8, sa);
f.setpixel(3, 9, sa);
f.setpixel(4, 9, sb);
f.setpixel(5, 9, sb);
f.setpixel(6, 9, sb);
f.setpixel(7, 9, sb);
f.setpixel(8, 9, sb);
f.setpixel(9, 9, sb);
f.setpixel(10, 9, sb);
f.setpixel(11, 9, sb);
f.setpixel(12, 9, sb);
f.setpixel(13, 9, sb);
f.setpixel(14, 9, sb);
f.setpixel(15, 9, sb);
f.setpixel(16, 9, sb);
f.setpixel(17, 9, sb);
f.setpixel(18, 9, sb);
f.setpixel(19, 9, sb);
f.setpixel(20, 9, sb);
f.setpixel(21, 9, sb);
f.setpixel(22, 9, sb);
f.setpixel(23, 9, sb);
f.setpixel(24, 9, sb);
f.setpixel(25, 9, sb);
f.setpixel(26, 9, sb);
f.setpixel(27, 9, sb);
f.setpixel(28, 9, sb);
f.setpixel(29, 9, sb);
f.setpixel(30, 9, sb);
f.setpixel(31, 9, sb);
f.setpixel(32, 9, sb);
f.setpixel(33, 9, sb);
f.setpixel(34, 9, sb);
f.setpixel(35, 9, sb);
f.setpixel(36, 9, sa);
f.setpixel(2, 10, sa);
f.setpixel(3, 10, sb);
f.setpixel(4, 10, sb);
f.setpixel(5, 10, sb);
f.setpixel(6, 10, sb);
f.setpixel(7, 10, sb);
f.setpixel(8, 10, sb);
f.setpixel(9, 10, sb);
f.setpixel(10, 10, sb);
f.setpixel(11, 10, sb);
f.setpixel(12, 10, sb);
f.setpixel(13, 10, sb);
f.setpixel(14, 10, sb);
f.setpixel(15, 10, sb);
f.setpixel(16, 10, sb);
f.setpixel(17, 10, sb);
f.setpixel(18, 10, sb);
f.setpixel(19, 10, sb);
f.setpixel(20, 10, sb);
f.setpixel(21, 10, sb);
f.setpixel(22, 10, sb);
f.setpixel(23, 10, sb);
f.setpixel(24, 10, sb);
f.setpixel(25, 10, sb);
f.setpixel(26, 10, sb);
f.setpixel(27, 10, sb);
f.setpixel(28, 10, sb);
f.setpixel(29, 10, sb);
f.setpixel(30, 10, sb);
f.setpixel(31, 10, sb);
f.setpixel(32, 10, sb);
f.setpixel(33, 10, sb);
f.setpixel(34, 10, sb);
f.setpixel(35, 10, sb);
f.setpixel(36, 10, sb);
f.setpixel(37, 10, sa);
f.setpixel(2, 11, sa);
f.setpixel(3, 11, sb);
f.setpixel(4, 11, sb);
f.setpixel(5, 11, sb);
f.setpixel(6, 11, sb);
f.setpixel(7, 11, sb);
f.setpixel(8, 11, sb);
f.setpixel(9, 11, sb);
f.setpixel(10, 11, sb);
f.setpixel(11, 11, sb);
f.setpixel(12, 11, sb);
f.setpixel(13, 11, sb);
f.setpixel(14, 11, sb);
f.setpixel(15, 11, sb);
f.setpixel(16, 11, sb);
f.setpixel(17, 11, sb);
f.setpixel(18, 11, sb);
f.setpixel(19, 11, sb);
f.setpixel(20, 11, sb);
f.setpixel(21, 11, sb);
f.setpixel(22, 11, sb);
f.setpixel(23, 11, sb);
f.setpixel(24, 11, sb);
f.setpixel(25, 11, sb);
f.setpixel(26, 11, sb);
f.setpixel(27, 11, sb);
f.setpixel(28, 11, sb);
f.setpixel(29, 11, sb);
f.setpixel(30, 11, sb);
f.setpixel(31, 11, sb);
f.setpixel(32, 11, sb);
f.setpixel(33, 11, sb);
f.setpixel(34, 11, sb);
f.setpixel(35, 11, sb);
f.setpixel(36, 11, sb);
f.setpixel(37, 11, sa);
f.setpixel(2, 12, sa);
f.setpixel(3, 12, sb);
f.setpixel(4, 12, sb);
f.setpixel(5, 12, sb);
f.setpixel(6, 12, sb);
f.setpixel(7, 12, sb);
f.setpixel(8, 12, sb);
f.setpixel(9, 12, sb);
f.setpixel(10, 12, sb);
f.setpixel(11, 12, sb);
f.setpixel(12, 12, sb);
f.setpixel(13, 12, sb);
f.setpixel(14, 12, sb);
f.setpixel(15, 12, sb);
f.setpixel(16, 12, sb);
f.setpixel(17, 12, sb);
f.setpixel(18, 12, sb);
f.setpixel(19, 12, sb);
f.setpixel(20, 12, sb);
f.setpixel(21, 12, sb);
f.setpixel(22, 12, sb);
f.setpixel(23, 12, sb);
f.setpixel(24, 12, sb);
f.setpixel(25, 12, sb);
f.setpixel(26, 12, sb);
f.setpixel(27, 12, sb);
f.setpixel(28, 12, sb);
f.setpixel(29, 12, sb);
f.setpixel(30, 12, sb);
f.setpixel(31, 12, sb);
f.setpixel(32, 12, sb);
f.setpixel(33, 12, sb);
f.setpixel(34, 12, sb);
f.setpixel(35, 12, sb);
f.setpixel(36, 12, sb);
f.setpixel(37, 12, sa);
f.setpixel(1, 13, sa);
f.setpixel(2, 13, sb);
f.setpixel(3, 13, sb);
f.setpixel(4, 13, sb);
f.setpixel(5, 13, sb);
f.setpixel(6, 13, sb);
f.setpixel(7, 13, sb);
f.setpixel(8, 13, sb);
f.setpixel(9, 13, sb);
f.setpixel(10, 13, sb);
f.setpixel(11, 13, sb);
f.setpixel(12, 13, sb);
f.setpixel(13, 13, sb);
f.setpixel(14, 13, sb);
f.setpixel(15, 13, sb);
f.setpixel(16, 13, sb);
f.setpixel(17, 13, sb);
f.setpixel(18, 13, sb);
f.setpixel(19, 13, sb);
f.setpixel(20, 13, sb);
f.setpixel(21, 13, sb);
f.setpixel(22, 13, sb);
f.setpixel(23, 13, sb);
f.setpixel(24, 13, sb);
f.setpixel(25, 13, sb);
f.setpixel(26, 13, sb);
f.setpixel(27, 13, sb);
f.setpixel(28, 13, sb);
f.setpixel(29, 13, sb);
f.setpixel(30, 13, sb);
f.setpixel(31, 13, sb);
f.setpixel(32, 13, sb);
f.setpixel(33, 13, sb);
f.setpixel(34, 13, sb);
f.setpixel(35, 13, sb);
f.setpixel(36, 13, sb);
f.setpixel(37, 13, sb);
f.setpixel(38, 13, sa);
f.setpixel(1, 14, sa);
f.setpixel(2, 14, sb);
f.setpixel(3, 14, sb);
f.setpixel(4, 14, sb);
f.setpixel(5, 14, sb);
f.setpixel(6, 14, sb);
f.setpixel(7, 14, sb);
f.setpixel(8, 14, sb);
f.setpixel(9, 14, sb);
f.setpixel(10, 14, sb);
f.setpixel(11, 14, sb);
f.setpixel(12, 14, sb);
f.setpixel(13, 14, sb);
f.setpixel(14, 14, sb);
f.setpixel(15, 14, sb);
f.setpixel(16, 14, sb);
f.setpixel(17, 14, sb);
f.setpixel(18, 14, sb);
f.setpixel(19, 14, sb);
f.setpixel(20, 14, sb);
f.setpixel(21, 14, sb);
f.setpixel(22, 14, sb);
f.setpixel(23, 14, sb);
f.setpixel(24, 14, sb);
f.setpixel(25, 14, sb);
f.setpixel(26, 14, sb);
f.setpixel(27, 14, sb);
f.setpixel(28, 14, sb);
f.setpixel(29, 14, sb);
f.setpixel(30, 14, sb);
f.setpixel(31, 14, sb);
f.setpixel(32, 14, sb);
f.setpixel(33, 14, sb);
f.setpixel(34, 14, sb);
f.setpixel(35, 14, sb);
f.setpixel(36, 14, sb);
f.setpixel(37, 14, sb);
f.setpixel(38, 14, sa);
f.setpixel(1, 15, sa);
f.setpixel(2, 15, sb);
f.setpixel(3, 15, sb);
f.setpixel(4, 15, sb);
f.setpixel(5, 15, sb);
f.setpixel(6, 15, sb);
f.setpixel(7, 15, sb);
f.setpixel(8, 15, sb);
f.setpixel(9, 15, sb);
f.setpixel(10, 15, sb);
f.setpixel(11, 15, sb);
f.setpixel(12, 15, sb);
f.setpixel(13, 15, sb);
f.setpixel(14, 15, sb);
f.setpixel(15, 15, sb);
f.setpixel(16, 15, sb);
f.setpixel(17, 15, sb);
f.setpixel(18, 15, sb);
f.setpixel(19, 15, sb);
f.setpixel(20, 15, sb);
f.setpixel(21, 15, sb);
f.setpixel(22, 15, sb);
f.setpixel(23, 15, sb);
f.setpixel(24, 15, sb);
f.setpixel(25, 15, sb);
f.setpixel(26, 15, sb);
f.setpixel(27, 15, sb);
f.setpixel(28, 15, sb);
f.setpixel(29, 15, sb);
f.setpixel(30, 15, sb);
f.setpixel(31, 15, sb);
f.setpixel(32, 15, sb);
f.setpixel(33, 15, sb);
f.setpixel(34, 15, sb);
f.setpixel(35, 15, sb);
f.setpixel(36, 15, sb);
f.setpixel(37, 15, sb);
f.setpixel(38, 15, sa);
f.setpixel(0, 16, sa);
f.setpixel(2, 16, sa);
f.setpixel(3, 16, sb);
f.setpixel(4, 16, sb);
f.setpixel(5, 16, sb);
f.setpixel(6, 16, sb);
f.setpixel(7, 16, sb);
f.setpixel(8, 16, sb);
f.setpixel(9, 16, sb);
f.setpixel(10, 16, sb);
f.setpixel(11, 16, sb);
f.setpixel(12, 16, sb);
f.setpixel(13, 16, sb);
f.setpixel(14, 16, sb);
f.setpixel(15, 16, sb);
f.setpixel(16, 16, sb);
f.setpixel(17, 16, sb);
f.setpixel(18, 16, sb);
f.setpixel(19, 16, sb);
f.setpixel(20, 16, sb);
f.setpixel(21, 16, sb);
f.setpixel(22, 16, sb);
f.setpixel(23, 16, sb);
f.setpixel(24, 16, sb);
f.setpixel(25, 16, sb);
f.setpixel(26, 16, sb);
f.setpixel(27, 16, sb);
f.setpixel(28, 16, sb);
f.setpixel(29, 16, sb);
f.setpixel(30, 16, sb);
f.setpixel(31, 16, sb);
f.setpixel(32, 16, sb);
f.setpixel(33, 16, sb);
f.setpixel(34, 16, sb);
f.setpixel(35, 16, sb);
f.setpixel(36, 16, sb);
f.setpixel(37, 16, sa);
f.setpixel(3, 17, sa);
f.setpixel(4, 17, sb);
f.setpixel(5, 17, sb);
f.setpixel(6, 17, sb);
f.setpixel(7, 17, sb);
f.setpixel(8, 17, sb);
f.setpixel(9, 17, sb);
f.setpixel(10, 17, sb);
f.setpixel(11, 17, sb);
f.setpixel(12, 17, sb);
f.setpixel(13, 17, sb);
f.setpixel(14, 17, sb);
f.setpixel(15, 17, sb);
f.setpixel(16, 17, sb);
f.setpixel(17, 17, sb);
f.setpixel(18, 17, sb);
f.setpixel(19, 17, sb);
f.setpixel(20, 17, sb);
f.setpixel(21, 17, sb);
f.setpixel(22, 17, sb);
f.setpixel(23, 17, sb);
f.setpixel(24, 17, sb);
f.setpixel(25, 17, sb);
f.setpixel(26, 17, sb);
f.setpixel(27, 17, sb);
f.setpixel(28, 17, sb);
f.setpixel(29, 17, sb);
f.setpixel(30, 17, sb);
f.setpixel(31, 17, sb);
f.setpixel(32, 17, sb);
f.setpixel(33, 17, sb);
f.setpixel(34, 17, sb);
f.setpixel(35, 17, sb);
f.setpixel(36, 17, sa);
f.setpixel(4, 18, sa);
f.setpixel(5, 18, sa);
f.setpixel(6, 18, sa);
f.setpixel(7, 18, sa);
f.setpixel(8, 18, sa);
f.setpixel(9, 18, sa);
f.setpixel(10, 18, sa);
f.setpixel(11, 18, sa);
f.setpixel(12, 18, sa);
f.setpixel(13, 18, sa);
f.setpixel(14, 18, sa);
f.setpixel(15, 18, sa);
f.setpixel(16, 18, sa);
f.setpixel(17, 18, sa);
f.setpixel(18, 18, sa);
f.setpixel(19, 18, sa);
f.setpixel(20, 18, sa);
f.setpixel(21, 18, sa);
f.setpixel(22, 18, sa);
f.setpixel(23, 18, sa);
f.setpixel(24, 18, sa);
f.setpixel(25, 18, sa);
f.setpixel(26, 18, sa);
f.setpixel(27, 18, sa);
f.setpixel(28, 18, sa);
f.setpixel(29, 18, sa);
f.setpixel(30, 18, sa);
f.setpixel(31, 18, sa);
f.setpixel(32, 18, sa);
f.setpixel(33, 18, sa);
f.setpixel(34, 18, sa);
f.setpixel(35, 18, sa);
for ( int c = 0; c < 68; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}




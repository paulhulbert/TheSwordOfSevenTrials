/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firedun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import weapons.*;
/**
 *
 * @author Dad
 */
public class flamethrower extends unit {
    
    
    public flamethrower( room currentroom, int x, int y, AI ai )
    {
        super( 60, 0, 4, "flame", x, y, ai, currentroom.getweap2(), currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(32);
        f.setlength(52);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
        
        
        
Color sa = new Color(51,51,51);
Color sb = new Color(102,102,102);
Color sc = new Color(153,153,153);
Color sd = new Color(255,0,0);

//<editor-fold defaultstate="collapsed" desc="build figure">


setpixel(2, 0, sa);
setpixel(3, 0, sa);
setpixel(4, 0, sa);
setpixel(5, 0, sa);
setpixel(6, 0, sa);
setpixel(7, 0, sa);
setpixel(8, 0, sa);
setpixel(9, 0, sa);
setpixel(10, 0, sa);
setpixel(11, 0, sa);
setpixel(12, 0, sa);
setpixel(13, 0, sa);
setpixel(14, 0, sa);
setpixel(15, 0, sa);
setpixel(16, 0, sa);
setpixel(17, 0, sa);
setpixel(18, 0, sa);
setpixel(19, 0, sa);
setpixel(20, 0, sa);
setpixel(0, 1, sb);
setpixel(1, 1, sa);
setpixel(2, 1, sa);
setpixel(3, 1, sc);
setpixel(4, 1, sc);
setpixel(5, 1, sc);
setpixel(6, 1, sc);
setpixel(7, 1, sc);
setpixel(8, 1, sc);
setpixel(9, 1, sc);
setpixel(10, 1, sc);
setpixel(11, 1, sc);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sd);
setpixel(16, 1, sd);
setpixel(17, 1, sd);
setpixel(18, 1, sa);
setpixel(19, 1, sd);
setpixel(20, 1, sa);
setpixel(21, 1, sa);
setpixel(2, 2, sa);
setpixel(3, 2, sa);
setpixel(4, 2, sb);
setpixel(5, 2, sb);
setpixel(6, 2, sb);
setpixel(7, 2, sb);
setpixel(8, 2, sb);
setpixel(9, 2, sb);
setpixel(10, 2, sb);
setpixel(11, 2, sc);
setpixel(12, 2, sa);
setpixel(13, 2, sd);
setpixel(14, 2, sd);
setpixel(15, 2, sd);
setpixel(16, 2, sa);
setpixel(17, 2, sc);
setpixel(18, 2, sa);
setpixel(19, 2, sd);
setpixel(20, 2, sd);
setpixel(21, 2, sa);
setpixel(22, 2, sa);
setpixel(3, 3, sa);
setpixel(4, 3, sa);
setpixel(5, 3, sb);
setpixel(6, 3, sb);
setpixel(7, 3, sb);
setpixel(8, 3, sb);
setpixel(9, 3, sb);
setpixel(10, 3, sb);
setpixel(11, 3, sc);
setpixel(12, 3, sa);
setpixel(13, 3, sd);
setpixel(14, 3, sd);
setpixel(15, 3, sd);
setpixel(16, 3, sa);
setpixel(17, 3, sc);
setpixel(18, 3, sb);
setpixel(19, 3, sa);
setpixel(20, 3, sa);
setpixel(21, 3, sb);
setpixel(22, 3, sa);
setpixel(4, 4, sa);
setpixel(5, 4, sa);
setpixel(6, 4, sb);
setpixel(7, 4, sb);
setpixel(8, 4, sb);
setpixel(9, 4, sb);
setpixel(10, 4, sb);
setpixel(11, 4, sc);
setpixel(12, 4, sa);
setpixel(13, 4, sd);
setpixel(14, 4, sd);
setpixel(15, 4, sd);
setpixel(16, 4, sa);
setpixel(17, 4, sc);
setpixel(18, 4, sb);
setpixel(19, 4, sb);
setpixel(20, 4, sb);
setpixel(21, 4, sb);
setpixel(22, 4, sa);
setpixel(6, 5, sa);
setpixel(7, 5, sa);
setpixel(8, 5, sb);
setpixel(9, 5, sb);
setpixel(10, 5, sb);
setpixel(11, 5, sc);
setpixel(12, 5, sa);
setpixel(13, 5, sa);
setpixel(14, 5, sa);
setpixel(15, 5, sa);
setpixel(16, 5, sa);
setpixel(17, 5, sc);
setpixel(18, 5, sb);
setpixel(19, 5, sb);
setpixel(20, 5, sb);
setpixel(21, 5, sb);
setpixel(22, 5, sa);
setpixel(8, 6, sa);
setpixel(9, 6, sa);
setpixel(10, 6, sb);
setpixel(11, 6, sc);
setpixel(12, 6, sc);
setpixel(13, 6, sc);
setpixel(14, 6, sc);
setpixel(15, 6, sd);
setpixel(16, 6, sc);
setpixel(17, 6, sc);
setpixel(18, 6, sb);
setpixel(19, 6, sa);
setpixel(20, 6, sa);
setpixel(21, 6, sa);
setpixel(22, 6, sa);
setpixel(10, 7, sa);
setpixel(11, 7, sa);
setpixel(12, 7, sb);
setpixel(13, 7, sb);
setpixel(14, 7, sc);
setpixel(15, 7, sd);
setpixel(16, 7, sc);
setpixel(17, 7, sb);
setpixel(18, 7, sb);
setpixel(19, 7, sb);
setpixel(20, 7, sb);
setpixel(21, 7, sb);
setpixel(22, 7, sa);
setpixel(12, 8, sa);
setpixel(13, 8, sa);
setpixel(14, 8, sc);
setpixel(15, 8, sd);
setpixel(16, 8, sc);
setpixel(17, 8, sb);
setpixel(18, 8, sb);
setpixel(19, 8, sb);
setpixel(20, 8, sb);
setpixel(21, 8, sb);
setpixel(22, 8, sa);
setpixel(14, 9, sa);
setpixel(15, 9, sa);
setpixel(16, 9, sa);
setpixel(17, 9, sa);
setpixel(18, 9, sa);
setpixel(19, 9, sa);
setpixel(20, 9, sa);
setpixel(21, 9, sa);
setpixel(22, 9, sa);
setpixel(15, 10, sd);
setpixel(16, 10, sb);
setpixel(17, 10, sb);
setpixel(18, 10, sb);
setpixel(14, 11, sa);
setpixel(15, 11, sa);
setpixel(16, 11, sa);
setpixel(17, 11, sa);
setpixel(18, 11, sa);
setpixel(19, 11, sa);
setpixel(15, 12, sd);
setpixel(16, 12, sd);
setpixel(17, 12, sb);
setpixel(18, 12, sb);
setpixel(4, 13, sa);
setpixel(5, 13, sa);
setpixel(6, 13, sa);
setpixel(7, 13, sa);
setpixel(8, 13, sa);
setpixel(9, 13, sa);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(12, 13, sa);
setpixel(13, 13, sa);
setpixel(14, 13, sa);
setpixel(15, 13, sc);
setpixel(16, 13, sd);
setpixel(17, 13, sd);
setpixel(18, 13, sc);
setpixel(19, 13, sa);
setpixel(20, 13, sa);
setpixel(21, 13, sa);
setpixel(22, 13, sa);
setpixel(23, 13, sa);
setpixel(24, 13, sa);
setpixel(25, 13, sa);
setpixel(26, 13, sa);
setpixel(27, 13, sa);
setpixel(28, 13, sa);
setpixel(29, 13, sa);
setpixel(30, 13, sa);
setpixel(3, 14, sb);
setpixel(4, 14, sa);
setpixel(5, 14, sa);
setpixel(6, 14, sa);
setpixel(7, 14, sa);
setpixel(8, 14, sa);
setpixel(9, 14, sa);
setpixel(10, 14, sa);
setpixel(11, 14, sa);
setpixel(12, 14, sa);
setpixel(13, 14, sa);
setpixel(14, 14, sa);
setpixel(15, 14, sa);
setpixel(16, 14, sc);
setpixel(17, 14, sd);
setpixel(18, 14, sc);
setpixel(19, 14, sc);
setpixel(20, 14, sc);
setpixel(21, 14, sc);
setpixel(22, 14, sc);
setpixel(23, 14, sc);
setpixel(24, 14, sc);
setpixel(25, 14, sc);
setpixel(26, 14, sc);
setpixel(27, 14, sc);
setpixel(28, 14, sc);
setpixel(29, 14, sc);
setpixel(30, 14, sc);
setpixel(3, 15, sb);
setpixel(4, 15, sb);
setpixel(5, 15, sb);
setpixel(6, 15, sb);
setpixel(7, 15, sb);
setpixel(8, 15, sb);
setpixel(9, 15, sb);
setpixel(10, 15, sb);
setpixel(11, 15, sb);
setpixel(12, 15, sb);
setpixel(13, 15, sb);
setpixel(14, 15, sb);
setpixel(15, 15, sb);
setpixel(16, 15, sc);
setpixel(17, 15, sd);
setpixel(18, 15, sd);
setpixel(19, 15, sd);
setpixel(20, 15, sd);
setpixel(21, 15, sd);
setpixel(22, 15, sd);
setpixel(23, 15, sd);
setpixel(24, 15, sd);
setpixel(25, 15, sd);
setpixel(26, 15, sd);
setpixel(27, 15, sd);
setpixel(28, 15, sd);
setpixel(29, 15, sd);
setpixel(30, 15, sd);
setpixel(3, 16, sb);
setpixel(4, 16, sa);
setpixel(5, 16, sa);
setpixel(6, 16, sa);
setpixel(7, 16, sa);
setpixel(8, 16, sa);
setpixel(9, 16, sa);
setpixel(10, 16, sa);
setpixel(11, 16, sa);
setpixel(12, 16, sa);
setpixel(13, 16, sa);
setpixel(14, 16, sa);
setpixel(15, 16, sc);
setpixel(16, 16, sd);
setpixel(17, 16, sd);
setpixel(18, 16, sc);
setpixel(19, 16, sc);
setpixel(20, 16, sc);
setpixel(21, 16, sc);
setpixel(22, 16, sc);
setpixel(23, 16, sc);
setpixel(24, 16, sc);
setpixel(25, 16, sc);
setpixel(26, 16, sc);
setpixel(27, 16, sc);
setpixel(28, 16, sc);
setpixel(29, 16, sc);
setpixel(30, 16, sc);
setpixel(3, 17, sb);
setpixel(4, 17, sa);
setpixel(5, 17, sa);
setpixel(6, 17, sa);
setpixel(7, 17, sa);
setpixel(8, 17, sa);
setpixel(9, 17, sa);
setpixel(10, 17, sa);
setpixel(11, 17, sa);
setpixel(12, 17, sa);
setpixel(13, 17, sa);
setpixel(14, 17, sa);
setpixel(15, 17, sc);
setpixel(16, 17, sd);
setpixel(17, 17, sc);
setpixel(18, 17, sa);
setpixel(19, 17, sa);
setpixel(20, 17, sa);
setpixel(21, 17, sa);
setpixel(22, 17, sa);
setpixel(23, 17, sa);
setpixel(24, 17, sa);
setpixel(25, 17, sa);
setpixel(26, 17, sa);
setpixel(27, 17, sa);
setpixel(28, 17, sa);
setpixel(29, 17, sa);
setpixel(30, 17, sa);
setpixel(4, 18, sa);
setpixel(5, 18, sa);
setpixel(6, 18, sa);
setpixel(7, 18, sa);
setpixel(8, 18, sa);
setpixel(9, 18, sa);
setpixel(10, 18, sa);
setpixel(11, 18, sa);
setpixel(12, 18, sa);
setpixel(13, 18, sa);
setpixel(14, 18, sa);
setpixel(15, 18, sc);
setpixel(16, 18, sd);
setpixel(17, 18, sd);
setpixel(18, 18, sc);
setpixel(19, 18, sa);
setpixel(20, 18, sa);
setpixel(21, 18, sa);
setpixel(22, 18, sa);
setpixel(23, 18, sa);
setpixel(24, 18, sa);
setpixel(25, 18, sa);
setpixel(26, 18, sa);
setpixel(27, 18, sa);
setpixel(28, 18, sa);
setpixel(29, 18, sa);
setpixel(30, 18, sa);
setpixel(10, 19, sb);
setpixel(16, 19, sb);
setpixel(17, 19, sd);
setpixel(18, 19, sb);
setpixel(24, 19, sb);
setpixel(10, 20, sb);
setpixel(16, 20, sb);
setpixel(17, 20, sd);
setpixel(18, 20, sb);
setpixel(24, 20, sb);
setpixel(8, 21, sa);
setpixel(9, 21, sa);
setpixel(10, 21, sa);
setpixel(11, 21, sa);
setpixel(12, 21, sa);
setpixel(13, 21, sa);
setpixel(14, 21, sa);
setpixel(15, 21, sa);
setpixel(16, 21, sa);
setpixel(17, 21, sa);
setpixel(18, 21, sa);
setpixel(19, 21, sa);
setpixel(20, 21, sa);
setpixel(21, 21, sa);
setpixel(22, 21, sa);
setpixel(23, 21, sa);
setpixel(24, 21, sa);
setpixel(25, 21, sa);
setpixel(26, 21, sa);
setpixel(8, 22, sa);
setpixel(9, 22, sb);
setpixel(10, 22, sb);
setpixel(11, 22, sb);
setpixel(12, 22, sb);
setpixel(13, 22, sb);
setpixel(14, 22, sb);
setpixel(15, 22, sb);
setpixel(16, 22, sb);
setpixel(17, 22, sd);
setpixel(18, 22, sb);
setpixel(19, 22, sb);
setpixel(20, 22, sb);
setpixel(21, 22, sb);
setpixel(22, 22, sb);
setpixel(23, 22, sb);
setpixel(24, 22, sb);
setpixel(25, 22, sb);
setpixel(26, 22, sa);
setpixel(8, 23, sa);
setpixel(9, 23, sb);
setpixel(10, 23, sb);
setpixel(11, 23, sb);
setpixel(12, 23, sb);
setpixel(13, 23, sb);
setpixel(14, 23, sb);
setpixel(15, 23, sb);
setpixel(16, 23, sb);
setpixel(17, 23, sd);
setpixel(18, 23, sb);
setpixel(19, 23, sb);
setpixel(20, 23, sb);
setpixel(21, 23, sb);
setpixel(22, 23, sb);
setpixel(23, 23, sb);
setpixel(24, 23, sb);
setpixel(25, 23, sb);
setpixel(26, 23, sa);
setpixel(8, 24, sa);
setpixel(9, 24, sb);
setpixel(10, 24, sb);
setpixel(11, 24, sb);
setpixel(12, 24, sb);
setpixel(13, 24, sb);
setpixel(14, 24, sb);
setpixel(15, 24, sb);
setpixel(16, 24, sb);
setpixel(17, 24, sd);
setpixel(18, 24, sb);
setpixel(19, 24, sb);
setpixel(20, 24, sb);
setpixel(21, 24, sb);
setpixel(22, 24, sb);
setpixel(23, 24, sb);
setpixel(24, 24, sb);
setpixel(25, 24, sb);
setpixel(26, 24, sa);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(10, 25, sa);
setpixel(11, 25, sa);
setpixel(12, 25, sa);
setpixel(13, 25, sa);
setpixel(14, 25, sa);
setpixel(15, 25, sa);
setpixel(16, 25, sa);
setpixel(17, 25, sa);
setpixel(18, 25, sa);
setpixel(19, 25, sa);
setpixel(20, 25, sa);
setpixel(21, 25, sa);
setpixel(22, 25, sa);
setpixel(23, 25, sa);
setpixel(24, 25, sa);
setpixel(25, 25, sa);
setpixel(26, 25, sa);
setpixel(14, 26, sb);
setpixel(15, 26, sb);
setpixel(16, 26, sb);
setpixel(17, 26, sd);
setpixel(18, 26, sb);
setpixel(19, 26, sb);
setpixel(20, 26, sb);
setpixel(21, 26, sb);
setpixel(13, 27, sa);
setpixel(14, 27, sa);
setpixel(15, 27, sa);
setpixel(16, 27, sa);
setpixel(17, 27, sa);
setpixel(18, 27, sa);
setpixel(19, 27, sa);
setpixel(20, 27, sa);
setpixel(21, 27, sa);
setpixel(22, 27, sa);
setpixel(14, 28, sb);
setpixel(15, 28, sb);
setpixel(16, 28, sb);
setpixel(17, 28, sd);
setpixel(18, 28, sb);
setpixel(19, 28, sb);
setpixel(20, 28, sb);
setpixel(21, 28, sb);
setpixel(13, 29, sa);
setpixel(14, 29, sa);
setpixel(15, 29, sa);
setpixel(16, 29, sa);
setpixel(17, 29, sa);
setpixel(18, 29, sa);
setpixel(19, 29, sa);
setpixel(20, 29, sa);
setpixel(21, 29, sa);
setpixel(22, 29, sa);
setpixel(14, 30, sb);
setpixel(15, 30, sb);
setpixel(16, 30, sb);
setpixel(17, 30, sd);
setpixel(18, 30, sb);
setpixel(19, 30, sb);
setpixel(20, 30, sb);
setpixel(21, 30, sb);
setpixel(13, 31, sa);
setpixel(14, 31, sa);
setpixel(15, 31, sa);
setpixel(16, 31, sa);
setpixel(17, 31, sa);
setpixel(18, 31, sa);
setpixel(19, 31, sa);
setpixel(20, 31, sa);
setpixel(21, 31, sa);
setpixel(22, 31, sa);
setpixel(14, 32, sb);
setpixel(15, 32, sb);
setpixel(16, 32, sb);
setpixel(17, 32, sd);
setpixel(18, 32, sb);
setpixel(19, 32, sb);
setpixel(20, 32, sb);
setpixel(21, 32, sb);
setpixel(13, 33, sa);
setpixel(14, 33, sa);
setpixel(15, 33, sa);
setpixel(16, 33, sa);
setpixel(17, 33, sa);
setpixel(18, 33, sa);
setpixel(19, 33, sa);
setpixel(20, 33, sa);
setpixel(21, 33, sa);
setpixel(22, 33, sa);
setpixel(14, 34, sb);
setpixel(15, 34, sb);
setpixel(16, 34, sb);
setpixel(17, 34, sd);
setpixel(18, 34, sb);
setpixel(19, 34, sb);
setpixel(20, 34, sb);
setpixel(21, 34, sb);
setpixel(13, 35, sa);
setpixel(14, 35, sa);
setpixel(15, 35, sa);
setpixel(16, 35, sa);
setpixel(17, 35, sa);
setpixel(18, 35, sa);
setpixel(19, 35, sa);
setpixel(20, 35, sa);
setpixel(21, 35, sa);
setpixel(22, 35, sa);
setpixel(14, 36, sb);
setpixel(15, 36, sb);
setpixel(16, 36, sb);
setpixel(17, 36, sd);
setpixel(18, 36, sb);
setpixel(19, 36, sb);
setpixel(20, 36, sb);
setpixel(21, 36, sb);
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
setpixel(14, 38, sb);
setpixel(15, 38, sb);
setpixel(16, 38, sb);
setpixel(17, 38, sd);
setpixel(18, 38, sb);
setpixel(19, 38, sb);
setpixel(20, 38, sb);
setpixel(21, 38, sb);
setpixel(13, 39, sa);
setpixel(14, 39, sa);
setpixel(15, 39, sa);
setpixel(16, 39, sa);
setpixel(17, 39, sa);
setpixel(18, 39, sa);
setpixel(19, 39, sa);
setpixel(20, 39, sa);
setpixel(21, 39, sa);
setpixel(22, 39, sa);
setpixel(14, 40, sb);
setpixel(15, 40, sb);
setpixel(16, 40, sb);
setpixel(17, 40, sd);
setpixel(18, 40, sb);
setpixel(19, 40, sb);
setpixel(20, 40, sb);
setpixel(21, 40, sb);
setpixel(7, 41, sc);
setpixel(8, 41, sa);
setpixel(9, 41, sa);
setpixel(10, 41, sc);
setpixel(11, 41, sa);
setpixel(12, 41, sa);
setpixel(13, 41, sc);
setpixel(14, 41, sa);
setpixel(15, 41, sa);
setpixel(16, 41, sc);
setpixel(17, 41, sa);
setpixel(18, 41, sa);
setpixel(19, 41, sc);
setpixel(20, 41, sa);
setpixel(21, 41, sa);
setpixel(22, 41, sc);
setpixel(23, 41, sa);
setpixel(24, 41, sa);
setpixel(25, 41, sc);
setpixel(26, 41, sa);
setpixel(27, 41, sa);
setpixel(5, 42, sa);
setpixel(6, 42, sa);
setpixel(7, 42, sc);
setpixel(8, 42, sa);
setpixel(9, 42, sa);
setpixel(10, 42, sc);
setpixel(11, 42, sa);
setpixel(12, 42, sa);
setpixel(13, 42, sc);
setpixel(14, 42, sa);
setpixel(15, 42, sa);
setpixel(16, 42, sc);
setpixel(17, 42, sa);
setpixel(18, 42, sa);
setpixel(19, 42, sc);
setpixel(20, 42, sa);
setpixel(21, 42, sa);
setpixel(22, 42, sc);
setpixel(23, 42, sa);
setpixel(24, 42, sa);
setpixel(25, 42, sc);
setpixel(26, 42, sa);
setpixel(27, 42, sa);
setpixel(28, 42, sc);
setpixel(29, 42, sa);
setpixel(4, 43, sc);
setpixel(5, 43, sa);
setpixel(6, 43, sa);
setpixel(7, 43, sb);
setpixel(8, 43, sb);
setpixel(9, 43, sb);
setpixel(10, 43, sb);
setpixel(11, 43, sb);
setpixel(12, 43, sb);
setpixel(13, 43, sb);
setpixel(14, 43, sb);
setpixel(15, 43, sb);
setpixel(16, 43, sb);
setpixel(17, 43, sb);
setpixel(18, 43, sb);
setpixel(19, 43, sb);
setpixel(20, 43, sb);
setpixel(21, 43, sb);
setpixel(22, 43, sb);
setpixel(23, 43, sb);
setpixel(24, 43, sb);
setpixel(25, 43, sb);
setpixel(26, 43, sb);
setpixel(27, 43, sb);
setpixel(28, 43, sc);
setpixel(29, 43, sa);
setpixel(30, 43, sa);
setpixel(3, 44, sa);
setpixel(4, 44, sc);
setpixel(5, 44, sb);
setpixel(6, 44, sb);
setpixel(7, 44, sb);
setpixel(8, 44, sb);
setpixel(9, 44, sb);
setpixel(10, 44, sb);
setpixel(11, 44, sb);
setpixel(12, 44, sa);
setpixel(13, 44, sa);
setpixel(14, 44, sa);
setpixel(15, 44, sa);
setpixel(16, 44, sb);
setpixel(17, 44, sb);
setpixel(18, 44, sb);
setpixel(19, 44, sa);
setpixel(20, 44, sa);
setpixel(21, 44, sa);
setpixel(22, 44, sa);
setpixel(23, 44, sb);
setpixel(24, 44, sb);
setpixel(25, 44, sb);
setpixel(26, 44, sb);
setpixel(27, 44, sb);
setpixel(28, 44, sb);
setpixel(29, 44, sb);
setpixel(30, 44, sa);
setpixel(31, 44, sa);
setpixel(2, 45, sa);
setpixel(3, 45, sa);
setpixel(4, 45, sb);
setpixel(5, 45, sb);
setpixel(6, 45, sa);
setpixel(7, 45, sa);
setpixel(8, 45, sb);
setpixel(9, 45, sb);
setpixel(10, 45, sb);
setpixel(11, 45, sa);
setpixel(12, 45, sa);
setpixel(13, 45, sc);
setpixel(14, 45, sc);
setpixel(15, 45, sa);
setpixel(16, 45, sa);
setpixel(17, 45, sb);
setpixel(18, 45, sa);
setpixel(19, 45, sa);
setpixel(20, 45, sc);
setpixel(21, 45, sc);
setpixel(22, 45, sa);
setpixel(23, 45, sa);
setpixel(24, 45, sb);
setpixel(25, 45, sb);
setpixel(26, 45, sb);
setpixel(27, 45, sa);
setpixel(28, 45, sa);
setpixel(29, 45, sb);
setpixel(30, 45, sb);
setpixel(31, 45, sc);
setpixel(32, 45, sc);
setpixel(2, 46, sc);
setpixel(3, 46, sc);
setpixel(4, 46, sb);
setpixel(5, 46, sa);
setpixel(6, 46, sd);
setpixel(7, 46, sc);
setpixel(8, 46, sa);
setpixel(9, 46, sb);
setpixel(10, 46, sb);
setpixel(11, 46, sa);
setpixel(12, 46, sc);
setpixel(13, 46, sd);
setpixel(14, 46, sd);
setpixel(15, 46, sc);
setpixel(16, 46, sa);
setpixel(17, 46, sb);
setpixel(18, 46, sa);
setpixel(19, 46, sc);
setpixel(20, 46, sd);
setpixel(21, 46, sd);
setpixel(22, 46, sc);
setpixel(23, 46, sa);
setpixel(24, 46, sb);
setpixel(25, 46, sb);
setpixel(26, 46, sa);
setpixel(27, 46, sd);
setpixel(28, 46, sc);
setpixel(29, 46, sa);
setpixel(30, 46, sb);
setpixel(31, 46, sa);
setpixel(32, 46, sa);
setpixel(2, 47, sa);
setpixel(3, 47, sa);
setpixel(4, 47, sb);
setpixel(5, 47, sa);
setpixel(6, 47, sc);
setpixel(7, 47, sd);
setpixel(8, 47, sa);
setpixel(9, 47, sb);
setpixel(10, 47, sb);
setpixel(11, 47, sa);
setpixel(12, 47, sc);
setpixel(13, 47, sd);
setpixel(14, 47, sd);
setpixel(15, 47, sc);
setpixel(16, 47, sa);
setpixel(17, 47, sb);
setpixel(18, 47, sa);
setpixel(19, 47, sc);
setpixel(20, 47, sd);
setpixel(21, 47, sd);
setpixel(22, 47, sc);
setpixel(23, 47, sa);
setpixel(24, 47, sb);
setpixel(25, 47, sb);
setpixel(26, 47, sa);
setpixel(27, 47, sc);
setpixel(28, 47, sd);
setpixel(29, 47, sa);
setpixel(30, 47, sb);
setpixel(31, 47, sa);
setpixel(32, 47, sa);
setpixel(2, 48, sa);
setpixel(3, 48, sa);
setpixel(4, 48, sb);
setpixel(5, 48, sb);
setpixel(6, 48, sa);
setpixel(7, 48, sa);
setpixel(8, 48, sb);
setpixel(9, 48, sb);
setpixel(10, 48, sb);
setpixel(11, 48, sa);
setpixel(12, 48, sa);
setpixel(13, 48, sc);
setpixel(14, 48, sc);
setpixel(15, 48, sa);
setpixel(16, 48, sa);
setpixel(17, 48, sb);
setpixel(18, 48, sa);
setpixel(19, 48, sa);
setpixel(20, 48, sc);
setpixel(21, 48, sc);
setpixel(22, 48, sa);
setpixel(23, 48, sa);
setpixel(24, 48, sb);
setpixel(25, 48, sb);
setpixel(26, 48, sb);
setpixel(27, 48, sa);
setpixel(28, 48, sa);
setpixel(29, 48, sb);
setpixel(30, 48, sb);
setpixel(31, 48, sc);
setpixel(32, 48, sc);
setpixel(3, 49, sa);
setpixel(4, 49, sc);
setpixel(5, 49, sb);
setpixel(6, 49, sb);
setpixel(7, 49, sb);
setpixel(8, 49, sb);
setpixel(9, 49, sb);
setpixel(10, 49, sb);
setpixel(11, 49, sb);
setpixel(12, 49, sa);
setpixel(13, 49, sa);
setpixel(14, 49, sa);
setpixel(15, 49, sa);
setpixel(16, 49, sb);
setpixel(17, 49, sb);
setpixel(18, 49, sb);
setpixel(19, 49, sa);
setpixel(20, 49, sa);
setpixel(21, 49, sa);
setpixel(22, 49, sa);
setpixel(23, 49, sb);
setpixel(24, 49, sb);
setpixel(25, 49, sb);
setpixel(26, 49, sb);
setpixel(27, 49, sb);
setpixel(28, 49, sb);
setpixel(29, 49, sb);
setpixel(30, 49, sa);
setpixel(31, 49, sa);
setpixel(4, 50, sc);
setpixel(5, 50, sa);
setpixel(6, 50, sa);
setpixel(7, 50, sb);
setpixel(8, 50, sb);
setpixel(9, 50, sb);
setpixel(10, 50, sb);
setpixel(11, 50, sb);
setpixel(12, 50, sb);
setpixel(13, 50, sb);
setpixel(14, 50, sb);
setpixel(15, 50, sb);
setpixel(16, 50, sb);
setpixel(17, 50, sb);
setpixel(18, 50, sb);
setpixel(19, 50, sb);
setpixel(20, 50, sb);
setpixel(21, 50, sb);
setpixel(22, 50, sb);
setpixel(23, 50, sb);
setpixel(24, 50, sb);
setpixel(25, 50, sb);
setpixel(26, 50, sb);
setpixel(27, 50, sb);
setpixel(28, 50, sc);
setpixel(29, 50, sa);
setpixel(30, 50, sa);
setpixel(5, 51, sa);
setpixel(6, 51, sa);
setpixel(7, 51, sc);
setpixel(8, 51, sa);
setpixel(9, 51, sa);
setpixel(10, 51, sc);
setpixel(11, 51, sa);
setpixel(12, 51, sa);
setpixel(13, 51, sc);
setpixel(14, 51, sa);
setpixel(15, 51, sa);
setpixel(16, 51, sc);
setpixel(17, 51, sa);
setpixel(18, 51, sa);
setpixel(19, 51, sc);
setpixel(20, 51, sa);
setpixel(21, 51, sa);
setpixel(22, 51, sc);
setpixel(23, 51, sa);
setpixel(24, 51, sa);
setpixel(25, 51, sc);
setpixel(26, 51, sa);
setpixel(27, 51, sa);
setpixel(28, 51, sc);
setpixel(29, 51, sa);
setpixel(7, 52, sc);
setpixel(8, 52, sa);
setpixel(9, 52, sa);
setpixel(10, 52, sc);
setpixel(11, 52, sa);
setpixel(12, 52, sa);
setpixel(13, 52, sc);
setpixel(14, 52, sa);
setpixel(15, 52, sa);
setpixel(16, 52, sc);
setpixel(17, 52, sa);
setpixel(18, 52, sa);
setpixel(19, 52, sc);
setpixel(20, 52, sa);
setpixel(21, 52, sa);
setpixel(22, 52, sc);
setpixel(23, 52, sa);
setpixel(24, 52, sa);
setpixel(25, 52, sc);
setpixel(26, 52, sa);
setpixel(27, 52, sa);




for ( int c = 0; c < 52; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}




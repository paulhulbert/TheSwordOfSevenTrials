/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class knight extends unit {
    
    public knight( ArrayList<weapon> weaps, room currentroom, int x, int y )
    {
        super( 100, 1, 1, "sword", x, y, new noai(), weaps, currentroom, 100, 140 );
        
        
        buildvil1();
        
    
    }
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(14);
        f.setlength(85);
        

Color sa = new Color(255,0,0);
Color sb = new Color(139,153,165);
Color sc = new Color(102,102,102);
Color sd = new Color(204,204,204);
Color se = new Color(102,51,0);
Color sf = new Color(255,153,0);



//<editor-fold defaultstate="collapsed" desc="build figure">





f.setpixel(2, 0, sa);
f.setpixel(3, 0, sa);
f.setpixel(2, 1, sa);
f.setpixel(3, 1, sa);
f.setpixel(4, 1, sa);
f.setpixel(3, 2, sa);
f.setpixel(4, 2, sa);
f.setpixel(5, 2, sa);
f.setpixel(4, 3, sa);
f.setpixel(5, 3, sa);
f.setpixel(6, 3, sa);
f.setpixel(5, 4, sa);
f.setpixel(6, 4, sa);
f.setpixel(6, 5, sa);
f.setpixel(7, 5, sa);
f.setpixel(2, 6, sb);
f.setpixel(3, 6, sb);
f.setpixel(4, 6, sb);
f.setpixel(5, 6, sb);
f.setpixel(6, 6, sb);
f.setpixel(7, 6, sb);
f.setpixel(8, 6, sb);
f.setpixel(9, 6, sb);
f.setpixel(10, 6, sb);
f.setpixel(1, 7, sb);
f.setpixel(2, 7, sb);
f.setpixel(3, 7, sb);
f.setpixel(4, 7, sb);
f.setpixel(5, 7, sb);
f.setpixel(6, 7, sb);
f.setpixel(7, 7, sb);
f.setpixel(8, 7, sb);
f.setpixel(9, 7, sb);
f.setpixel(10, 7, sb);
f.setpixel(11, 7, sb);
f.setpixel(12, 7, sb);
f.setpixel(1, 8, sb);
f.setpixel(2, 8, sb);
f.setpixel(3, 8, sb);
f.setpixel(4, 8, sb);
f.setpixel(5, 8, sb);
f.setpixel(6, 8, sb);
f.setpixel(7, 8, sb);
f.setpixel(8, 8, sb);
f.setpixel(9, 8, sb);
f.setpixel(10, 8, sb);
f.setpixel(11, 8, sb);
f.setpixel(12, 8, sb);
f.setpixel(1, 9, sb);
f.setpixel(2, 9, sb);
f.setpixel(3, 9, sb);
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
f.setpixel(1, 10, sb);
f.setpixel(2, 10, sb);
f.setpixel(3, 10, sb);
f.setpixel(4, 10, sb);
f.setpixel(5, 10, sb);
f.setpixel(6, 10, sb);
f.setpixel(7, 10, sc);
f.setpixel(8, 10, sc);
f.setpixel(9, 10, sc);
f.setpixel(10, 10, sc);
f.setpixel(11, 10, sc);
f.setpixel(12, 10, sc);
f.setpixel(13, 10, sc);
f.setpixel(1, 11, sb);
f.setpixel(2, 11, sb);
f.setpixel(3, 11, sb);
f.setpixel(4, 11, sb);
f.setpixel(5, 11, sb);
f.setpixel(6, 11, sb);
f.setpixel(7, 11, sb);
f.setpixel(8, 11, sc);
f.setpixel(9, 11, sc);
f.setpixel(10, 11, sc);
f.setpixel(11, 11, sc);
f.setpixel(12, 11, sc);
f.setpixel(13, 11, sc);
f.setpixel(1, 12, sb);
f.setpixel(2, 12, sb);
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
f.setpixel(1, 13, sb);
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
f.setpixel(1, 14, sb);
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
f.setpixel(1, 15, sb);
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
f.setpixel(1, 16, sb);
f.setpixel(2, 16, sb);
f.setpixel(3, 16, sb);
f.setpixel(4, 16, sb);
f.setpixel(5, 16, sb);
f.setpixel(6, 16, sb);
f.setpixel(7, 16, sb);
f.setpixel(8, 16, sb);
f.setpixel(9, 16, sb);
f.setpixel(10, 16, sb);
f.setpixel(11, 16, sc);
f.setpixel(12, 16, sb);
f.setpixel(13, 16, sc);
f.setpixel(1, 17, sb);
f.setpixel(2, 17, sb);
f.setpixel(3, 17, sb);
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
f.setpixel(1, 18, sb);
f.setpixel(2, 18, sb);
f.setpixel(3, 18, sb);
f.setpixel(4, 18, sb);
f.setpixel(5, 18, sb);
f.setpixel(6, 18, sb);
f.setpixel(7, 18, sb);
f.setpixel(8, 18, sb);
f.setpixel(9, 18, sb);
f.setpixel(10, 18, sb);
f.setpixel(11, 18, sc);
f.setpixel(12, 18, sb);
f.setpixel(13, 18, sc);
f.setpixel(2, 19, sb);
f.setpixel(3, 19, sb);
f.setpixel(4, 19, sb);
f.setpixel(5, 19, sb);
f.setpixel(6, 19, sb);
f.setpixel(7, 19, sb);
f.setpixel(8, 19, sb);
f.setpixel(9, 19, sb);
f.setpixel(10, 19, sb);
f.setpixel(11, 19, sb);
f.setpixel(12, 19, sb);
f.setpixel(13, 19, sb);
f.setpixel(2, 20, sb);
f.setpixel(3, 20, sb);
f.setpixel(4, 20, sb);
f.setpixel(5, 20, sb);
f.setpixel(6, 20, sb);
f.setpixel(7, 20, sb);
f.setpixel(8, 20, sb);
f.setpixel(9, 20, sb);
f.setpixel(10, 20, sb);
f.setpixel(11, 20, sb);
f.setpixel(12, 20, sb);
f.setpixel(13, 20, sb);
f.setpixel(2, 21, sc);
f.setpixel(3, 21, sd);
f.setpixel(4, 21, sc);
f.setpixel(5, 21, sd);
f.setpixel(6, 21, sc);
f.setpixel(7, 21, sb);
f.setpixel(8, 21, sb);
f.setpixel(9, 21, sb);
f.setpixel(10, 21, sb);
f.setpixel(11, 21, sb);
f.setpixel(12, 21, sb);
f.setpixel(13, 21, sb);
f.setpixel(2, 22, sd);
f.setpixel(3, 22, sc);
f.setpixel(4, 22, sd);
f.setpixel(5, 22, sc);
f.setpixel(6, 22, sd);
f.setpixel(7, 22, sc);
f.setpixel(8, 22, sd);
f.setpixel(9, 22, sc);
f.setpixel(2, 23, sc);
f.setpixel(3, 23, sc);
f.setpixel(4, 23, sc);
f.setpixel(5, 23, sc);
f.setpixel(6, 23, sb);
f.setpixel(7, 23, sb);
f.setpixel(8, 23, sc);
f.setpixel(9, 23, sd);
f.setpixel(10, 23, sc);
f.setpixel(1, 24, sc);
f.setpixel(2, 24, sc);
f.setpixel(3, 24, sb);
f.setpixel(4, 24, sb);
f.setpixel(5, 24, sc);
f.setpixel(6, 24, sc);
f.setpixel(7, 24, sc);
f.setpixel(8, 24, sb);
f.setpixel(9, 24, sc);
f.setpixel(10, 24, sd);
f.setpixel(11, 24, sc);
f.setpixel(0, 25, sc);
f.setpixel(1, 25, sb);
f.setpixel(2, 25, sb);
f.setpixel(3, 25, sb);
f.setpixel(4, 25, sb);
f.setpixel(5, 25, sb);
f.setpixel(6, 25, sb);
f.setpixel(7, 25, sc);
f.setpixel(8, 25, sb);
f.setpixel(9, 25, sb);
f.setpixel(10, 25, sc);
f.setpixel(11, 25, sd);
f.setpixel(12, 25, sc);
f.setpixel(0, 26, sb);
f.setpixel(1, 26, sb);
f.setpixel(2, 26, sb);
f.setpixel(3, 26, sb);
f.setpixel(4, 26, sb);
f.setpixel(5, 26, sb);
f.setpixel(6, 26, sb);
f.setpixel(7, 26, sc);
f.setpixel(8, 26, sb);
f.setpixel(9, 26, sb);
f.setpixel(10, 26, sb);
f.setpixel(11, 26, sb);
f.setpixel(12, 26, sb);
f.setpixel(0, 27, sb);
f.setpixel(1, 27, sb);
f.setpixel(2, 27, sb);
f.setpixel(3, 27, sb);
f.setpixel(4, 27, sb);
f.setpixel(5, 27, sb);
f.setpixel(6, 27, sb);
f.setpixel(7, 27, sc);
f.setpixel(8, 27, sb);
f.setpixel(9, 27, sb);
f.setpixel(10, 27, sb);
f.setpixel(11, 27, sb);
f.setpixel(12, 27, sb);
f.setpixel(13, 27, sb);
f.setpixel(0, 28, sc);
f.setpixel(1, 28, sb);
f.setpixel(2, 28, sb);
f.setpixel(3, 28, sb);
f.setpixel(4, 28, sb);
f.setpixel(5, 28, sb);
f.setpixel(6, 28, sb);
f.setpixel(7, 28, sb);
f.setpixel(8, 28, sc);
f.setpixel(9, 28, sb);
f.setpixel(10, 28, sb);
f.setpixel(11, 28, sb);
f.setpixel(12, 28, sb);
f.setpixel(13, 28, sb);
f.setpixel(14, 28, sb);
f.setpixel(0, 29, sc);
f.setpixel(1, 29, sb);
f.setpixel(2, 29, sb);
f.setpixel(3, 29, sb);
f.setpixel(4, 29, sb);
f.setpixel(5, 29, sb);
f.setpixel(6, 29, sb);
f.setpixel(7, 29, sb);
f.setpixel(8, 29, sb);
f.setpixel(9, 29, sc);
f.setpixel(10, 29, sb);
f.setpixel(11, 29, sb);
f.setpixel(12, 29, sb);
f.setpixel(13, 29, sb);
f.setpixel(14, 29, sb);
f.setpixel(0, 30, sc);
f.setpixel(1, 30, sb);
f.setpixel(2, 30, sb);
f.setpixel(3, 30, sb);
f.setpixel(4, 30, sb);
f.setpixel(5, 30, sb);
f.setpixel(6, 30, sb);
f.setpixel(7, 30, sb);
f.setpixel(8, 30, sb);
f.setpixel(9, 30, sc);
f.setpixel(10, 30, sc);
f.setpixel(11, 30, sb);
f.setpixel(12, 30, sb);
f.setpixel(13, 30, sb);
f.setpixel(14, 30, sb);
f.setpixel(0, 31, sc);
f.setpixel(1, 31, sb);
f.setpixel(2, 31, sb);
f.setpixel(3, 31, sb);
f.setpixel(4, 31, sb);
f.setpixel(5, 31, sb);
f.setpixel(6, 31, sb);
f.setpixel(7, 31, sb);
f.setpixel(8, 31, sb);
f.setpixel(9, 31, sb);
f.setpixel(10, 31, sc);
f.setpixel(11, 31, sb);
f.setpixel(12, 31, sb);
f.setpixel(13, 31, sb);
f.setpixel(14, 31, sb);
f.setpixel(0, 32, sc);
f.setpixel(1, 32, sb);
f.setpixel(2, 32, sb);
f.setpixel(3, 32, sb);
f.setpixel(4, 32, sb);
f.setpixel(5, 32, sb);
f.setpixel(6, 32, sb);
f.setpixel(7, 32, sb);
f.setpixel(8, 32, sb);
f.setpixel(9, 32, sb);
f.setpixel(10, 32, sc);
f.setpixel(11, 32, sb);
f.setpixel(12, 32, sb);
f.setpixel(13, 32, sb);
f.setpixel(14, 32, sb);
f.setpixel(0, 33, sc);
f.setpixel(1, 33, sc);
f.setpixel(2, 33, sb);
f.setpixel(3, 33, sb);
f.setpixel(4, 33, sb);
f.setpixel(5, 33, sb);
f.setpixel(6, 33, sb);
f.setpixel(7, 33, sb);
f.setpixel(8, 33, sb);
f.setpixel(9, 33, sb);
f.setpixel(10, 33, sc);
f.setpixel(11, 33, sb);
f.setpixel(12, 33, sb);
f.setpixel(13, 33, sb);
f.setpixel(14, 33, sb);
f.setpixel(1, 34, sc);
f.setpixel(2, 34, sb);
f.setpixel(3, 34, sb);
f.setpixel(4, 34, sb);
f.setpixel(5, 34, sb);
f.setpixel(6, 34, sb);
f.setpixel(7, 34, sb);
f.setpixel(8, 34, sb);
f.setpixel(9, 34, sc);
f.setpixel(10, 34, sb);
f.setpixel(11, 34, sb);
f.setpixel(12, 34, sb);
f.setpixel(13, 34, sb);
f.setpixel(14, 34, sb);
f.setpixel(1, 35, sc);
f.setpixel(2, 35, sb);
f.setpixel(3, 35, sb);
f.setpixel(4, 35, sb);
f.setpixel(5, 35, sb);
f.setpixel(6, 35, sb);
f.setpixel(7, 35, sb);
f.setpixel(8, 35, sb);
f.setpixel(9, 35, sc);
f.setpixel(10, 35, sb);
f.setpixel(11, 35, sb);
f.setpixel(12, 35, sb);
f.setpixel(13, 35, sb);
f.setpixel(14, 35, sb);
f.setpixel(1, 36, sc);
f.setpixel(2, 36, sc);
f.setpixel(3, 36, sb);
f.setpixel(4, 36, sb);
f.setpixel(5, 36, sb);
f.setpixel(6, 36, sb);
f.setpixel(7, 36, sb);
f.setpixel(8, 36, sb);
f.setpixel(9, 36, sc);
f.setpixel(10, 36, sb);
f.setpixel(11, 36, sb);
f.setpixel(12, 36, sb);
f.setpixel(13, 36, sb);
f.setpixel(14, 36, sb);
f.setpixel(1, 37, sb);
f.setpixel(2, 37, sc);
f.setpixel(3, 37, sb);
f.setpixel(4, 37, sb);
f.setpixel(5, 37, sb);
f.setpixel(6, 37, sb);
f.setpixel(7, 37, sb);
f.setpixel(8, 37, sb);
f.setpixel(9, 37, sc);
f.setpixel(10, 37, sb);
f.setpixel(11, 37, sb);
f.setpixel(12, 37, sb);
f.setpixel(13, 37, sb);
f.setpixel(1, 38, sb);
f.setpixel(2, 38, sc);
f.setpixel(3, 38, sb);
f.setpixel(4, 38, sb);
f.setpixel(5, 38, sb);
f.setpixel(6, 38, sb);
f.setpixel(7, 38, sb);
f.setpixel(8, 38, sb);
f.setpixel(9, 38, sc);
f.setpixel(10, 38, sb);
f.setpixel(11, 38, sb);
f.setpixel(12, 38, sb);
f.setpixel(13, 38, sb);
f.setpixel(1, 39, sb);
f.setpixel(2, 39, sc);
f.setpixel(3, 39, sb);
f.setpixel(4, 39, sb);
f.setpixel(5, 39, sb);
f.setpixel(6, 39, sb);
f.setpixel(7, 39, sb);
f.setpixel(8, 39, sb);
f.setpixel(9, 39, sc);
f.setpixel(10, 39, sb);
f.setpixel(11, 39, sb);
f.setpixel(12, 39, sb);
f.setpixel(13, 39, sb);
f.setpixel(1, 40, sb);
f.setpixel(2, 40, sc);
f.setpixel(3, 40, sb);
f.setpixel(4, 40, sb);
f.setpixel(5, 40, sb);
f.setpixel(6, 40, sb);
f.setpixel(7, 40, sb);
f.setpixel(8, 40, sb);
f.setpixel(9, 40, sc);
f.setpixel(10, 40, sb);
f.setpixel(11, 40, sb);
f.setpixel(12, 40, sb);
f.setpixel(1, 41, sb);
f.setpixel(2, 41, sb);
f.setpixel(3, 41, sc);
f.setpixel(4, 41, sb);
f.setpixel(5, 41, sb);
f.setpixel(6, 41, sb);
f.setpixel(7, 41, sb);
f.setpixel(8, 41, sb);
f.setpixel(9, 41, sc);
f.setpixel(10, 41, sb);
f.setpixel(11, 41, sb);
f.setpixel(12, 41, sb);
f.setpixel(1, 42, sb);
f.setpixel(2, 42, sb);
f.setpixel(3, 42, sc);
f.setpixel(4, 42, sb);
f.setpixel(5, 42, sb);
f.setpixel(6, 42, sb);
f.setpixel(7, 42, sb);
f.setpixel(8, 42, sb);
f.setpixel(9, 42, sc);
f.setpixel(10, 42, sb);
f.setpixel(11, 42, sb);
f.setpixel(12, 42, sb);
f.setpixel(1, 43, sb);
f.setpixel(2, 43, sb);
f.setpixel(3, 43, sc);
f.setpixel(4, 43, sb);
f.setpixel(5, 43, sb);
f.setpixel(6, 43, sb);
f.setpixel(7, 43, sb);
f.setpixel(8, 43, sb);
f.setpixel(9, 43, sc);
f.setpixel(10, 43, sb);
f.setpixel(11, 43, sb);
f.setpixel(12, 43, sb);
f.setpixel(1, 44, sb);
f.setpixel(2, 44, sb);
f.setpixel(3, 44, sc);
f.setpixel(4, 44, sb);
f.setpixel(5, 44, sb);
f.setpixel(6, 44, sb);
f.setpixel(7, 44, sb);
f.setpixel(8, 44, sb);
f.setpixel(9, 44, sc);
f.setpixel(10, 44, sb);
f.setpixel(11, 44, sb);
f.setpixel(12, 44, sb);
f.setpixel(1, 45, sb);
f.setpixel(2, 45, sb);
f.setpixel(3, 45, sc);
f.setpixel(4, 45, sc);
f.setpixel(5, 45, sc);
f.setpixel(6, 45, sc);
f.setpixel(7, 45, sc);
f.setpixel(8, 45, sc);
f.setpixel(9, 45, sc);
f.setpixel(10, 45, sb);
f.setpixel(11, 45, sb);
f.setpixel(12, 45, sb);
f.setpixel(1, 46, sb);
f.setpixel(2, 46, sb);
f.setpixel(3, 46, sc);
f.setpixel(4, 46, sc);
f.setpixel(5, 46, sc);
f.setpixel(6, 46, sc);
f.setpixel(7, 46, sc);
f.setpixel(8, 46, sc);
f.setpixel(9, 46, sc);
f.setpixel(10, 46, sb);
f.setpixel(11, 46, sb);
f.setpixel(12, 46, sb);
f.setpixel(0, 47, se);
f.setpixel(1, 47, se);
f.setpixel(2, 47, se);
f.setpixel(3, 47, se);
f.setpixel(4, 47, sb);
f.setpixel(5, 47, sc);
f.setpixel(6, 47, sb);
f.setpixel(7, 47, sc);
f.setpixel(8, 47, sb);
f.setpixel(9, 47, sc);
f.setpixel(10, 47, se);
f.setpixel(11, 47, se);
f.setpixel(12, 47, sf);
f.setpixel(13, 47, sf);
f.setpixel(0, 48, se);
f.setpixel(1, 48, se);
f.setpixel(2, 48, se);
f.setpixel(3, 48, se);
f.setpixel(4, 48, sb);
f.setpixel(5, 48, sc);
f.setpixel(6, 48, sb);
f.setpixel(7, 48, sc);
f.setpixel(8, 48, sb);
f.setpixel(9, 48, sc);
f.setpixel(10, 48, se);
f.setpixel(11, 48, se);
f.setpixel(12, 48, sf);
f.setpixel(13, 48, se);
f.setpixel(0, 49, se);
f.setpixel(1, 49, se);
f.setpixel(2, 49, se);
f.setpixel(3, 49, se);
f.setpixel(4, 49, sb);
f.setpixel(5, 49, sc);
f.setpixel(6, 49, sb);
f.setpixel(7, 49, sc);
f.setpixel(8, 49, sb);
f.setpixel(9, 49, sc);
f.setpixel(10, 49, se);
f.setpixel(11, 49, se);
f.setpixel(12, 49, sf);
f.setpixel(13, 49, sf);
f.setpixel(0, 50, sd);
f.setpixel(1, 50, sc);
f.setpixel(2, 50, sd);
f.setpixel(3, 50, sc);
f.setpixel(4, 50, sc);
f.setpixel(5, 50, sc);
f.setpixel(6, 50, sc);
f.setpixel(7, 50, sc);
f.setpixel(8, 50, sc);
f.setpixel(9, 50, sc);
f.setpixel(10, 50, sd);
f.setpixel(11, 50, sc);
f.setpixel(12, 50, sd);
f.setpixel(0, 51, sc);
f.setpixel(1, 51, sd);
f.setpixel(2, 51, sb);
f.setpixel(3, 51, sb);
f.setpixel(4, 51, sc);
f.setpixel(5, 51, sb);
f.setpixel(6, 51, sc);
f.setpixel(7, 51, sb);
f.setpixel(8, 51, sc);
f.setpixel(9, 51, sb);
f.setpixel(10, 51, sc);
f.setpixel(11, 51, sd);
f.setpixel(12, 51, sc);
f.setpixel(0, 52, sd);
f.setpixel(1, 52, sb);
f.setpixel(2, 52, sb);
f.setpixel(3, 52, sb);
f.setpixel(4, 52, sb);
f.setpixel(5, 52, sb);
f.setpixel(6, 52, sb);
f.setpixel(7, 52, sb);
f.setpixel(8, 52, sb);
f.setpixel(9, 52, sb);
f.setpixel(10, 52, sb);
f.setpixel(11, 52, sc);
f.setpixel(12, 52, sd);
f.setpixel(0, 53, sb);
f.setpixel(1, 53, sb);
f.setpixel(2, 53, sb);
f.setpixel(3, 53, sb);
f.setpixel(4, 53, sb);
f.setpixel(5, 53, sb);
f.setpixel(6, 53, sb);
f.setpixel(7, 53, sb);
f.setpixel(8, 53, sb);
f.setpixel(9, 53, sb);
f.setpixel(10, 53, sb);
f.setpixel(11, 53, sb);
f.setpixel(12, 53, sc);
f.setpixel(0, 54, sb);
f.setpixel(1, 54, sb);
f.setpixel(2, 54, sb);
f.setpixel(3, 54, sb);
f.setpixel(4, 54, sb);
f.setpixel(5, 54, sb);
f.setpixel(6, 54, sb);
f.setpixel(7, 54, sb);
f.setpixel(8, 54, sb);
f.setpixel(9, 54, sb);
f.setpixel(10, 54, sb);
f.setpixel(11, 54, sb);
f.setpixel(12, 54, sb);
f.setpixel(0, 55, sb);
f.setpixel(1, 55, sb);
f.setpixel(2, 55, sb);
f.setpixel(3, 55, sb);
f.setpixel(4, 55, sb);
f.setpixel(5, 55, sb);
f.setpixel(6, 55, sb);
f.setpixel(7, 55, sb);
f.setpixel(8, 55, sb);
f.setpixel(9, 55, sb);
f.setpixel(10, 55, sb);
f.setpixel(11, 55, sb);
f.setpixel(12, 55, sb);
f.setpixel(0, 56, sb);
f.setpixel(1, 56, sb);
f.setpixel(2, 56, sb);
f.setpixel(3, 56, sb);
f.setpixel(4, 56, sb);
f.setpixel(5, 56, sb);
f.setpixel(6, 56, sb);
f.setpixel(7, 56, sb);
f.setpixel(8, 56, sb);
f.setpixel(9, 56, sb);
f.setpixel(10, 56, sb);
f.setpixel(11, 56, sb);
f.setpixel(12, 56, sb);
f.setpixel(0, 57, sb);
f.setpixel(1, 57, sb);
f.setpixel(2, 57, sb);
f.setpixel(3, 57, sb);
f.setpixel(4, 57, sb);
f.setpixel(5, 57, sb);
f.setpixel(6, 57, sb);
f.setpixel(7, 57, sb);
f.setpixel(8, 57, sb);
f.setpixel(9, 57, sb);
f.setpixel(10, 57, sb);
f.setpixel(11, 57, sb);
f.setpixel(0, 58, sb);
f.setpixel(1, 58, sb);
f.setpixel(2, 58, sb);
f.setpixel(3, 58, sb);
f.setpixel(4, 58, sb);
f.setpixel(5, 58, sb);
f.setpixel(6, 58, sb);
f.setpixel(7, 58, sb);
f.setpixel(8, 58, sb);
f.setpixel(9, 58, sb);
f.setpixel(10, 58, sb);
f.setpixel(11, 58, sb);
f.setpixel(0, 59, sb);
f.setpixel(1, 59, sb);
f.setpixel(2, 59, sb);
f.setpixel(3, 59, sb);
f.setpixel(4, 59, sb);
f.setpixel(5, 59, sb);
f.setpixel(6, 59, sb);
f.setpixel(7, 59, sb);
f.setpixel(8, 59, sb);
f.setpixel(9, 59, sb);
f.setpixel(10, 59, sb);
f.setpixel(11, 59, sb);
f.setpixel(0, 60, sb);
f.setpixel(1, 60, sb);
f.setpixel(2, 60, sb);
f.setpixel(3, 60, sb);
f.setpixel(4, 60, sb);
f.setpixel(5, 60, sb);
f.setpixel(6, 60, sb);
f.setpixel(7, 60, sb);
f.setpixel(8, 60, sb);
f.setpixel(9, 60, sb);
f.setpixel(10, 60, sb);
f.setpixel(11, 60, sb);
f.setpixel(1, 61, sb);
f.setpixel(2, 61, sb);
f.setpixel(3, 61, sb);
f.setpixel(4, 61, sb);
f.setpixel(5, 61, sb);
f.setpixel(6, 61, sb);
f.setpixel(7, 61, sb);
f.setpixel(8, 61, sb);
f.setpixel(9, 61, sb);
f.setpixel(10, 61, sb);
f.setpixel(1, 62, sb);
f.setpixel(2, 62, sb);
f.setpixel(3, 62, sb);
f.setpixel(4, 62, sb);
f.setpixel(5, 62, sb);
f.setpixel(6, 62, sb);
f.setpixel(7, 62, sb);
f.setpixel(8, 62, sb);
f.setpixel(9, 62, sb);
f.setpixel(10, 62, sb);
f.setpixel(1, 63, sb);
f.setpixel(2, 63, sb);
f.setpixel(3, 63, sb);
f.setpixel(4, 63, sb);
f.setpixel(5, 63, sb);
f.setpixel(6, 63, sb);
f.setpixel(7, 63, sb);
f.setpixel(8, 63, sb);
f.setpixel(9, 63, sb);
f.setpixel(10, 63, sb);
f.setpixel(1, 64, sc);
f.setpixel(2, 64, sb);
f.setpixel(3, 64, sb);
f.setpixel(4, 64, sb);
f.setpixel(5, 64, sb);
f.setpixel(6, 64, sb);
f.setpixel(7, 64, sb);
f.setpixel(8, 64, sb);
f.setpixel(9, 64, sb);
f.setpixel(10, 64, sb);
f.setpixel(1, 65, sd);
f.setpixel(2, 65, sb);
f.setpixel(3, 65, sb);
f.setpixel(4, 65, sb);
f.setpixel(5, 65, sb);
f.setpixel(6, 65, sb);
f.setpixel(7, 65, sb);
f.setpixel(8, 65, sb);
f.setpixel(9, 65, sb);
f.setpixel(10, 65, sc);
f.setpixel(1, 66, sc);
f.setpixel(2, 66, sb);
f.setpixel(3, 66, sb);
f.setpixel(4, 66, sb);
f.setpixel(5, 66, sb);
f.setpixel(6, 66, sb);
f.setpixel(7, 66, sb);
f.setpixel(8, 66, sb);
f.setpixel(9, 66, sc);
f.setpixel(10, 66, sb);
f.setpixel(1, 67, sd);
f.setpixel(2, 67, sc);
f.setpixel(3, 67, sb);
f.setpixel(4, 67, sb);
f.setpixel(5, 67, sb);
f.setpixel(6, 67, sb);
f.setpixel(7, 67, sb);
f.setpixel(8, 67, sb);
f.setpixel(9, 67, sd);
f.setpixel(10, 67, sb);
f.setpixel(11, 67, sb);
f.setpixel(1, 68, sc);
f.setpixel(2, 68, sd);
f.setpixel(3, 68, sc);
f.setpixel(4, 68, sd);
f.setpixel(5, 68, sc);
f.setpixel(6, 68, sd);
f.setpixel(7, 68, sc);
f.setpixel(8, 68, sd);
f.setpixel(9, 68, sb);
f.setpixel(10, 68, sb);
f.setpixel(11, 68, sb);
f.setpixel(1, 69, sd);
f.setpixel(2, 69, sc);
f.setpixel(3, 69, sd);
f.setpixel(4, 69, sc);
f.setpixel(5, 69, sd);
f.setpixel(6, 69, sc);
f.setpixel(7, 69, sd);
f.setpixel(8, 69, sc);
f.setpixel(9, 69, sd);
f.setpixel(10, 69, sb);
f.setpixel(1, 70, sc);
f.setpixel(2, 70, sb);
f.setpixel(3, 70, sb);
f.setpixel(4, 70, sb);
f.setpixel(5, 70, sb);
f.setpixel(6, 70, sb);
f.setpixel(7, 70, sb);
f.setpixel(8, 70, sb);
f.setpixel(9, 70, sc);
f.setpixel(1, 71, sb);
f.setpixel(2, 71, sb);
f.setpixel(3, 71, sb);
f.setpixel(4, 71, sb);
f.setpixel(5, 71, sb);
f.setpixel(6, 71, sb);
f.setpixel(7, 71, sb);
f.setpixel(8, 71, sb);
f.setpixel(9, 71, sb);
f.setpixel(1, 72, sb);
f.setpixel(2, 72, sb);
f.setpixel(3, 72, sb);
f.setpixel(4, 72, sb);
f.setpixel(5, 72, sb);
f.setpixel(6, 72, sb);
f.setpixel(7, 72, sb);
f.setpixel(8, 72, sb);
f.setpixel(9, 72, sb);
f.setpixel(1, 73, sb);
f.setpixel(2, 73, sb);
f.setpixel(3, 73, sb);
f.setpixel(4, 73, sb);
f.setpixel(5, 73, sb);
f.setpixel(6, 73, sb);
f.setpixel(7, 73, sb);
f.setpixel(8, 73, sb);
f.setpixel(9, 73, sb);
f.setpixel(1, 74, sb);
f.setpixel(2, 74, sb);
f.setpixel(3, 74, sb);
f.setpixel(4, 74, sb);
f.setpixel(5, 74, sb);
f.setpixel(6, 74, sb);
f.setpixel(7, 74, sb);
f.setpixel(8, 74, sb);
f.setpixel(9, 74, sb);
f.setpixel(1, 75, sb);
f.setpixel(2, 75, sb);
f.setpixel(3, 75, sb);
f.setpixel(4, 75, sb);
f.setpixel(5, 75, sb);
f.setpixel(6, 75, sb);
f.setpixel(7, 75, sb);
f.setpixel(8, 75, sb);
f.setpixel(9, 75, sb);
f.setpixel(0, 76, se);
f.setpixel(1, 76, se);
f.setpixel(2, 76, se);
f.setpixel(3, 76, se);
f.setpixel(4, 76, se);
f.setpixel(5, 76, se);
f.setpixel(6, 76, se);
f.setpixel(7, 76, se);
f.setpixel(8, 76, se);
f.setpixel(9, 76, se);
f.setpixel(10, 76, se);
f.setpixel(0, 77, se);
f.setpixel(1, 77, se);
f.setpixel(2, 77, se);
f.setpixel(3, 77, se);
f.setpixel(4, 77, se);
f.setpixel(5, 77, se);
f.setpixel(6, 77, se);
f.setpixel(7, 77, se);
f.setpixel(8, 77, se);
f.setpixel(9, 77, se);
f.setpixel(10, 77, se);
f.setpixel(1, 78, se);
f.setpixel(2, 78, se);
f.setpixel(3, 78, se);
f.setpixel(4, 78, se);
f.setpixel(5, 78, se);
f.setpixel(6, 78, se);
f.setpixel(7, 78, se);
f.setpixel(8, 78, se);
f.setpixel(9, 78, se);
f.setpixel(1, 79, se);
f.setpixel(2, 79, se);
f.setpixel(3, 79, se);
f.setpixel(4, 79, se);
f.setpixel(5, 79, se);
f.setpixel(6, 79, se);
f.setpixel(7, 79, se);
f.setpixel(8, 79, se);
f.setpixel(9, 79, se);
f.setpixel(1, 80, se);
f.setpixel(2, 80, se);
f.setpixel(3, 80, se);
f.setpixel(4, 80, se);
f.setpixel(5, 80, se);
f.setpixel(6, 80, se);
f.setpixel(7, 80, se);
f.setpixel(8, 80, se);
f.setpixel(9, 80, se);
f.setpixel(1, 81, se);
f.setpixel(2, 81, se);
f.setpixel(3, 81, se);
f.setpixel(4, 81, se);
f.setpixel(5, 81, se);
f.setpixel(6, 81, se);
f.setpixel(7, 81, se);
f.setpixel(8, 81, se);
f.setpixel(9, 81, se);
f.setpixel(1, 82, se);
f.setpixel(2, 82, se);
f.setpixel(3, 82, se);
f.setpixel(4, 82, se);
f.setpixel(5, 82, se);
f.setpixel(6, 82, se);
f.setpixel(7, 82, se);
f.setpixel(8, 82, se);
f.setpixel(9, 82, se);
f.setpixel(1, 83, se);
f.setpixel(2, 83, se);
f.setpixel(3, 83, se);
f.setpixel(4, 83, se);
f.setpixel(5, 83, se);
f.setpixel(6, 83, se);
f.setpixel(7, 83, se);
f.setpixel(8, 83, se);
f.setpixel(9, 83, se);
f.setpixel(10, 83, se);
f.setpixel(11, 83, se);
f.setpixel(12, 83, se);
f.setpixel(13, 83, se);
f.setpixel(1, 84, se);
f.setpixel(2, 84, se);
f.setpixel(3, 84, se);
f.setpixel(4, 84, se);
f.setpixel(5, 84, se);
f.setpixel(6, 84, se);
f.setpixel(7, 84, se);
f.setpixel(8, 84, se);
f.setpixel(9, 84, se);
f.setpixel(10, 84, se);
f.setpixel(11, 84, se);
f.setpixel(12, 84, se);
f.setpixel(13, 84, se);
f.setpixel(14, 84, se);
f.setpixel(1, 85, se);
f.setpixel(2, 85, se);
f.setpixel(3, 85, se);
f.setpixel(4, 85, se);
f.setpixel(5, 85, se);
f.setpixel(6, 85, se);
f.setpixel(7, 85, se);
f.setpixel(8, 85, se);
f.setpixel(9, 85, se);
f.setpixel(10, 85, se);
f.setpixel(11, 85, se);
f.setpixel(12, 85, se);
f.setpixel(13, 85, se);
f.setpixel(14, 85, se);


//for ( int c = 0; c < 77; c++ ) {
//    f.erasepixel( 0, c );
//}


//</editor-fold>
        
        
    }
    
    
    
}


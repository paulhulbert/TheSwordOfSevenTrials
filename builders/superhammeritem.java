                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import weapons.junglemonkeylizardvine;
/**
 *
 * @author Dad
 */
public class superhammeritem extends unit {
    
    
    
    public superhammeritem( room currentroom, int x, int y )
    {
        super( 5, 0, 4, "blankweap", x, y - 21, new noai(), currentroom.getweap3(), currentroom, 100, 140 );
        
        
        buildvil1();
        
        
        name = "superhammeritem";
        
        
        this.setStatement( "You got the magic hammer!  This weapon has the power to shake the world." );
        this.setName("superhammeritem");
        
        
        trigger spoke1 = new trigger( false, "gotweap_superhammer" );
        
        chattrigger chat1 = new chattrigger( constants.truetrigger, spoke1, true );
        
        chat1.addchat( "You got the magic hammer!  This weapon has the power to shake the world." );
        
        addchattrigger(chat1);
    
    }
    
    
   
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(24);
        f.setlength(61);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        
Color sa = new Color(153,153,153);
Color sb = new Color(255,0,0,200);
Color sc = new Color(102,102,102);





//<editor-fold defaultstate="collapsed" desc="build figure">




setpixel(-1 + 11, 0, sa);
setpixel(-1 + 14, 0, sa);
setpixel(-1 + 10, 1, sa);
setpixel(-1 + 12, 1, sb);
setpixel(-1 + 15, 1, sa);
setpixel(-1 + 4, 2, sb);
setpixel(-1 + 5, 2, sb);
setpixel(-1 + 6, 2, sb);
setpixel(-1 + 7, 2, sb);
setpixel(-1 + 8, 2, sb);
setpixel(-1 + 10, 2, sa);
setpixel(-1 + 13, 2, sb);
setpixel(-1 + 15, 2, sa);
setpixel(-1 + 17, 2, sb);
setpixel(-1 + 18, 2, sb);
setpixel(-1 + 19, 2, sb);
setpixel(-1 + 20, 2, sb);
setpixel(-1 + 21, 2, sb);
setpixel(-1 + 3, 3, sb);
setpixel(-1 + 11, 3, sa);
setpixel(-1 + 12, 3, sa);
setpixel(-1 + 13, 3, sa);
setpixel(-1 + 14, 3, sa);
setpixel(-1 + 22, 3, sb);
setpixel(-1 + 2, 4, sb);
setpixel(-1 + 5, 4, sc);
setpixel(-1 + 6, 4, sc);
setpixel(-1 + 7, 4, sc);
setpixel(-1 + 8, 4, sc);
setpixel(-1 + 9, 4, sc);
setpixel(-1 + 10, 4, sc);
setpixel(-1 + 11, 4, sc);
setpixel(-1 + 12, 4, sc);
setpixel(-1 + 13, 4, sc);
setpixel(-1 + 14, 4, sc);
setpixel(-1 + 15, 4, sc);
setpixel(-1 + 16, 4, sc);
setpixel(-1 + 17, 4, sc);
setpixel(-1 + 18, 4, sc);
setpixel(-1 + 19, 4, sc);
setpixel(-1 + 20, 4, sc);
setpixel(-1 + 23, 4, sb);
setpixel(-1 + 0, 5, sb);
setpixel(-1 + 1, 5, sb);
setpixel(-1 + 4, 5, sc);
setpixel(-1 + 5, 5, sa);
setpixel(-1 + 6, 5, sa);
setpixel(-1 + 7, 5, sa);
setpixel(-1 + 8, 5, sa);
setpixel(-1 + 9, 5, sa);
setpixel(-1 + 10, 5, sa);
setpixel(-1 + 11, 5, sa);
setpixel(-1 + 12, 5, sa);
setpixel(-1 + 13, 5, sa);
setpixel(-1 + 14, 5, sa);
setpixel(-1 + 15, 5, sa);
setpixel(-1 + 16, 5, sa);
setpixel(-1 + 17, 5, sa);
setpixel(-1 + 18, 5, sa);
setpixel(-1 + 19, 5, sa);
setpixel(-1 + 20, 5, sa);
setpixel(-1 + 21, 5, sc);
setpixel(-1 + 24, 5, sb);
setpixel(-1 + 1, 6, sb);
setpixel(-1 + 3, 6, sc);
setpixel(-1 + 4, 6, sa);
setpixel(-1 + 5, 6, sc);
setpixel(-1 + 6, 6, sa);
setpixel(-1 + 7, 6, sc);
setpixel(-1 + 8, 6, sc);
setpixel(-1 + 9, 6, sc);
setpixel(-1 + 10, 6, sc);
setpixel(-1 + 11, 6, sc);
setpixel(-1 + 12, 6, sc);
setpixel(-1 + 13, 6, sc);
setpixel(-1 + 14, 6, sc);
setpixel(-1 + 15, 6, sc);
setpixel(-1 + 16, 6, sc);
setpixel(-1 + 17, 6, sc);
setpixel(-1 + 18, 6, sc);
setpixel(-1 + 19, 6, sa);
setpixel(-1 + 20, 6, sc);
setpixel(-1 + 21, 6, sa);
setpixel(-1 + 22, 6, sc);
setpixel(-1 + 24, 6, sb);
setpixel(-1 + 1, 7, sb);
setpixel(-1 + 3, 7, sc);
setpixel(-1 + 4, 7, sa);
setpixel(-1 + 5, 7, sa);
setpixel(-1 + 6, 7, sc);
setpixel(-1 + 7, 7, sa);
setpixel(-1 + 8, 7, sa);
setpixel(-1 + 9, 7, sa);
setpixel(-1 + 10, 7, sa);
setpixel(-1 + 11, 7, sa);
setpixel(-1 + 12, 7, sa);
setpixel(-1 + 13, 7, sa);
setpixel(-1 + 14, 7, sa);
setpixel(-1 + 15, 7, sa);
setpixel(-1 + 16, 7, sa);
setpixel(-1 + 17, 7, sa);
setpixel(-1 + 18, 7, sa);
setpixel(-1 + 19, 7, sc);
setpixel(-1 + 20, 7, sa);
setpixel(-1 + 21, 7, sa);
setpixel(-1 + 22, 7, sc);
setpixel(-1 + 24, 7, sb);
setpixel(-1 + 1, 8, sb);
setpixel(-1 + 3, 8, sc);
setpixel(-1 + 4, 8, sa);
setpixel(-1 + 5, 8, sc);
setpixel(-1 + 6, 8, sa);
setpixel(-1 + 7, 8, sc);
setpixel(-1 + 8, 8, sc);
setpixel(-1 + 9, 8, sc);
setpixel(-1 + 10, 8, sa);
setpixel(-1 + 11, 8, sa);
setpixel(-1 + 12, 8, sc);
setpixel(-1 + 13, 8, sc);
setpixel(-1 + 14, 8, sa);
setpixel(-1 + 15, 8, sa);
setpixel(-1 + 16, 8, sc);
setpixel(-1 + 17, 8, sc);
setpixel(-1 + 18, 8, sc);
setpixel(-1 + 19, 8, sa);
setpixel(-1 + 20, 8, sc);
setpixel(-1 + 21, 8, sa);
setpixel(-1 + 22, 8, sc);
setpixel(-1 + 24, 8, sb);
setpixel(-1 + 1, 9, sb);
setpixel(-1 + 3, 9, sc);
setpixel(-1 + 4, 9, sa);
setpixel(-1 + 5, 9, sc);
setpixel(-1 + 6, 9, sa);
setpixel(-1 + 7, 9, sc);
setpixel(-1 + 8, 9, sa);
setpixel(-1 + 9, 9, sa);
setpixel(-1 + 10, 9, sa);
setpixel(-1 + 11, 9, sc);
setpixel(-1 + 12, 9, sa);
setpixel(-1 + 13, 9, sa);
setpixel(-1 + 14, 9, sc);
setpixel(-1 + 15, 9, sa);
setpixel(-1 + 16, 9, sa);
setpixel(-1 + 17, 9, sa);
setpixel(-1 + 18, 9, sc);
setpixel(-1 + 19, 9, sa);
setpixel(-1 + 20, 9, sc);
setpixel(-1 + 21, 9, sa);
setpixel(-1 + 22, 9, sc);
setpixel(-1 + 24, 9, sb);
setpixel(-1 + 1, 10, sb);
setpixel(-1 + 3, 10, sc);
setpixel(-1 + 4, 10, sa);
setpixel(-1 + 5, 10, sc);
setpixel(-1 + 6, 10, sa);
setpixel(-1 + 7, 10, sc);
setpixel(-1 + 8, 10, sa);
setpixel(-1 + 9, 10, sa);
setpixel(-1 + 10, 10, sa);
setpixel(-1 + 11, 10, sc);
setpixel(-1 + 12, 10, sa);
setpixel(-1 + 13, 10, sa);
setpixel(-1 + 14, 10, sc);
setpixel(-1 + 15, 10, sa);
setpixel(-1 + 16, 10, sa);
setpixel(-1 + 17, 10, sa);
setpixel(-1 + 18, 10, sc);
setpixel(-1 + 19, 10, sa);
setpixel(-1 + 20, 10, sc);
setpixel(-1 + 21, 10, sa);
setpixel(-1 + 22, 10, sc);
setpixel(-1 + 24, 10, sb);
setpixel(-1 + 1, 11, sb);
setpixel(-1 + 3, 11, sc);
setpixel(-1 + 4, 11, sa);
setpixel(-1 + 5, 11, sc);
setpixel(-1 + 6, 11, sa);
setpixel(-1 + 7, 11, sc);
setpixel(-1 + 8, 11, sc);
setpixel(-1 + 9, 11, sc);
setpixel(-1 + 10, 11, sa);
setpixel(-1 + 11, 11, sa);
setpixel(-1 + 12, 11, sc);
setpixel(-1 + 13, 11, sc);
setpixel(-1 + 14, 11, sa);
setpixel(-1 + 15, 11, sa);
setpixel(-1 + 16, 11, sc);
setpixel(-1 + 17, 11, sc);
setpixel(-1 + 18, 11, sc);
setpixel(-1 + 19, 11, sa);
setpixel(-1 + 20, 11, sc);
setpixel(-1 + 21, 11, sa);
setpixel(-1 + 22, 11, sc);
setpixel(-1 + 24, 11, sb);
setpixel(-1 + 1, 12, sb);
setpixel(-1 + 3, 12, sc);
setpixel(-1 + 4, 12, sa);
setpixel(-1 + 5, 12, sa);
setpixel(-1 + 6, 12, sc);
setpixel(-1 + 7, 12, sa);
setpixel(-1 + 8, 12, sa);
setpixel(-1 + 9, 12, sa);
setpixel(-1 + 10, 12, sa);
setpixel(-1 + 11, 12, sa);
setpixel(-1 + 12, 12, sa);
setpixel(-1 + 13, 12, sa);
setpixel(-1 + 14, 12, sa);
setpixel(-1 + 15, 12, sa);
setpixel(-1 + 16, 12, sa);
setpixel(-1 + 17, 12, sa);
setpixel(-1 + 18, 12, sa);
setpixel(-1 + 19, 12, sc);
setpixel(-1 + 20, 12, sa);
setpixel(-1 + 21, 12, sa);
setpixel(-1 + 22, 12, sc);
setpixel(-1 + 24, 12, sb);
setpixel(-1 + 1, 13, sb);
setpixel(-1 + 3, 13, sc);
setpixel(-1 + 4, 13, sa);
setpixel(-1 + 5, 13, sc);
setpixel(-1 + 6, 13, sa);
setpixel(-1 + 7, 13, sc);
setpixel(-1 + 8, 13, sc);
setpixel(-1 + 9, 13, sc);
setpixel(-1 + 10, 13, sc);
setpixel(-1 + 11, 13, sc);
setpixel(-1 + 12, 13, sc);
setpixel(-1 + 13, 13, sc);
setpixel(-1 + 14, 13, sc);
setpixel(-1 + 15, 13, sc);
setpixel(-1 + 16, 13, sc);
setpixel(-1 + 17, 13, sc);
setpixel(-1 + 18, 13, sc);
setpixel(-1 + 19, 13, sa);
setpixel(-1 + 20, 13, sc);
setpixel(-1 + 21, 13, sa);
setpixel(-1 + 22, 13, sc);
setpixel(-1 + 24, 13, sb);
setpixel(-1 + 1, 14, sb);
setpixel(-1 + 4, 14, sc);
setpixel(-1 + 5, 14, sa);
setpixel(-1 + 6, 14, sa);
setpixel(-1 + 7, 14, sa);
setpixel(-1 + 8, 14, sa);
setpixel(-1 + 9, 14, sa);
setpixel(-1 + 10, 14, sa);
setpixel(-1 + 11, 14, sa);
setpixel(-1 + 12, 14, sa);
setpixel(-1 + 13, 14, sa);
setpixel(-1 + 14, 14, sa);
setpixel(-1 + 15, 14, sa);
setpixel(-1 + 16, 14, sa);
setpixel(-1 + 17, 14, sa);
setpixel(-1 + 18, 14, sa);
setpixel(-1 + 19, 14, sa);
setpixel(-1 + 20, 14, sa);
setpixel(-1 + 21, 14, sc);
setpixel(-1 + 24, 14, sb);
setpixel(-1 + 2, 15, sb);
setpixel(-1 + 5, 15, sc);
setpixel(-1 + 6, 15, sc);
setpixel(-1 + 7, 15, sc);
setpixel(-1 + 8, 15, sc);
setpixel(-1 + 9, 15, sc);
setpixel(-1 + 10, 15, sc);
setpixel(-1 + 11, 15, sc);
setpixel(-1 + 12, 15, sc);
setpixel(-1 + 13, 15, sc);
setpixel(-1 + 14, 15, sc);
setpixel(-1 + 15, 15, sc);
setpixel(-1 + 16, 15, sc);
setpixel(-1 + 17, 15, sc);
setpixel(-1 + 18, 15, sc);
setpixel(-1 + 19, 15, sc);
setpixel(-1 + 20, 15, sc);
setpixel(-1 + 23, 15, sb);
setpixel(-1 + 3, 16, sb);
setpixel(-1 + 11, 16, sa);
setpixel(-1 + 12, 16, sc);
setpixel(-1 + 13, 16, sc);
setpixel(-1 + 14, 16, sa);
setpixel(-1 + 22, 16, sb);
setpixel(-1 + 4, 17, sb);
setpixel(-1 + 5, 17, sb);
setpixel(-1 + 6, 17, sb);
setpixel(-1 + 7, 17, sb);
setpixel(-1 + 8, 17, sb);
setpixel(-1 + 9, 17, sb);
setpixel(-1 + 11, 17, sa);
setpixel(-1 + 12, 17, sc);
setpixel(-1 + 13, 17, sc);
setpixel(-1 + 14, 17, sa);
setpixel(-1 + 16, 17, sb);
setpixel(-1 + 17, 17, sb);
setpixel(-1 + 18, 17, sb);
setpixel(-1 + 19, 17, sb);
setpixel(-1 + 20, 17, sb);
setpixel(-1 + 21, 17, sb);
setpixel(-1 + 11, 18, sa);
setpixel(-1 + 12, 18, sc);
setpixel(-1 + 13, 18, sc);
setpixel(-1 + 14, 18, sa);
setpixel(-1 + 11, 19, sa);
setpixel(-1 + 12, 19, sc);
setpixel(-1 + 13, 19, sc);
setpixel(-1 + 14, 19, sa);
setpixel(-1 + 11, 20, sa);
setpixel(-1 + 12, 20, sc);
setpixel(-1 + 13, 20, sc);
setpixel(-1 + 14, 20, sa);
setpixel(-1 + 11, 21, sa);
setpixel(-1 + 12, 21, sc);
setpixel(-1 + 13, 21, sc);
setpixel(-1 + 14, 21, sa);
setpixel(-1 + 11, 22, sa);
setpixel(-1 + 12, 22, sc);
setpixel(-1 + 13, 22, sc);
setpixel(-1 + 14, 22, sa);
setpixel(-1 + 11, 23, sa);
setpixel(-1 + 12, 23, sc);
setpixel(-1 + 13, 23, sc);
setpixel(-1 + 14, 23, sa);
setpixel(-1 + 11, 24, sa);
setpixel(-1 + 12, 24, sc);
setpixel(-1 + 13, 24, sc);
setpixel(-1 + 14, 24, sa);
setpixel(-1 + 11, 25, sa);
setpixel(-1 + 12, 25, sc);
setpixel(-1 + 13, 25, sc);
setpixel(-1 + 14, 25, sa);
setpixel(-1 + 11, 26, sa);
setpixel(-1 + 12, 26, sc);
setpixel(-1 + 13, 26, sc);
setpixel(-1 + 14, 26, sa);
setpixel(-1 + 11, 27, sa);
setpixel(-1 + 12, 27, sc);
setpixel(-1 + 13, 27, sc);
setpixel(-1 + 14, 27, sa);
setpixel(-1 + 11, 28, sa);
setpixel(-1 + 12, 28, sc);
setpixel(-1 + 13, 28, sc);
setpixel(-1 + 14, 28, sa);
setpixel(-1 + 11, 29, sa);
setpixel(-1 + 12, 29, sc);
setpixel(-1 + 13, 29, sc);
setpixel(-1 + 14, 29, sa);
setpixel(-1 + 11, 30, sa);
setpixel(-1 + 12, 30, sc);
setpixel(-1 + 13, 30, sc);
setpixel(-1 + 14, 30, sa);
setpixel(-1 + 11, 31, sa);
setpixel(-1 + 12, 31, sc);
setpixel(-1 + 13, 31, sc);
setpixel(-1 + 14, 31, sa);
setpixel(-1 + 11, 32, sa);
setpixel(-1 + 12, 32, sc);
setpixel(-1 + 13, 32, sc);
setpixel(-1 + 14, 32, sa);
setpixel(-1 + 11, 33, sa);
setpixel(-1 + 12, 33, sc);
setpixel(-1 + 13, 33, sc);
setpixel(-1 + 14, 33, sa);
setpixel(-1 + 11, 34, sa);
setpixel(-1 + 12, 34, sc);
setpixel(-1 + 13, 34, sc);
setpixel(-1 + 14, 34, sa);
setpixel(-1 + 11, 35, sa);
setpixel(-1 + 12, 35, sc);
setpixel(-1 + 13, 35, sc);
setpixel(-1 + 14, 35, sa);
setpixel(-1 + 11, 36, sa);
setpixel(-1 + 12, 36, sc);
setpixel(-1 + 13, 36, sc);
setpixel(-1 + 14, 36, sa);
setpixel(-1 + 11, 37, sa);
setpixel(-1 + 12, 37, sc);
setpixel(-1 + 13, 37, sc);
setpixel(-1 + 14, 37, sa);
setpixel(-1 + 11, 38, sa);
setpixel(-1 + 12, 38, sc);
setpixel(-1 + 13, 38, sc);
setpixel(-1 + 14, 38, sa);
setpixel(-1 + 11, 39, sa);
setpixel(-1 + 12, 39, sc);
setpixel(-1 + 13, 39, sc);
setpixel(-1 + 14, 39, sa);
setpixel(-1 + 11, 40, sa);
setpixel(-1 + 12, 40, sc);
setpixel(-1 + 13, 40, sc);
setpixel(-1 + 14, 40, sa);
setpixel(-1 + 11, 41, sa);
setpixel(-1 + 12, 41, sc);
setpixel(-1 + 13, 41, sc);
setpixel(-1 + 14, 41, sa);
setpixel(-1 + 11, 42, sa);
setpixel(-1 + 12, 42, sc);
setpixel(-1 + 13, 42, sc);
setpixel(-1 + 14, 42, sa);
setpixel(-1 + 11, 43, sa);
setpixel(-1 + 12, 43, sc);
setpixel(-1 + 13, 43, sc);
setpixel(-1 + 14, 43, sa);
setpixel(-1 + 11, 44, sa);
setpixel(-1 + 12, 44, sc);
setpixel(-1 + 13, 44, sc);
setpixel(-1 + 14, 44, sa);
setpixel(-1 + 11, 45, sa);
setpixel(-1 + 12, 45, sc);
setpixel(-1 + 13, 45, sc);
setpixel(-1 + 14, 45, sa);
setpixel(-1 + 11, 46, sa);
setpixel(-1 + 12, 46, sc);
setpixel(-1 + 13, 46, sc);
setpixel(-1 + 14, 46, sa);
setpixel(-1 + 11, 47, sa);
setpixel(-1 + 12, 47, sc);
setpixel(-1 + 13, 47, sc);
setpixel(-1 + 14, 47, sa);
setpixel(-1 + 11, 48, sa);
setpixel(-1 + 12, 48, sc);
setpixel(-1 + 13, 48, sc);
setpixel(-1 + 14, 48, sa);
setpixel(-1 + 11, 49, sa);
setpixel(-1 + 12, 49, sc);
setpixel(-1 + 13, 49, sc);
setpixel(-1 + 14, 49, sa);
setpixel(-1 + 11, 50, sa);
setpixel(-1 + 12, 50, sc);
setpixel(-1 + 13, 50, sc);
setpixel(-1 + 14, 50, sa);
setpixel(-1 + 11, 51, sa);
setpixel(-1 + 12, 51, sc);
setpixel(-1 + 13, 51, sc);
setpixel(-1 + 14, 51, sa);
setpixel(-1 + 11, 52, sa);
setpixel(-1 + 12, 52, sc);
setpixel(-1 + 13, 52, sc);
setpixel(-1 + 14, 52, sa);
setpixel(-1 + 11, 53, sa);
setpixel(-1 + 12, 53, sc);
setpixel(-1 + 13, 53, sc);
setpixel(-1 + 14, 53, sa);
setpixel(-1 + 11, 54, sa);
setpixel(-1 + 12, 54, sc);
setpixel(-1 + 13, 54, sc);
setpixel(-1 + 14, 54, sa);
setpixel(-1 + 11, 55, sa);
setpixel(-1 + 12, 55, sc);
setpixel(-1 + 13, 55, sc);
setpixel(-1 + 14, 55, sa);
setpixel(-1 + 11, 56, sa);
setpixel(-1 + 12, 56, sc);
setpixel(-1 + 13, 56, sc);
setpixel(-1 + 14, 56, sa);
setpixel(-1 + 11, 57, sa);
setpixel(-1 + 12, 57, sc);
setpixel(-1 + 13, 57, sc);
setpixel(-1 + 14, 57, sa);
setpixel(-1 + 11, 58, sa);
setpixel(-1 + 12, 58, sc);
setpixel(-1 + 13, 58, sc);
setpixel(-1 + 14, 58, sa);
setpixel(-1 + 11, 59, sa);
setpixel(-1 + 12, 59, sc);
setpixel(-1 + 13, 59, sc);
setpixel(-1 + 14, 59, sa);
setpixel(-1 + 11, 60, sa);
setpixel(-1 + 12, 60, sc);
setpixel(-1 + 13, 60, sc);
setpixel(-1 + 14, 60, sa);
setpixel(-1 + 12, 61, sc);
setpixel(-1 + 13, 61, sc);



//for ( int c = 0; c < 61; c++ ) {
//    f.erasepixel( 0, c );
//}


//</editor-fold>
        
        
    }
    
    
    
}




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import weapons.hammerblast;

/**
 *
 * @author Dad
 */
public class superhammer extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
   
    

//private Color sa = new Color(0,100,250,150);
private Color sb = new Color(102,102,102);
private Color sc = new Color(153,153,153);
//private Color sd = new Color(0,102,255);

private Color sa = new Color(250,100,0,150);
private Color sd = new Color(255,102,0);

private unit current;
private boolean finished;
    
    public superhammer( int x, int y, int dir, int momentx, int momenty, unit u )
    {
            
        super( x, y + 6, dir * 1, 5, 17, 70, true, new boolean[10], new Color[10], 54, 27, momentx, momenty, u );
        
        finished = false;
        
        buildpic();
        
        current = u;
        
        name = "superhammer";
        
        startuserdistance = -5;
        enduserdistance = -5;
        
    }
    
    public static int getrange()
    {
        
        return 30;
        
    }
    
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( !finished && !active && current.getcurrentplat() != -1 ) {
        
            if ( fig.getdir() == 1 ) {
                
                current.weapons.add(new hammerblast( fig.getx() + 25, y, 1, 0, 0 ));
                current.weapons.add(new hammerblast( fig.getx() + 75, y, -1, 0, 0 ));
                
            }
            
            if ( fig.getdir() == -1 ) {
                
                current.weapons.add(new hammerblast( fig.getx() - 25, y, -1, 0, 0 ));
                current.weapons.add(new hammerblast( fig.getx() - 75, y, 1, 0, 0 ));
                
            }
            
            current.getroom().shake2();
            current.getroom().shake3();
            
        }
            
            
        finished = !active;
    }
    
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 54 * 27; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        


setpixel(45, 0, sa);
setpixel(45, 1, sa);
setpixel(45, 2, sa);
setpixel(44, 3, sa);
setpixel(45, 3, sa);
setpixel(44, 4, sa);
setpixel(45, 4, sa);
setpixel(46, 4, sa);
setpixel(44, 5, sa);
setpixel(45, 5, sa);
setpixel(46, 5, sa);
setpixel(43, 6, sa);
setpixel(44, 6, sa);
setpixel(45, 6, sa);
setpixel(46, 6, sa);
setpixel(47, 6, sa);
setpixel(43, 7, sa);
setpixel(44, 7, sa);
setpixel(45, 7, sa);
setpixel(46, 7, sa);
setpixel(47, 7, sa);
setpixel(48, 7, sa);
setpixel(42, 8, sa);
setpixel(43, 8, sa);
setpixel(44, 8, sa);
setpixel(45, 8, sa);
setpixel(46, 8, sa);
setpixel(47, 8, sa);
setpixel(48, 8, sa);
setpixel(49, 8, sa);
setpixel(41, 9, sa);
setpixel(42, 9, sa);
setpixel(43, 9, sa);
setpixel(44, 9, sa);
setpixel(45, 9, sa);
setpixel(46, 9, sa);
setpixel(47, 9, sa);
setpixel(48, 9, sa);
setpixel(49, 9, sa);
setpixel(50, 9, sa);
setpixel(40, 10, sa);
setpixel(41, 10, sa);
setpixel(42, 10, sb);
setpixel(43, 10, sb);
setpixel(44, 10, sb);
setpixel(45, 10, sb);
setpixel(46, 10, sb);
setpixel(47, 10, sb);
setpixel(48, 10, sb);
setpixel(49, 10, sb);
setpixel(50, 10, sa);
setpixel(51, 10, sa);
setpixel(40, 11, sa);
setpixel(41, 11, sb);
setpixel(42, 11, sc);
setpixel(43, 11, sc);
setpixel(44, 11, sc);
setpixel(45, 11, sd);
setpixel(46, 11, sd);
setpixel(47, 11, sc);
setpixel(48, 11, sc);
setpixel(49, 11, sc);
setpixel(50, 11, sb);
setpixel(51, 11, sa);
setpixel(40, 12, sa);
setpixel(41, 12, sb);
setpixel(42, 12, sc);
setpixel(43, 12, sd);
setpixel(44, 12, sc);
setpixel(45, 12, sc);
setpixel(46, 12, sc);
setpixel(47, 12, sc);
setpixel(48, 12, sd);
setpixel(49, 12, sc);
setpixel(50, 12, sb);
setpixel(51, 12, sa);
setpixel(40, 13, sa);
setpixel(41, 13, sb);
setpixel(42, 13, sc);
setpixel(43, 13, sc);
setpixel(44, 13, sd);
setpixel(45, 13, sc);
setpixel(46, 13, sc);
setpixel(47, 13, sd);
setpixel(48, 13, sc);
setpixel(49, 13, sc);
setpixel(50, 13, sb);
setpixel(51, 13, sa);
setpixel(33, 14, sb);
setpixel(34, 14, sb);
setpixel(35, 14, sb);
setpixel(40, 14, sa);
setpixel(41, 14, sb);
setpixel(42, 14, sc);
setpixel(43, 14, sc);
setpixel(44, 14, sd);
setpixel(45, 14, sc);
setpixel(46, 14, sc);
setpixel(47, 14, sd);
setpixel(48, 14, sc);
setpixel(49, 14, sc);
setpixel(50, 14, sb);
setpixel(51, 14, sa);
setpixel(31, 15, sb);
setpixel(32, 15, sb);
setpixel(36, 15, sb);
setpixel(40, 15, sb);
setpixel(41, 15, sb);
setpixel(42, 15, sc);
setpixel(43, 15, sd);
setpixel(44, 15, sc);
setpixel(45, 15, sc);
setpixel(46, 15, sc);
setpixel(47, 15, sc);
setpixel(48, 15, sd);
setpixel(49, 15, sc);
setpixel(50, 15, sb);
setpixel(51, 15, sa);
setpixel(53, 15, sb);
setpixel(30, 16, sb);
setpixel(34, 16, sb);
setpixel(37, 16, sb);
setpixel(38, 16, sb);
setpixel(39, 16, sb);
setpixel(40, 16, sa);
setpixel(41, 16, sb);
setpixel(42, 16, sc);
setpixel(43, 16, sd);
setpixel(44, 16, sc);
setpixel(45, 16, sc);
setpixel(46, 16, sc);
setpixel(47, 16, sc);
setpixel(48, 16, sd);
setpixel(49, 16, sc);
setpixel(50, 16, sb);
setpixel(51, 16, sa);
setpixel(52, 16, sb);
setpixel(54, 16, sa);
setpixel(1, 17, sc);
setpixel(2, 17, sc);
setpixel(3, 17, sc);
setpixel(4, 17, sc);
setpixel(5, 17, sc);
setpixel(6, 17, sc);
setpixel(7, 17, sc);
setpixel(8, 17, sc);
setpixel(9, 17, sc);
setpixel(10, 17, sc);
setpixel(11, 17, sc);
setpixel(12, 17, sc);
setpixel(13, 17, sc);
setpixel(14, 17, sc);
setpixel(15, 17, sc);
setpixel(16, 17, sc);
setpixel(17, 17, sc);
setpixel(18, 17, sc);
setpixel(19, 17, sc);
setpixel(20, 17, sc);
setpixel(21, 17, sc);
setpixel(22, 17, sc);
setpixel(23, 17, sc);
setpixel(24, 17, sc);
setpixel(25, 17, sc);
setpixel(26, 17, sc);
setpixel(27, 17, sc);
setpixel(28, 17, sc);
setpixel(29, 17, sc);
setpixel(30, 17, sc);
setpixel(31, 17, sc);
setpixel(32, 17, sc);
setpixel(33, 17, sc);
setpixel(34, 17, sc);
setpixel(35, 17, sc);
setpixel(36, 17, sc);
setpixel(37, 17, sc);
setpixel(38, 17, sc);
setpixel(39, 17, sc);
setpixel(40, 17, sc);
setpixel(41, 17, sb);
setpixel(42, 17, sc);
setpixel(43, 17, sd);
setpixel(44, 17, sc);
setpixel(45, 17, sd);
setpixel(46, 17, sd);
setpixel(47, 17, sc);
setpixel(48, 17, sd);
setpixel(49, 17, sc);
setpixel(50, 17, sb);
setpixel(51, 17, sc);
setpixel(52, 17, sb);
setpixel(53, 17, sa);
setpixel(0, 18, sc);
setpixel(1, 18, sb);
setpixel(2, 18, sb);
setpixel(3, 18, sb);
setpixel(4, 18, sb);
setpixel(5, 18, sb);
setpixel(6, 18, sb);
setpixel(7, 18, sb);
setpixel(8, 18, sb);
setpixel(9, 18, sb);
setpixel(10, 18, sb);
setpixel(11, 18, sb);
setpixel(12, 18, sb);
setpixel(13, 18, sb);
setpixel(14, 18, sb);
setpixel(15, 18, sb);
setpixel(16, 18, sb);
setpixel(17, 18, sb);
setpixel(18, 18, sb);
setpixel(19, 18, sb);
setpixel(20, 18, sb);
setpixel(21, 18, sb);
setpixel(22, 18, sb);
setpixel(23, 18, sb);
setpixel(24, 18, sb);
setpixel(25, 18, sb);
setpixel(26, 18, sb);
setpixel(27, 18, sb);
setpixel(28, 18, sb);
setpixel(29, 18, sb);
setpixel(30, 18, sb);
setpixel(31, 18, sb);
setpixel(32, 18, sb);
setpixel(33, 18, sb);
setpixel(34, 18, sb);
setpixel(35, 18, sb);
setpixel(36, 18, sb);
setpixel(37, 18, sb);
setpixel(38, 18, sb);
setpixel(39, 18, sb);
setpixel(40, 18, sc);
setpixel(41, 18, sb);
setpixel(42, 18, sc);
setpixel(43, 18, sc);
setpixel(44, 18, sd);
setpixel(45, 18, sc);
setpixel(46, 18, sc);
setpixel(47, 18, sd);
setpixel(48, 18, sc);
setpixel(49, 18, sc);
setpixel(50, 18, sb);
setpixel(51, 18, sc);
setpixel(52, 18, sc);
setpixel(54, 18, sa);
setpixel(1, 19, sc);
setpixel(2, 19, sc);
setpixel(3, 19, sc);
setpixel(4, 19, sc);
setpixel(5, 19, sc);
setpixel(6, 19, sc);
setpixel(7, 19, sc);
setpixel(8, 19, sc);
setpixel(9, 19, sc);
setpixel(10, 19, sc);
setpixel(11, 19, sc);
setpixel(12, 19, sc);
setpixel(13, 19, sc);
setpixel(14, 19, sc);
setpixel(15, 19, sc);
setpixel(16, 19, sc);
setpixel(17, 19, sc);
setpixel(18, 19, sc);
setpixel(19, 19, sc);
setpixel(20, 19, sc);
setpixel(21, 19, sc);
setpixel(22, 19, sc);
setpixel(23, 19, sc);
setpixel(24, 19, sc);
setpixel(25, 19, sc);
setpixel(26, 19, sc);
setpixel(27, 19, sc);
setpixel(28, 19, sc);
setpixel(29, 19, sc);
setpixel(30, 19, sc);
setpixel(31, 19, sc);
setpixel(32, 19, sc);
setpixel(33, 19, sc);
setpixel(34, 19, sc);
setpixel(35, 19, sc);
setpixel(36, 19, sc);
setpixel(37, 19, sc);
setpixel(38, 19, sc);
setpixel(39, 19, sc);
setpixel(40, 19, sc);
setpixel(41, 19, sb);
setpixel(42, 19, sc);
setpixel(43, 19, sd);
setpixel(44, 19, sc);
setpixel(45, 19, sd);
setpixel(46, 19, sd);
setpixel(47, 19, sc);
setpixel(48, 19, sd);
setpixel(49, 19, sc);
setpixel(50, 19, sb);
setpixel(51, 19, sc);
setpixel(52, 19, sb);
setpixel(53, 19, sa);
setpixel(30, 20, sb);
setpixel(34, 20, sb);
setpixel(37, 20, sb);
setpixel(38, 20, sb);
setpixel(39, 20, sb);
setpixel(40, 20, sa);
setpixel(41, 20, sb);
setpixel(42, 20, sc);
setpixel(43, 20, sd);
setpixel(44, 20, sc);
setpixel(45, 20, sc);
setpixel(46, 20, sc);
setpixel(47, 20, sc);
setpixel(48, 20, sd);
setpixel(49, 20, sc);
setpixel(50, 20, sb);
setpixel(51, 20, sa);
setpixel(52, 20, sb);
setpixel(54, 20, sa);
setpixel(31, 21, sb);
setpixel(32, 21, sb);
setpixel(36, 21, sb);
setpixel(40, 21, sb);
setpixel(41, 21, sb);
setpixel(42, 21, sc);
setpixel(43, 21, sd);
setpixel(44, 21, sc);
setpixel(45, 21, sc);
setpixel(46, 21, sc);
setpixel(47, 21, sc);
setpixel(48, 21, sd);
setpixel(49, 21, sc);
setpixel(50, 21, sb);
setpixel(51, 21, sa);
setpixel(53, 21, sb);
setpixel(33, 22, sb);
setpixel(34, 22, sb);
setpixel(35, 22, sb);
setpixel(40, 22, sa);
setpixel(41, 22, sb);
setpixel(42, 22, sc);
setpixel(43, 22, sc);
setpixel(44, 22, sd);
setpixel(45, 22, sc);
setpixel(46, 22, sc);
setpixel(47, 22, sd);
setpixel(48, 22, sc);
setpixel(49, 22, sc);
setpixel(50, 22, sb);
setpixel(51, 22, sa);
setpixel(40, 23, sa);
setpixel(41, 23, sb);
setpixel(42, 23, sc);
setpixel(43, 23, sc);
setpixel(44, 23, sd);
setpixel(45, 23, sc);
setpixel(46, 23, sc);
setpixel(47, 23, sd);
setpixel(48, 23, sc);
setpixel(49, 23, sc);
setpixel(50, 23, sa);
setpixel(51, 23, sa);
setpixel(40, 24, sa);
setpixel(41, 24, sb);
setpixel(42, 24, sc);
setpixel(43, 24, sd);
setpixel(44, 24, sc);
setpixel(45, 24, sc);
setpixel(46, 24, sc);
setpixel(47, 24, sc);
setpixel(48, 24, sd);
setpixel(49, 24, sc);
setpixel(50, 24, sa);
setpixel(51, 24, sa);
setpixel(40, 25, sa);
setpixel(41, 25, sb);
setpixel(42, 25, sc);
setpixel(43, 25, sc);
setpixel(44, 25, sc);
setpixel(45, 25, sd);
setpixel(46, 25, sd);
setpixel(47, 25, sc);
setpixel(48, 25, sc);
setpixel(49, 25, sc);
setpixel(50, 25, sb);
setpixel(51, 25, sa);
setpixel(41, 26, sa);
setpixel(42, 26, sb);
setpixel(43, 26, sb);
setpixel(44, 26, sb);
setpixel(45, 26, sb);
setpixel(46, 26, sb);
setpixel(47, 26, sb);
setpixel(48, 26, sb);
setpixel(49, 26, sb);
setpixel(50, 26, sa);
setpixel(42, 27, sa);
setpixel(43, 27, sa);
setpixel(44, 27, sa);
setpixel(45, 27, sa);
setpixel(46, 27, sa);
setpixel(47, 27, sa);
setpixel(48, 27, sa);
setpixel(49, 27, sa);




for ( int c = 0; c < 27; c++ ) {
    fig.erasepixel( 0, c );
}




        
        
        
        
        
        
    }
    
    
    
}

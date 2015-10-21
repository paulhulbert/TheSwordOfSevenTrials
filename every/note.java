/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class note extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    
    public note( int x, int y, String note_name )
    {
            
        super( x, y + 20, 0, 0, 0, 30, false, new boolean[10], new Color[10], 15, 6, 0, 0 );
        
        
        
        
sa = new Color(204,0,0);
sb = new Color(200,131,64);
sc = new Color(199,140,83);

        
        
        buildpic();
        
        
        name = note_name;
        
        
    }
    
    @Override
    public void step( Graphics g )
    {
        if ( !active ) {
            return;
        }
        paintit(g);
        
    }
    
    public static int getrange()
    {
        
        return 10;
        
    }
    
    
    private void buildpic()
    {
        for ( int c = 0; c < 15 * 6; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        





















setpixel(4, 0, sa);
setpixel(5, 0, sa);
setpixel(8, 0, sa);
setpixel(9, 0, sa);
setpixel(6, 1, sa);
setpixel(7, 1, sa);
setpixel(1, 2, sb);
setpixel(2, 2, sc);
setpixel(3, 2, sc);
setpixel(4, 2, sc);
setpixel(5, 2, sc);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sc);
setpixel(9, 2, sc);
setpixel(10, 2, sc);
setpixel(11, 2, sc);
setpixel(12, 2, sb);
setpixel(13, 2, sb);
setpixel(14, 2, sb);
setpixel(0, 3, sb);
setpixel(1, 3, sc);
setpixel(2, 3, sc);
setpixel(3, 3, sc);
setpixel(4, 3, sc);
setpixel(5, 3, sa);
setpixel(6, 3, sa);
setpixel(7, 3, sc);
setpixel(8, 3, sc);
setpixel(9, 3, sc);
setpixel(10, 3, sc);
setpixel(11, 3, sc);
setpixel(12, 3, sc);
setpixel(13, 3, sb);
setpixel(14, 3, sc);
setpixel(15, 3, sb);
setpixel(0, 4, sb);
setpixel(1, 4, sc);
setpixel(2, 4, sc);
setpixel(3, 4, sc);
setpixel(4, 4, sc);
setpixel(5, 4, sa);
setpixel(6, 4, sa);
setpixel(7, 4, sc);
setpixel(8, 4, sc);
setpixel(9, 4, sc);
setpixel(10, 4, sc);
setpixel(11, 4, sc);
setpixel(12, 4, sc);
setpixel(13, 4, sb);
setpixel(14, 4, sb);
setpixel(15, 4, sb);
setpixel(0, 5, sb);
setpixel(1, 5, sc);
setpixel(2, 5, sc);
setpixel(3, 5, sc);
setpixel(4, 5, sc);
setpixel(5, 5, sa);
setpixel(6, 5, sa);
setpixel(7, 5, sc);
setpixel(8, 5, sc);
setpixel(9, 5, sc);
setpixel(10, 5, sc);
setpixel(11, 5, sc);
setpixel(12, 5, sc);
setpixel(13, 5, sb);
setpixel(14, 5, sc);
setpixel(15, 5, sb);
setpixel(1, 6, sb);
setpixel(2, 6, sb);
setpixel(3, 6, sb);
setpixel(4, 6, sc);
setpixel(5, 6, sc);
setpixel(6, 6, sa);
setpixel(7, 6, sa);
setpixel(8, 6, sc);
setpixel(9, 6, sc);
setpixel(10, 6, sc);
setpixel(11, 6, sc);
setpixel(12, 6, sc);
setpixel(13, 6, sc);
setpixel(14, 6, sb);
        
        
        
        
        
        
    }
    
    
    
}

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
public class halfmadesword extends weapon {
    
    private boolean[] paintable = new boolean[14000];
    private Color[] pic = new Color[14000];
    
    private Color sa;
    
    private Color sb;
    private Color sc;
    private Color sd;
    private Color se;
    private Color sf;
    
    public halfmadesword( int x, int y, int dir, int momentx, int momenty )
    {
            
        super( x, y + 20, 0, 0, 0, 30, false, new boolean[10], new Color[10], 22, 79, 0, 0 );
        
        
        sb = new Color(255,204,0);
        sc = new Color(255,0,0);
        sd = new Color(255,170,13);
        se = new Color(153,51,0);
        
        buildpic();
        
        
        name = "halfmadesword";
        
        trigger gothalfsword = new trigger( false, "every_halfmadesword_gothalfsword" );
        
        setonhittrigger( gothalfsword, true );
        
        
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
        for ( int c = 0; c < 22 * 79; c++ ) {
            paintable[c] = false;
            pic[c] = null;
        }
        
        setpic(paintable, pic);
        
        
        
        


















setpixel(15, 32, sb);
setpixel(16, 32, sc);
setpixel(15, 33, sb);
setpixel(14, 34, sb);
setpixel(15, 34, sb);
setpixel(14, 35, sb);
setpixel(15, 35, sb);
setpixel(16, 35, sb);
setpixel(17, 35, sb);
setpixel(19, 35, sb);
setpixel(13, 36, sb);
setpixel(14, 36, sb);
setpixel(15, 36, sd);
setpixel(16, 36, sb);
setpixel(17, 36, sb);
setpixel(18, 36, sb);
setpixel(14, 37, sb);
setpixel(15, 37, sb);
setpixel(16, 37, sc);
setpixel(17, 37, sb);
setpixel(18, 37, sb);
setpixel(19, 37, sb);
setpixel(14, 38, se);
setpixel(15, 38, sb);
setpixel(16, 38, sb);
setpixel(17, 38, sc);
setpixel(18, 38, sb);
setpixel(19, 38, sb);
setpixel(22, 38, sd);
setpixel(13, 39, se);
setpixel(14, 39, se);
setpixel(15, 39, se);
setpixel(16, 39, sb);
setpixel(17, 39, sb);
setpixel(18, 39, sc);
setpixel(19, 39, sb);
setpixel(20, 39, sb);
setpixel(21, 39, sb);
setpixel(22, 39, sb);
setpixel(12, 40, se);
setpixel(13, 40, se);
setpixel(14, 40, se);
setpixel(15, 40, se);
setpixel(16, 40, se);
setpixel(17, 40, sb);
setpixel(18, 40, sb);
setpixel(19, 40, sb);
setpixel(20, 40, sb);
setpixel(11, 41, se);
setpixel(12, 41, se);
setpixel(13, 41, se);
setpixel(14, 41, se);
setpixel(15, 41, se);
setpixel(18, 41, sb);
setpixel(10, 42, sb);
setpixel(11, 42, sb);
setpixel(12, 42, se);
setpixel(13, 42, se);
setpixel(14, 42, se);
setpixel(10, 43, sb);
setpixel(11, 43, sb);
setpixel(12, 43, sb);
setpixel(13, 43, se);
setpixel(10, 44, sc);
setpixel(11, 44, sb);
setpixel(12, 44, sb);

for ( int c = 0; c < 79; c++ ) {
    fig.erasepixel( 0, c );
}
        
        
        
        
        
        
    }
    
    
    
}

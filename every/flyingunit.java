/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.util.ArrayList;
import java.awt.Graphics;

/**
 *
 * @author Dad
 */
public class flyingunit extends unit {
    
    public flyingunit( int life, int def, int speed, String Weapon, int x, int y, AI ai, ArrayList<weapon> weapons, room currentroom, int width, int length )
    {
        super( life, def, speed, Weapon, x, y, ai, weapons, currentroom, width, length );
        
        jumpvar = 10;
    
    }
    
    
    @Override
    public void jump()
    {
        if ( y > 5 + this.getfig().getlength() ) {
            momenty = -1 * jumpvar;
        }
    }
    
    @Override
    public double speedvar()
    {
        if ( current.getpersonon(this) == -1 ) {
            return 2;
        }
        else {
            return .5;
        }
        
    }
    
    @Override
    public double speedupvar()
    {
        if ( current.getpersonon(this) == -1 ) {
            return 1;
        }
        else {
            return .5;
        }
        
    }
    
    @Override
    public void step( Graphics g )
    {
        if ( current.getpersonon(this) != -1 ) {
            momentx = 0;
        }
        super.step(g);
        
    }
    
    
    @Override
    public void faller()
    {
        if ( momenty > 20 ) {
            momenty = 20;
        }
        
        if ( currentplat == -1 && momenty >= 0 ) {
            
            
            
            for ( int c = 0; c < momenty / 2; c++ ) {
                y += 1;
                if ( current.getpersonon(this) != -1 ) {
                    momenty = 0;
                    currentplat = current.getpersonon(this);
                    break;
                }
            }
            if ( currentplat == -1 ) {
                momenty += 1;
            }
        }
        
        
        if ( momenty < 0 ) {
            y += momenty;
            momenty += 1;
        }
        
        
        
    }
    
}

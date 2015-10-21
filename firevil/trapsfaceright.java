/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class trapsfaceright extends room2 {  
    
    
    
    
    public trapsfaceright( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform mover = new platform( 300, 300, 20, 5, Color.RED, true, this.getweap3());
        
        mover.makestep(2, 0, 300, "blankweap");
        
        
        this.addplatform( mover );
        
        firelauncher trap1 = new firelauncher( this.getweap3(), this, 321, 291 );
        
        trap1.settarget(mainchar);
        
        this.addneutral(trap1);
        
        firelauncherup trap2 = new firelauncherup( this.getweap3(), this, 821, 491 );
        
        trap2.settarget(mainchar);
        
        this.addneutral(trap2);
        
        
    }
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        int x = terrain.get(1).getx1();
        
        x += terrain.get(1).getx2() - terrain.get(1).getx1();
        
        neutral.get(1).setx( x );
        
        
    }
    
}


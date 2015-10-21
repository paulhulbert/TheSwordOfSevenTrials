/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class icetrap extends room2 {  
    
    
    
    public icetrap( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        
        platform base1 = new hardblock( -50, 250, 1450, 50, Color.GRAY, Color.BLACK, false, this.getweap3() );
        
        this.addplatform(base1);
        
        
    }
    
    @Override
    public int getmomentxvar()
    {
        return 1;
    }
    
    @Override
    public double getspeedupvar()
    {
        return 0.5;
    }
    
    @Override
    public double getspeedvar()
    {
        return 1;
    }
    
    
    @Override
    public void extrainit()
    {
//        weapon spearleft = new icicleup( 500, 500, -1 );
        
        weap3.add(new icicleup( 300, 500, -1 ));
        weap3.add(new icicleup( 500, 500, -1 ));
        weap3.add(new icicleup( 700, 500, -1 ));
        weap3.add(new icicleup( 900, 500, -1 ));
        
        weap3.add(new icicledown( 400, 300, -1 ));
        weap3.add(new icicledown( 600, 300, -1 ));
        weap3.add(new icicledown( 800, 300, -1 ));
        weap3.add(new icicledown( 1000, 300, -1 ));
        
        
        
        
    }
    
}


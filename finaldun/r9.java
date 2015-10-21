/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r9 extends room2 {  
    
    
    
    private ladder ladder1;
    
    
    public r9( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, finaldungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w );
        
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        
        ladder1 = new ladderup( 550, 500, constants.gobdunfloor, this.weap3, this, constants.speardunladder );
        
        
        this.addplatform(ladder1);
        
        
        
        
        weap2.add( new heart( 345, 450, 1, 0, 0 ) );
        weap2.add( new heart( 365, 450, 1, 0, 0 ) );
        weap2.add( new heart( 385, 450, 1, 0, 0 ) );
        weap2.add( new heart( 325, 450, 1, 0, 0 ) );
        
        
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        weap2.add( new heart( 345, 450, 1, 0, 0 ) );
        weap2.add( new heart( 365, 450, 1, 0, 0 ) );
        weap2.add( new heart( 385, 450, 1, 0, 0 ) );
        weap2.add( new heart( 325, 450, 1, 0, 0 ) );
        
    }
    
}



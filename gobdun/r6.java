/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobdun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r6 extends room2 { 
    
    
    
    public r6( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        platform wall1 = new wall_left( constants.gobdunfloor, this.getweap3() );
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( constants.gobdunfloor, weap3 );
        this.addplatform(ceiling1);
        
//        button b1 = new button(100, 500, 20, Color.RED, weap3, w.mainlock_1, this, false);
//        
//        this.addplatform(b1);
        
        button b1 = new button( -100, 500, 20, Color.RED, weap3, w.mainlock_1, this, false );
        
        addplatform( b1 );
        
        button b2 = new button( 200, 500, 20, Color.GREEN, weap3, w.mainlock_2, this, false );
        
        addplatform( b2 );
        
        
        AI ai1 = new constantattack();
        ai1.settarget(mainchar);
        unit bag1 = new builders.floatinggreenball(this, 500, 300 - 1, ai1);
        this.addbag(bag1);
        
    }
    
    
    
    
}




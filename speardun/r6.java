/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;


import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class r6 extends room2 {  
    
    
    public r6( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, speardungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        platform wall2 = new every.wall_right(base, weap3);
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( constants.speardunfloor, weap3 );
        this.addplatform(ceiling1);
        
        button b1 = new every.button(1100, 500, 20, Color.YELLOW, weap3, w.r3_lock, this, false);
        
        this.addplatform(b1);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new spearlauncher(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
    }
    
    
    
    
}




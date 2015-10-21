/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobvil;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r8 extends room {  
    
    
    
    private ladder ladder1;
    
    
    public r8( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        
        platform wall2 = new wall_right( base, weap3 );
        
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        ladder1 = new ladderup( 700, 500, Color.darkGray, this.weap3, this, "LIGHT_GRAY" );
        
        
        
        this.addplatform(ladder1);
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.gobwarrior(this, 100, 500 - 1, ai1);
        this.addbag(bag1);
        
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
}


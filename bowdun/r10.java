/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowdun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r10 extends room {  
    
    
    
    private ladder ladder1;
    private ladder ladder2;
    private ladder ladder3;
    
    
    public r10( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        ladder1 = new ladderup( 200, 500, constants.bowdunfloor, this.weap3, this, constants.bowdunladder );
        
        ladder2 = new ladderdown( 900, 500, constants.bowdunfloor, this.weap3, this, constants.bowdunladder );
        
        ladder3 = new ladderup( 1100, 500, constants.bowdunfloor, this.weap3, this, constants.bowdunladder );
        
        ladder3.setWarpx(400);
        
        ladder1.setWarpx(1000);
        
        this.addplatform(ladder3);
        
        this.addplatform(ladder2);
        
        this.addplatform(ladder1);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.ZoraZapper(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder2.setWarppoint(targ);
    }
    
    public void setladder2( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    public void setladder3( room targ )
    {
        ladder3.setWarppoint(targ);
    }
    
    
    
}




